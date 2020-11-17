from json import load


def main():
    with open('database.json', 'r') as file:
        cities = load(file)

    with open('abstract.csv', 'w') as file:
        file.write(
            'City ID,City,State,Population,Cost of Living Index,Rent,Housing Cost\n')

        for i in range(len(cities)):
            city = cities[i]
            if 'National Average' in city['citynamestate']:
                continue
            data = (i + 1, city['citynamestate'].split(',')[0], city['statecode'],
                    city['population'], city['costoflivingindex'], city['rent'],
                    city['averagehouse'])
            file.write('%d, "%s","%s",%d,%.1f,%d,%d\n' % data)


main()