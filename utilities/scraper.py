from json import load

with open('database.json', 'r') as file:
    cities = load(file)

historical_housing = []
historical_population = []
historical_income = []
historical_weather = []

# cities table
file = open('data.sql', 'w')
file.write('BEGIN;\n')
file.write('DELETE FROM historical_weather;\n')
file.write('DELETE FROM historical_income;\n')
file.write('DELETE FROM population_history;\n')
file.write('DELETE FROM historical_home_cost;\n')
file.write('DELETE FROM CITIES;\n')
file.write(
    'INSERT INTO CITIES (CITY_ID, CREATED_BY, CREATED_DATE,  LAST_MODIFIED_BY,\n' +
    ' LAST_MODIFIED_DATE, ACA_STATUS, AVERAGE_AGE, AVERAGE_HOME_COST,\n' +
    ' CITY_NAME, COST_OF_LIVING_INDEX, FPIS, HOUSEHOLD_INCOME, LATITUDE,\n' +
    ' LONGITUDE, POPULATION, POPULATION_DENSITY, RENT, STATE_CODE, TIMEZONE,\n' +
    ' IMAGE_URL, WEBSITE)\n' +
    'VALUES')
for i in range(1, len(cities) + 1):
    city = cities[i - 1]
    city_name = city['citynamestate'].split(',')[0]
    url = city['wikiimgurl'][:254]
    insert_data = (city['acastatus'], city['averageage'], city['averagehouse'],
                   city_name, city['costoflivingindex'], city['fpis'],
                   city['householdincome'], city['latitude'], city['logitude'],
                   city['population'], city['densitymisq'] / 2.58999,
                   city['rent'], city['statecode'], city['timezone'], url,
                   city['website'])
    insert = "'%s', %f, %f,\n'%s', %f, '%s',\n%f, %f, %f, %f, %f,\n%f, '%s', '%s', '%s', '%s')" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert)

    # store home price history
    months = city['historicalaveragehouse']
    for month in months:
        month['city_id'] = i
    historical_housing.extend(months)

    # store population history
    years = city['populationhist']
    for year in years:
        year['city_id'] = i
    historical_population.extend(years)

    # store income history
    years = city['historicalincome']
    for year in years:
        year['city_id'] = i
    historical_income.extend(years)

    # store weather history
    months = city['historicalweather']
    for month in months:
        month['city_id'] = i
    historical_weather.extend(months)
file.write(';\n')

# historical house prices
file.write(
    'INSERT INTO historical_home_cost (house_id, CREATED_BY, CREATED_DATE,\n'
    'LAST_MODIFIED_BY, LAST_MODIFIED_DATE, city_id, year, month, home_cost)\n'
    'VALUES')
for i in range(1, len(historical_housing) + 1):
    housing = historical_housing[i - 1]
    insert_data = (housing['city_id'], housing['year'], housing['month'],
                   housing['housingcost'])
    insert = "%i, %i, %i, %f)" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert)
file.write(';\n')

# historical population
file.write(
    'INSERT INTO population_history (population_id, CREATED_BY, CREATED_DATE,\n'
    'LAST_MODIFIED_BY, LAST_MODIFIED_DATE, city_id, year, population)\n'
    'VALUES')
for i in range(1, len(historical_population) + 1):
    population = historical_population[i - 1]
    insert_data = (population['city_id'], population['year'],
                   population['pop'])
    insert = "%i, %i, %i)" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert)
file.write(';\n')

# historical income
file.write(
    'INSERT INTO historical_income (income_id, CREATED_BY, CREATED_DATE,\n'
    'LAST_MODIFIED_BY, LAST_MODIFIED_DATE, city_id, year, individual_income,'
    'household_income)\n'
    'VALUES')
for i in range(1, len(historical_income) + 1):
    income = historical_income[i - 1]
    insert_data = (income['city_id'], income['year'],
                   income['individualincome'],
                   income['householdincome'])
    insert = "%i, %i, %f, %f)" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert)
file.write(';\n')

# historical weather
file.write(
    'INSERT INTO historical_weather (weather_id, CREATED_BY, CREATED_DATE,\n'
    'LAST_MODIFIED_BY, LAST_MODIFIED_DATE, city_id, month, precipitation,'
    'temperature)\n'
    'VALUES')
for i in range(1, len(historical_weather) + 1):
    weather = historical_weather[i - 1]
    insert_data = (weather['city_id'], weather['month'],
                   weather['precipitation'],
                   weather['temperature'])
    insert = "%i, '%s', %f, %f)" % insert_data
    if i > 1:
        file.write(',\n')
    file.write('(%i, CURRENT_USER, CURRENT_TIMESTAMP, CURRENT_USER, CURRENT_TIMESTAMP,\n' % i)
    file.write(insert)
file.write(';\n')

file.write('COMMIT;\n')
file.close()
