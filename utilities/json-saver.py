from requests import get
from json import dump

cities_data = get(
    'https://labs27-c-citrics-api.herokuapp.com/cities/allid').json()

cities = []
for city in cities_data:
    cities.append(
        get('https://labs27-c-citrics-api.herokuapp.com/cities/city/%d' %
            city['cityid']).json())
    thisCity = cities[-1]
    url = thisCity['wikiimgurl']
    if type(url) != type('') or len(url) > 254:
        thisCity['wikiimgurl'] = \
            'https://creazilla-store.fra1.digitaloceanspaces.com/' + \
            'three_d_models/64104/generic-skyscrapers-3d-model-11682-md.png'
    print(len(cities))

with open('database.json', 'w') as file:
    dump(cities, file, indent=1)
