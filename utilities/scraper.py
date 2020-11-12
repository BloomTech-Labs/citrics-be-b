from json import load

with open('database.json', 'r') as file:
    cities = load(file)

file = open('data.sql', 'w')
file.write(
    'INSERT INTO CITIES (CITY_ID, CREATED_BY, CREATED_DATE,  LAST_MODIFIED_BY,\n' +
    ' LAST_MODIFIED_DATE, ACA_STATUS, AVERAGE_AGE, AVERAGE_HOME_COST,\n' +
    ' CITY_NAME, COST_OF_LIVING_INDEX, FPIS, HOUSEHOLD_INCOME, LATITUDE,\n' +
    ' LONGITUDE, POPULATION, POPULATION_DENSITY, RENT, STATE_CODE, TIMEZONE,\n' +
    ' WEBSITE)\n' +
    'VALUES')
for i in range(1, len(cities) + 1):
    print(i)
    city = cities[i - 1]
    city_name = city['citynamestate'].split(',')[0]
    url = city['wikiimgurl'][:254]
    insert_data =(city['acastatus'], city['averageage'], city['averagehouse'],
                  city_name, city['costoflivingindex'], city['fpis'],
                  city['householdincome'], city['latitude'], city['logitude'], city['population'], city['densitymisq'] / 2.58999,
                  city['rent'], city['statecode'], city['timezone'], url)
    insert = "'%s', %f, %f,\n'%s', %f, '%s',\n%f, %f, %f, %f, %f,\n%f, '%s', '%s', '%s')" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%d, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert);
file.write(';\n')

file.close()
