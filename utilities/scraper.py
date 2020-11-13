from json import load

with open('database.json', 'r') as file:
    cities = load(file)

historical_housing = []

# cities table
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
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert);

    # historical house prices store
    months = city['historicalaveragehouse']
    for month in months:
        month['city_id'] = i
    historical_housing.extend(months)
file.write(';\n')

# historical house prices
file.write(
    'INSERT INTO historical_home_cost (house_id, CREATED_BY, CREATED_DATE,\n'
    'LAST_MODIFIED_BY, LAST_MODIFIED_DATE, city_id, year, month, home_cost)\n'
    'VALUES')
for i in range(1, len(historical_housing) + 1):
    housing = historical_housing[i - 1]
    insert_data =(housing['city_id'], housing['year'], housing['month'],
                  housing['housingcost'])
    insert = "%i, %i, %i, %f)" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert);
file.write(';\n')

file.close()
