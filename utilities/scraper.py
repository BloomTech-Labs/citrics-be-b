from requests import get

cities_data = get(
    'https://labs27-c-citrics-api.herokuapp.com/cities/allid').json()

cities = []
for city in cities_data:
    cities.append(
        get('https://labs27-c-citrics-api.herokuapp.com/cities/city/%d' %
            city['cityid']).json())

file = open('data.sql', 'w')
file.write(
    'INSERT INTO CITIES (CITY_ID, CREATED_BY, CREATED_DATE,  LAST_MODIFIED_BY,\n' +
    ' LAST_MODIFIED_DATE, ACA_STATUS, AVERAGE_AGE, AVERAGE_HOME_COST,\n' +
    ' CITY_NAME, COST_OF_LIVING_INDEX, FPIS, HOUSEHOLD_INCOME, LATITUDE,\n' +
    ' LONGITUDE, POPULATION, POPULATION_DENSITY, RENT, STATE_CODE, TIMEZONE,\n' +
    ' WEBSITE)\n' +
    'VALUES')
for i in range(1, len(cities) + 1):
    city = cities[i - 1]
    city_name = city['citynamestate'].split(',')[0]
    if i > 1:
        file.write(',\n')
    file.write('(%d, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write("'%s', %f, %f,\n'%s', %f, '%s',\n%f, %f, %f, %f, %f,\n%f, '%s', '%s', '%s')" %
               (city['acastatus'], city['averageage'], city['averagehouse'],
      city_name, city['costoflivingindex'], city['fpis'],
      city['householdincome'], city['latitude'], city['logitude'], city['population'], city['densitykmsq'],
      city['rent'], city['statecode'], city['timezone'], city['wikiimgurl']))
file.write(';\n')

file.close()
