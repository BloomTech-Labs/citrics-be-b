# Citrics

A city metrics app to help find the perfect city for you!

### Key Features

- View useful metrics, including population, age, cost of living, income, and more!
- Currently features information on 1200+ US cities, with more to come
- Select up to three cities to compare side-by-side
- *Future predictions coming soon*


## Base URL
- https://labs27-c-citrics-api.herokuapp.com/

## Swagger Documentation
- https://labs27-c-citrics-api.herokuapp.com/swagger-ui.html#/


![MIT](https://img.shields.io/packagist/l/doctrine/orm.svg)

# Contributors


| [Andrew Shields](https://github.com/HeftyB)                                                                                                                     | [Shane Kaestner](https://github.com/Kandelonius)                                                                                                                     |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [<img src="https://avatars3.githubusercontent.com/u/35949416?s=400&u=7d3ab47f8239c19d37a3935da65243f528bfe199&v=4" width = "200" />](https://github.com/HeftyB) | [<img src="https://avatars3.githubusercontent.com/u/51350138?s=400&u=6b628f9ff0bd99e94cd663a6121da26582a09847&v=4" width = "200" />](https://github.com/Kandelonius) |
|                                       [<img src="https://github.com/favicon.ico" width="15"> ](https://github.com/HeftyB)                                       |                                       [<img src="https://github.com/favicon.ico" width="15"> ](https://github.com/Kandelonius)                                       |
|                     [ <img src="https://static.licdn.com/sc/h/al2o9zrvru7aqj8e1x2rzsrca" width="15"> ](https://www.linkedin.com/in/heftyb/)                     |                    [ <img src="https://static.licdn.com/sc/h/al2o9zrvru7aqj8e1x2rzsrca" width="15"> ](https://www.linkedin.com/in/shane-kaestner/)                   |

<br>

# APIs

#### [Front End](https://main.d2g6fc634fmr68.amplifyapp.com) deployed via AWS Amplify

#### [Back End](https://labs27-c-citrics-api.herokuapp.com) deployed via Heroku

#### [Data Science](http://citrics-ds.eba-jvvvymfn.us-east-1.elasticbeanstalk.com) deployed via AWS Elastic Beanstalk

# Contributing

When contributing to this repository, please first discuss the change you wish to make via issue, email, or any other method with the owners of this repository before making a change.

Please note we have a [code of conduct](./code_of_conduct.md). Please follow it in all your interactions with the project.

## Issue/Bug Request

**If you are having an issue with the existing project code, please submit a bug report under the following guidelines:**

- Check first to see if your issue has already been reported.
- Check to see if the issue has recently been fixed by attempting to reproduce the issue using the latest master branch in the repository.
- Create a live example of the problem.
- Submit a detailed bug report including your environment & browser, steps to reproduce the issue, actual and expected outcomes, where you believe the issue is originating from, and any potential solutions you have considered.

### Feature Requests

We would love to hear from you about new features which would improve this app and further the aims of our project. Please provide as much detail and information as possible to show us why you think your new feature should be implemented.

### Pull Requests

If you have developed a patch, bug fix, or new feature that would improve this app, please submit a pull request. It is best to communicate your ideas with the developers first before investing a great deal of time into a pull request to ensure that it will mesh smoothly with the project.

Remember that this project is licensed under the MIT license, and by submitting a pull request, you agree that your work will be, too.

### Pull Request Guidelines

- Update the README.md with details of changes to the interface, including new plist variables, exposed ports, useful file locations and container parameters.
- Ensure that your code conforms to our existing code conventions and test coverage.
- Include the relevant issue number, if applicable.
- You may merge the Pull Request in once you have the sign-off of two other developers, or if you do not have permission to do that, you may request the second reviewer to merge it for you.


## Tech Stack

#### JAVA
#### SPRING BOOT
#### JUNIT5

## Documentation

See [Front End Documentation](https://github.com/Lambda-School-Labs/Labs27-C-Citrics-FE) for details regarding the Front end of our project.

See [Data Science Documentation](https://github.com/Lambda-School-Labs/Labs27-C-Citrics-DS) for details regarding the Data Science of our project.

## Architecture

[Architecture Diagram](https://whimsical.com/BrfVjttdRNhp7sbVNgKKNu)

<details>
<summary>http://localhost:2019/cities/city/4</summary>

```JSON
{
    "cityid": 29401,
    "citynamestate": "West Sacramento, California",
    "statecode": "CA",
    "timezone": "UTC-8 Pacific",
    "latitude": 38.5804609,
    "logitude": -121.530234,
    "fpis": null,
    "gnis": null,
    "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Sacramento-river-bank-pyramid-20.4.jpg/500px-Sacramento-river-bank-pyramid-20.4.jpg",
    "website": "www.cityofwestsacramento.org",
    "population": 53512.0,
    "densitymisq": 2492.73,
    "densitykmsq": 962.46,
    "averageage": 33.7,
    "householdincome": 63558.0,
    "individualincome": 29468.0,
    "averagehouse": 353559.0,
    "rent": 987.0,
    "costoflivingindex": null,
    "acastatus": null,
    "zipcodes": [
        {
            "code": "95691"
        },
        {
            "code": "95605"
        }
    ],
    "counties": [
        {
            "name": "Yolo"
        }
    ],
    "populationhist": [
        {
            "pop": 48744.0
        },
        {
            "pop": 49106.0
        },
        {
            "pop": 49528.0
        },
        {
            "pop": 49978.0
        },
        {
            "pop": 51637.0
        },
        {
            "pop": 52431.0
        },
        {
            "pop": 52933.0
        },
        {
            "pop": 53304.0
        },
        {
            "pop": 53601.0
        },
        {
            "pop": 53519.0
        }
    ],
    "historicalincome": [
        {
            "year": 2019,
            "individualincome": 51676,
            "householdincome": 80440
        },
        {
            "year": 2018,
            "individualincome": 48563,
            "householdincome": 75277
        },
        {
            "year": 2017,
            "individualincome": 46599,
            "householdincome": 71805
        },
        {
            "year": 2016,
            "individualincome": 44115,
            "householdincome": 67739
        },
        {
            "year": 2015,
            "individualincome": 42068,
            "householdincome": 64500
        },
        {
            "year": 2014,
            "individualincome": 40842,
            "householdincome": 61933
        },
        {
            "year": 2013,
            "individualincome": 40319,
            "householdincome": 60190
        },
        {
            "year": 2012,
            "individualincome": 39504,
            "householdincome": 58328
        },
        {
            "year": 2011,
            "individualincome": 37584,
            "householdincome": 57287
        },
        {
            "year": 2010,
            "individualincome": 38460,
            "householdincome": 57708
        }
    ],
    "historicalaveragehouse": [
        {
            "year": 2010,
            "month": 1,
            "housingcost": 229647
        },
        {
            "year": 2010,
            "month": 2,
            "housingcost": 228281
        },
        {
            "year": 2010,
            "month": 3,
            "housingcost": 229655
        },
        {
            "year": 2010,
            "month": 4,
            "housingcost": 230539
        },
        {
            "year": 2010,
            "month": 5,
            "housingcost": 231481
        },
        {
            "year": 2010,
            "month": 6,
            "housingcost": 231910
        },
        {
            "year": 2010,
            "month": 7,
            "housingcost": 232365
        },
        {
            "year": 2010,
            "month": 8,
            "housingcost": 231236
        },
        {
            "year": 2010,
            "month": 9,
            "housingcost": 228548
        },
        {
            "year": 2010,
            "month": 10,
            "housingcost": 226145
        },
        {
            "year": 2010,
            "month": 11,
            "housingcost": 222545
        },
        {
            "year": 2010,
            "month": 12,
            "housingcost": 221547
        },
        {
            "year": 2011,
            "month": 1,
            "housingcost": 218879
        },
        {
            "year": 2011,
            "month": 2,
            "housingcost": 217172
        },
        {
            "year": 2011,
            "month": 3,
            "housingcost": 214844
        },
        {
            "year": 2011,
            "month": 4,
            "housingcost": 212277
        },
        {
            "year": 2011,
            "month": 5,
            "housingcost": 208565
        },
        {
            "year": 2011,
            "month": 6,
            "housingcost": 204453
        },
        {
            "year": 2011,
            "month": 7,
            "housingcost": 202420
        },
        {
            "year": 2011,
            "month": 8,
            "housingcost": 200549
        },
        {
            "year": 2011,
            "month": 9,
            "housingcost": 198729
        },
        {
            "year": 2011,
            "month": 10,
            "housingcost": 195867
        },
        {
            "year": 2011,
            "month": 11,
            "housingcost": 193920
        },
        {
            "year": 2011,
            "month": 12,
            "housingcost": 191294
        },
        {
            "year": 2012,
            "month": 1,
            "housingcost": 190284
        },
        {
            "year": 2012,
            "month": 2,
            "housingcost": 189533
        },
        {
            "year": 2012,
            "month": 3,
            "housingcost": 189679
        },
        {
            "year": 2012,
            "month": 4,
            "housingcost": 190025
        },
        {
            "year": 2012,
            "month": 5,
            "housingcost": 190864
        },
        {
            "year": 2012,
            "month": 6,
            "housingcost": 191531
        },
        {
            "year": 2012,
            "month": 7,
            "housingcost": 191307
        },
        {
            "year": 2012,
            "month": 8,
            "housingcost": 191465
        },
        {
            "year": 2012,
            "month": 9,
            "housingcost": 193339
        },
        {
            "year": 2012,
            "month": 10,
            "housingcost": 196241
        },
        {
            "year": 2012,
            "month": 11,
            "housingcost": 200568
        },
        {
            "year": 2012,
            "month": 12,
            "housingcost": 204068
        },
        {
            "year": 2013,
            "month": 1,
            "housingcost": 206212
        },
        {
            "year": 2013,
            "month": 2,
            "housingcost": 207834
        },
        {
            "year": 2013,
            "month": 3,
            "housingcost": 209900
        },
        {
            "year": 2013,
            "month": 4,
            "housingcost": 213005
        },
        {
            "year": 2013,
            "month": 5,
            "housingcost": 217770
        },
        {
            "year": 2013,
            "month": 6,
            "housingcost": 224047
        },
        {
            "year": 2013,
            "month": 7,
            "housingcost": 232034
        },
        {
            "year": 2013,
            "month": 8,
            "housingcost": 240803
        },
        {
            "year": 2013,
            "month": 9,
            "housingcost": 248464
        },
        {
            "year": 2013,
            "month": 10,
            "housingcost": 255761
        },
        {
            "year": 2013,
            "month": 11,
            "housingcost": 260110
        },
        {
            "year": 2013,
            "month": 12,
            "housingcost": 265799
        },
        {
            "year": 2014,
            "month": 1,
            "housingcost": 271972
        },
        {
            "year": 2014,
            "month": 2,
            "housingcost": 277634
        },
        {
            "year": 2014,
            "month": 3,
            "housingcost": 281298
        },
        {
            "year": 2014,
            "month": 4,
            "housingcost": 283764
        },
        {
            "year": 2014,
            "month": 5,
            "housingcost": 286290
        },
        {
            "year": 2014,
            "month": 6,
            "housingcost": 288960
        },
        {
            "year": 2014,
            "month": 7,
            "housingcost": 288396
        },
        {
            "year": 2014,
            "month": 8,
            "housingcost": 286806
        },
        {
            "year": 2014,
            "month": 9,
            "housingcost": 284510
        },
        {
            "year": 2014,
            "month": 10,
            "housingcost": 283223
        },
        {
            "year": 2014,
            "month": 11,
            "housingcost": 284570
        },
        {
            "year": 2014,
            "month": 12,
            "housingcost": 284761
        },
        {
            "year": 2015,
            "month": 1,
            "housingcost": 285620
        },
        {
            "year": 2015,
            "month": 2,
            "housingcost": 287121
        },
        {
            "year": 2015,
            "month": 3,
            "housingcost": 290400
        },
        {
            "year": 2015,
            "month": 4,
            "housingcost": 293845
        },
        {
            "year": 2015,
            "month": 5,
            "housingcost": 294931
        },
        {
            "year": 2015,
            "month": 6,
            "housingcost": 294950
        },
        {
            "year": 2015,
            "month": 7,
            "housingcost": 296593
        },
        {
            "year": 2015,
            "month": 8,
            "housingcost": 300360
        },
        {
            "year": 2015,
            "month": 9,
            "housingcost": 304534
        },
        {
            "year": 2015,
            "month": 10,
            "housingcost": 308557
        },
        {
            "year": 2015,
            "month": 11,
            "housingcost": 311189
        },
        {
            "year": 2015,
            "month": 12,
            "housingcost": 315242
        },
        {
            "year": 2016,
            "month": 1,
            "housingcost": 319387
        },
        {
            "year": 2016,
            "month": 2,
            "housingcost": 322117
        },
        {
            "year": 2016,
            "month": 3,
            "housingcost": 323586
        },
        {
            "year": 2016,
            "month": 4,
            "housingcost": 324864
        },
        {
            "year": 2016,
            "month": 5,
            "housingcost": 328170
        },
        {
            "year": 2016,
            "month": 6,
            "housingcost": 331398
        },
        {
            "year": 2016,
            "month": 7,
            "housingcost": 334875
        },
        {
            "year": 2016,
            "month": 8,
            "housingcost": 336269
        },
        {
            "year": 2016,
            "month": 9,
            "housingcost": 338034
        },
        {
            "year": 2016,
            "month": 10,
            "housingcost": 339070
        },
        {
            "year": 2016,
            "month": 11,
            "housingcost": 339693
        },
        {
            "year": 2016,
            "month": 12,
            "housingcost": 340711
        },
        {
            "year": 2017,
            "month": 1,
            "housingcost": 341753
        },
        {
            "year": 2017,
            "month": 2,
            "housingcost": 343985
        },
        {
            "year": 2017,
            "month": 3,
            "housingcost": 347059
        },
        {
            "year": 2017,
            "month": 4,
            "housingcost": 349749
        },
        {
            "year": 2017,
            "month": 5,
            "housingcost": 352518
        },
        {
            "year": 2017,
            "month": 6,
            "housingcost": 354269
        },
        {
            "year": 2017,
            "month": 7,
            "housingcost": 355247
        },
        {
            "year": 2017,
            "month": 8,
            "housingcost": 357151
        },
        {
            "year": 2017,
            "month": 9,
            "housingcost": 360162
        },
        {
            "year": 2017,
            "month": 10,
            "housingcost": 363896
        },
        {
            "year": 2017,
            "month": 11,
            "housingcost": 368843
        },
        {
            "year": 2017,
            "month": 12,
            "housingcost": 372273
        },
        {
            "year": 2018,
            "month": 1,
            "housingcost": 374902
        },
        {
            "year": 2018,
            "month": 2,
            "housingcost": 377200
        },
        {
            "year": 2018,
            "month": 3,
            "housingcost": 377412
        },
        {
            "year": 2018,
            "month": 4,
            "housingcost": 377946
        },
        {
            "year": 2018,
            "month": 5,
            "housingcost": 378144
        },
        {
            "year": 2018,
            "month": 6,
            "housingcost": 381482
        },
        {
            "year": 2018,
            "month": 7,
            "housingcost": 385490
        },
        {
            "year": 2018,
            "month": 8,
            "housingcost": 387401
        },
        {
            "year": 2018,
            "month": 9,
            "housingcost": 388461
        },
        {
            "year": 2018,
            "month": 10,
            "housingcost": 390250
        },
        {
            "year": 2018,
            "month": 11,
            "housingcost": 391923
        },
        {
            "year": 2018,
            "month": 12,
            "housingcost": 391531
        },
        {
            "year": 2019,
            "month": 1,
            "housingcost": 387729
        },
        {
            "year": 2019,
            "month": 2,
            "housingcost": 383245
        },
        {
            "year": 2019,
            "month": 3,
            "housingcost": 383064
        },
        {
            "year": 2019,
            "month": 4,
            "housingcost": 385985
        },
        {
            "year": 2019,
            "month": 5,
            "housingcost": 389235
        },
        {
            "year": 2019,
            "month": 6,
            "housingcost": 389617
        },
        {
            "year": 2019,
            "month": 7,
            "housingcost": 389697
        },
        {
            "year": 2019,
            "month": 8,
            "housingcost": 390297
        },
        {
            "year": 2019,
            "month": 9,
            "housingcost": 390187
        },
        {
            "year": 2019,
            "month": 10,
            "housingcost": 388671
        },
        {
            "year": 2019,
            "month": 11,
            "housingcost": 387949
        },
        {
            "year": 2019,
            "month": 12,
            "housingcost": 389252
        },
        {
            "year": 2020,
            "month": 1,
            "housingcost": 393413
        },
        {
            "year": 2020,
            "month": 2,
            "housingcost": 398052
        },
        {
            "year": 2020,
            "month": 3,
            "housingcost": 400240
        },
        {
            "year": 2020,
            "month": 4,
            "housingcost": 400026
        },
        {
            "year": 2020,
            "month": 5,
            "housingcost": 399658
        },
        {
            "year": 2020,
            "month": 6,
            "housingcost": 400360
        },
        {
            "year": 2020,
            "month": 7,
            "housingcost": 401312
        },
        {
            "year": 2020,
            "month": 8,
            "housingcost": 402963
        }
    ],
    "covid": [
        {
            "year": 2020,
            "month": 1,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 23,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 30,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 31,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 6,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 7,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 8,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 9,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 10,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 11,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 12,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 13,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 14,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 15,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 16,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 17,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 18,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 19,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 20,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 21,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 23,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 6,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 7,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 8,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 9,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 10,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 11,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 12,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 13,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 14,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 15,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 16,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 17,
            "cases": 4
        },
        {
            "year": 2020,
            "month": 3,
            "day": 18,
            "cases": 4
        },
        {
            "year": 2020,
            "month": 3,
            "day": 19,
            "cases": 5
        },
        {
            "year": 2020,
            "month": 3,
            "day": 20,
            "cases": 5
        },
        {
            "year": 2020,
            "month": 3,
            "day": 21,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 22,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 23,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 24,
            "cases": 8
        },
        {
            "year": 2020,
            "month": 3,
            "day": 25,
            "cases": 10
        },
        {
            "year": 2020,
            "month": 3,
            "day": 26,
            "cases": 11
        },
        {
            "year": 2020,
            "month": 3,
            "day": 27,
            "cases": 13
        },
        {
            "year": 2020,
            "month": 3,
            "day": 28,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 29,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 30,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 31,
            "cases": 24
        },
        {
            "year": 2020,
            "month": 4,
            "day": 1,
            "cases": 25
        },
        {
            "year": 2020,
            "month": 4,
            "day": 2,
            "cases": 28
        },
        {
            "year": 2020,
            "month": 4,
            "day": 3,
            "cases": 33
        },
        {
            "year": 2020,
            "month": 4,
            "day": 4,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 5,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 6,
            "cases": 37
        },
        {
            "year": 2020,
            "month": 4,
            "day": 7,
            "cases": 50
        },
        {
            "year": 2020,
            "month": 4,
            "day": 8,
            "cases": 56
        },
        {
            "year": 2020,
            "month": 4,
            "day": 9,
            "cases": 67
        },
        {
            "year": 2020,
            "month": 4,
            "day": 10,
            "cases": 71
        },
        {
            "year": 2020,
            "month": 4,
            "day": 11,
            "cases": 75
        },
        {
            "year": 2020,
            "month": 4,
            "day": 12,
            "cases": 88
        },
        {
            "year": 2020,
            "month": 4,
            "day": 13,
            "cases": 93
        },
        {
            "year": 2020,
            "month": 4,
            "day": 14,
            "cases": 101
        },
        {
            "year": 2020,
            "month": 4,
            "day": 15,
            "cases": 102
        },
        {
            "year": 2020,
            "month": 4,
            "day": 16,
            "cases": 116
        },
        {
            "year": 2020,
            "month": 4,
            "day": 17,
            "cases": 125
        },
        {
            "year": 2020,
            "month": 4,
            "day": 18,
            "cases": 126
        },
        {
            "year": 2020,
            "month": 4,
            "day": 19,
            "cases": 137
        },
        {
            "year": 2020,
            "month": 4,
            "day": 20,
            "cases": 137
        },
        {
            "year": 2020,
            "month": 4,
            "day": 21,
            "cases": 142
        },
        {
            "year": 2020,
            "month": 4,
            "day": 22,
            "cases": 146
        },
        {
            "year": 2020,
            "month": 4,
            "day": 23,
            "cases": 151
        },
        {
            "year": 2020,
            "month": 4,
            "day": 24,
            "cases": 157
        },
        {
            "year": 2020,
            "month": 4,
            "day": 25,
            "cases": 157
        },
        {
            "year": 2020,
            "month": 4,
            "day": 26,
            "cases": 161
        },
        {
            "year": 2020,
            "month": 4,
            "day": 27,
            "cases": 161
        },
        {
            "year": 2020,
            "month": 4,
            "day": 28,
            "cases": 162
        },
        {
            "year": 2020,
            "month": 4,
            "day": 29,
            "cases": 163
        },
        {
            "year": 2020,
            "month": 4,
            "day": 30,
            "cases": 164
        },
        {
            "year": 2020,
            "month": 5,
            "day": 1,
            "cases": 169
        },
        {
            "year": 2020,
            "month": 5,
            "day": 2,
            "cases": 169
        },
        {
            "year": 2020,
            "month": 5,
            "day": 3,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 4,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 5,
            "cases": 171
        },
        {
            "year": 2020,
            "month": 5,
            "day": 6,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 7,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 8,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 9,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 10,
            "cases": 172
        },
        {
            "year": 2020,
            "month": 5,
            "day": 11,
            "cases": 174
        },
        {
            "year": 2020,
            "month": 5,
            "day": 12,
            "cases": 177
        },
        {
            "year": 2020,
            "month": 5,
            "day": 13,
            "cases": 177
        },
        {
            "year": 2020,
            "month": 5,
            "day": 14,
            "cases": 182
        },
        {
            "year": 2020,
            "month": 5,
            "day": 15,
            "cases": 182
        },
        {
            "year": 2020,
            "month": 5,
            "day": 16,
            "cases": 183
        },
        {
            "year": 2020,
            "month": 5,
            "day": 17,
            "cases": 184
        },
        {
            "year": 2020,
            "month": 5,
            "day": 18,
            "cases": 184
        },
        {
            "year": 2020,
            "month": 5,
            "day": 19,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 20,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 21,
            "cases": 185
        },
        {
            "year": 2020,
            "month": 5,
            "day": 22,
            "cases": 186
        },
        {
            "year": 2020,
            "month": 5,
            "day": 23,
            "cases": 190
        },
        {
            "year": 2020,
            "month": 5,
            "day": 24,
            "cases": 190
        },
        {
            "year": 2020,
            "month": 5,
            "day": 25,
            "cases": 194
        },
        {
            "year": 2020,
            "month": 5,
            "day": 26,
            "cases": 198
        },
        {
            "year": 2020,
            "month": 5,
            "day": 27,
            "cases": 200
        },
        {
            "year": 2020,
            "month": 5,
            "day": 28,
            "cases": 207
        },
        {
            "year": 2020,
            "month": 5,
            "day": 29,
            "cases": 207
        },
        {
            "year": 2020,
            "month": 5,
            "day": 30,
            "cases": 210
        },
        {
            "year": 2020,
            "month": 5,
            "day": 31,
            "cases": 211
        },
        {
            "year": 2020,
            "month": 6,
            "day": 1,
            "cases": 211
        },
        {
            "year": 2020,
            "month": 6,
            "day": 2,
            "cases": 213
        },
        {
            "year": 2020,
            "month": 6,
            "day": 3,
            "cases": 213
        },
        {
            "year": 2020,
            "month": 6,
            "day": 4,
            "cases": 216
        },
        {
            "year": 2020,
            "month": 6,
            "day": 5,
            "cases": 216
        },
        {
            "year": 2020,
            "month": 6,
            "day": 6,
            "cases": 221
        },
        {
            "year": 2020,
            "month": 6,
            "day": 7,
            "cases": 221
        },
        {
            "year": 2020,
            "month": 6,
            "day": 8,
            "cases": 225
        },
        {
            "year": 2020,
            "month": 6,
            "day": 9,
            "cases": 226
        },
        {
            "year": 2020,
            "month": 6,
            "day": 10,
            "cases": 227
        },
        {
            "year": 2020,
            "month": 6,
            "day": 11,
            "cases": 240
        },
        {
            "year": 2020,
            "month": 6,
            "day": 12,
            "cases": 240
        },
        {
            "year": 2020,
            "month": 6,
            "day": 13,
            "cases": 252
        },
        {
            "year": 2020,
            "month": 6,
            "day": 14,
            "cases": 253
        },
        {
            "year": 2020,
            "month": 6,
            "day": 15,
            "cases": 255
        },
        {
            "year": 2020,
            "month": 6,
            "day": 16,
            "cases": 265
        },
        {
            "year": 2020,
            "month": 6,
            "day": 17,
            "cases": 265
        },
        {
            "year": 2020,
            "month": 6,
            "day": 18,
            "cases": 302
        },
        {
            "year": 2020,
            "month": 6,
            "day": 19,
            "cases": 310
        },
        {
            "year": 2020,
            "month": 6,
            "day": 20,
            "cases": 321
        },
        {
            "year": 2020,
            "month": 6,
            "day": 21,
            "cases": 330
        },
        {
            "year": 2020,
            "month": 6,
            "day": 22,
            "cases": 347
        },
        {
            "year": 2020,
            "month": 6,
            "day": 23,
            "cases": 366
        },
        {
            "year": 2020,
            "month": 6,
            "day": 24,
            "cases": 386
        },
        {
            "year": 2020,
            "month": 6,
            "day": 25,
            "cases": 408
        },
        {
            "year": 2020,
            "month": 6,
            "day": 26,
            "cases": 438
        },
        {
            "year": 2020,
            "month": 6,
            "day": 27,
            "cases": 458
        },
        {
            "year": 2020,
            "month": 6,
            "day": 28,
            "cases": 479
        },
        {
            "year": 2020,
            "month": 6,
            "day": 29,
            "cases": 505
        },
        {
            "year": 2020,
            "month": 6,
            "day": 30,
            "cases": 505
        },
        {
            "year": 2020,
            "month": 7,
            "day": 1,
            "cases": 555
        },
        {
            "year": 2020,
            "month": 7,
            "day": 2,
            "cases": 583
        },
        {
            "year": 2020,
            "month": 7,
            "day": 3,
            "cases": 583
        },
        {
            "year": 2020,
            "month": 7,
            "day": 4,
            "cases": 613
        },
        {
            "year": 2020,
            "month": 7,
            "day": 5,
            "cases": 677
        },
        {
            "year": 2020,
            "month": 7,
            "day": 6,
            "cases": 677
        },
        {
            "year": 2020,
            "month": 7,
            "day": 7,
            "cases": 723
        },
        {
            "year": 2020,
            "month": 7,
            "day": 8,
            "cases": 760
        },
        {
            "year": 2020,
            "month": 7,
            "day": 9,
            "cases": 802
        },
        {
            "year": 2020,
            "month": 7,
            "day": 10,
            "cases": 839
        },
        {
            "year": 2020,
            "month": 7,
            "day": 11,
            "cases": 839
        },
        {
            "year": 2020,
            "month": 7,
            "day": 12,
            "cases": 884
        },
        {
            "year": 2020,
            "month": 7,
            "day": 13,
            "cases": 929
        },
        {
            "year": 2020,
            "month": 7,
            "day": 14,
            "cases": 999
        },
        {
            "year": 2020,
            "month": 7,
            "day": 15,
            "cases": 1023
        },
        {
            "year": 2020,
            "month": 7,
            "day": 16,
            "cases": 1062
        },
        {
            "year": 2020,
            "month": 7,
            "day": 17,
            "cases": 1101
        },
        {
            "year": 2020,
            "month": 7,
            "day": 18,
            "cases": 1101
        },
        {
            "year": 2020,
            "month": 7,
            "day": 19,
            "cases": 1162
        },
        {
            "year": 2020,
            "month": 7,
            "day": 20,
            "cases": 1196
        },
        {
            "year": 2020,
            "month": 7,
            "day": 21,
            "cases": 1200
        },
        {
            "year": 2020,
            "month": 7,
            "day": 22,
            "cases": 1225
        },
        {
            "year": 2020,
            "month": 7,
            "day": 23,
            "cases": 1275
        },
        {
            "year": 2020,
            "month": 7,
            "day": 24,
            "cases": 1315
        },
        {
            "year": 2020,
            "month": 7,
            "day": 25,
            "cases": 1342
        },
        {
            "year": 2020,
            "month": 7,
            "day": 26,
            "cases": 1394
        },
        {
            "year": 2020,
            "month": 7,
            "day": 27,
            "cases": 1424
        },
        {
            "year": 2020,
            "month": 7,
            "day": 28,
            "cases": 1446
        },
        {
            "year": 2020,
            "month": 7,
            "day": 29,
            "cases": 1477
        },
        {
            "year": 2020,
            "month": 7,
            "day": 30,
            "cases": 1494
        },
        {
            "year": 2020,
            "month": 7,
            "day": 31,
            "cases": 1510
        },
        {
            "year": 2020,
            "month": 8,
            "day": 1,
            "cases": 1510
        },
        {
            "year": 2020,
            "month": 8,
            "day": 2,
            "cases": 1544
        },
        {
            "year": 2020,
            "month": 8,
            "day": 3,
            "cases": 1572
        },
        {
            "year": 2020,
            "month": 8,
            "day": 4,
            "cases": 1614
        },
        {
            "year": 2020,
            "month": 8,
            "day": 5,
            "cases": 1614
        },
        {
            "year": 2020,
            "month": 8,
            "day": 6,
            "cases": 1660
        },
        {
            "year": 2020,
            "month": 8,
            "day": 7,
            "cases": 1660
        },
        {
            "year": 2020,
            "month": 8,
            "day": 8,
            "cases": 1690
        },
        {
            "year": 2020,
            "month": 8,
            "day": 9,
            "cases": 1721
        },
        {
            "year": 2020,
            "month": 8,
            "day": 10,
            "cases": 1834
        },
        {
            "year": 2020,
            "month": 8,
            "day": 11,
            "cases": 1834
        },
        {
            "year": 2020,
            "month": 8,
            "day": 12,
            "cases": 1898
        },
        {
            "year": 2020,
            "month": 8,
            "day": 13,
            "cases": 1918
        },
        {
            "year": 2020,
            "month": 8,
            "day": 14,
            "cases": 1966
        },
        {
            "year": 2020,
            "month": 8,
            "day": 15,
            "cases": 1966
        },
        {
            "year": 2020,
            "month": 8,
            "day": 16,
            "cases": 2019
        },
        {
            "year": 2020,
            "month": 8,
            "day": 17,
            "cases": 2046
        },
        {
            "year": 2020,
            "month": 8,
            "day": 18,
            "cases": 2076
        },
        {
            "year": 2020,
            "month": 8,
            "day": 19,
            "cases": 2118
        },
        {
            "year": 2020,
            "month": 8,
            "day": 20,
            "cases": 2147
        },
        {
            "year": 2020,
            "month": 8,
            "day": 21,
            "cases": 2164
        },
        {
            "year": 2020,
            "month": 8,
            "day": 22,
            "cases": 2184
        },
        {
            "year": 2020,
            "month": 8,
            "day": 23,
            "cases": 2205
        },
        {
            "year": 2020,
            "month": 8,
            "day": 24,
            "cases": 2239
        },
        {
            "year": 2020,
            "month": 8,
            "day": 25,
            "cases": 2255
        },
        {
            "year": 2020,
            "month": 8,
            "day": 26,
            "cases": 2274
        },
        {
            "year": 2020,
            "month": 8,
            "day": 27,
            "cases": 2287
        },
        {
            "year": 2020,
            "month": 8,
            "day": 28,
            "cases": 2310
        },
        {
            "year": 2020,
            "month": 8,
            "day": 29,
            "cases": 2335
        },
        {
            "year": 2020,
            "month": 8,
            "day": 30,
            "cases": 2386
        },
        {
            "year": 2020,
            "month": 8,
            "day": 31,
            "cases": 2424
        },
        {
            "year": 2020,
            "month": 9,
            "day": 1,
            "cases": 2438
        },
        {
            "year": 2020,
            "month": 9,
            "day": 2,
            "cases": 2451
        },
        {
            "year": 2020,
            "month": 9,
            "day": 3,
            "cases": 2478
        },
        {
            "year": 2020,
            "month": 9,
            "day": 4,
            "cases": 2495
        },
        {
            "year": 2020,
            "month": 9,
            "day": 5,
            "cases": 2524
        },
        {
            "year": 2020,
            "month": 9,
            "day": 6,
            "cases": 2541
        },
        {
            "year": 2020,
            "month": 9,
            "day": 7,
            "cases": 2564
        },
        {
            "year": 2020,
            "month": 9,
            "day": 8,
            "cases": 2565
        },
        {
            "year": 2020,
            "month": 9,
            "day": 9,
            "cases": 2597
        },
        {
            "year": 2020,
            "month": 9,
            "day": 10,
            "cases": 2611
        },
        {
            "year": 2020,
            "month": 9,
            "day": 11,
            "cases": 2633
        },
        {
            "year": 2020,
            "month": 9,
            "day": 12,
            "cases": 2650
        },
        {
            "year": 2020,
            "month": 9,
            "day": 13,
            "cases": 2677
        },
        {
            "year": 2020,
            "month": 9,
            "day": 14,
            "cases": 2689
        },
        {
            "year": 2020,
            "month": 9,
            "day": 15,
            "cases": 2710
        },
        {
            "year": 2020,
            "month": 9,
            "day": 16,
            "cases": 2710
        },
        {
            "year": 2020,
            "month": 9,
            "day": 17,
            "cases": 2721
        },
        {
            "year": 2020,
            "month": 9,
            "day": 18,
            "cases": 2732
        },
        {
            "year": 2020,
            "month": 9,
            "day": 19,
            "cases": 2740
        },
        {
            "year": 2020,
            "month": 9,
            "day": 20,
            "cases": 2747
        },
        {
            "year": 2020,
            "month": 9,
            "day": 21,
            "cases": 2754
        },
        {
            "year": 2020,
            "month": 9,
            "day": 22,
            "cases": 2765
        },
        {
            "year": 2020,
            "month": 9,
            "day": 23,
            "cases": 2773
        },
        {
            "year": 2020,
            "month": 9,
            "day": 24,
            "cases": 2782
        },
        {
            "year": 2020,
            "month": 9,
            "day": 25,
            "cases": 2789
        },
        {
            "year": 2020,
            "month": 9,
            "day": 26,
            "cases": 2795
        },
        {
            "year": 2020,
            "month": 9,
            "day": 27,
            "cases": 2803
        },
        {
            "year": 2020,
            "month": 9,
            "day": 28,
            "cases": 2815
        },
        {
            "year": 2020,
            "month": 9,
            "day": 29,
            "cases": 2825
        },
        {
            "year": 2020,
            "month": 9,
            "day": 30,
            "cases": 2828
        },
        {
            "year": 2020,
            "month": 10,
            "day": 1,
            "cases": 2836
        },
        {
            "year": 2020,
            "month": 10,
            "day": 2,
            "cases": 2847
        },
        {
            "year": 2020,
            "month": 10,
            "day": 3,
            "cases": 2867
        },
        {
            "year": 2020,
            "month": 10,
            "day": 4,
            "cases": 2879
        },
        {
            "year": 2020,
            "month": 10,
            "day": 5,
            "cases": 2893
        },
        {
            "year": 2020,
            "month": 10,
            "day": 6,
            "cases": 2903
        },
        {
            "year": 2020,
            "month": 10,
            "day": 7,
            "cases": 2909
        },
        {
            "year": 2020,
            "month": 10,
            "day": 8,
            "cases": 2918
        },
        {
            "year": 2020,
            "month": 10,
            "day": 9,
            "cases": 2929
        },
        {
            "year": 2020,
            "month": 10,
            "day": 10,
            "cases": 2942
        },
        {
            "year": 2020,
            "month": 10,
            "day": 11,
            "cases": 2954
        },
        {
            "year": 2020,
            "month": 10,
            "day": 12,
            "cases": 2966
        }
    ],
    "historicalweather": [
        {
            "month": "Sep",
            "precipitation": 0.32,
            "temperature": 71.7
        },
        {
            "month": "Mar",
            "precipitation": 4.1,
            "temperature": 53.4
        },
        {
            "month": "Nov",
            "precipitation": 0.48,
            "temperature": 55.4
        },
        {
            "month": "Apr",
            "precipitation": 0.5,
            "temperature": 62.4
        },
        {
            "month": "Dec",
            "precipitation": 5.31,
            "temperature": 49.7
        },
        {
            "month": "Jan",
            "precipitation": 4.78,
            "temperature": 50.1
        },
        {
            "month": "Jun",
            "precipitation": 0.0,
            "temperature": 73.7
        },
        {
            "month": "Oct",
            "precipitation": 0.0,
            "temperature": 61.9
        },
        {
            "month": "Jul",
            "precipitation": 0.0,
            "temperature": 75.9
        },
        {
            "month": "May",
            "precipitation": 3.12,
            "temperature": 62.7
        },
        {
            "month": "Feb",
            "precipitation": 8.9,
            "temperature": 47.6
        },
        {
            "month": "Aug",
            "precipitation": 0.0,
            "temperature": 77.1
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/cities/avg</summary>

```JSON
{
    "cityid": 587606,
    "citynamestate": "National Average, USA",
    "statecode": null,
    "timezone": null,
    "latitude": 37.48712116492545,
    "logitude": -96.031425068364,
    "fpis": null,
    "gnis": null,
    "wikiimgurl": null,
    "website": null,
    "population": 113846.68421052632,
    "densitymisq": 0.0,
    "densitykmsq": 0.0,
    "averageage": 36.50746268656718,
    "householdincome": 65208.21523959152,
    "individualincome": 32457.170463472114,
    "averagehouse": 306294.276512176,
    "rent": 1152.3778476040848,
    "costoflivingindex": 102.8215239591515,
    "acastatus": null,
    "averagetemp": "NaN",
    "averageperc": "NaN",
    "avgnewcovidcases": "NaN",
    "zipcodes": [],
    "counties": [],
    "populationhist": [
        {
            "year": 2019,
            "pop": 114815.25451688924
        },
        {
            "year": 2018,
            "pop": 114277.68656716419
        },
        {
            "year": 2017,
            "pop": 113698.48075412412
        },
        {
            "year": 2016,
            "pop": 112925.99685781618
        },
        {
            "year": 2015,
            "pop": 111954.4619010212
        },
        {
            "year": 2014,
            "pop": 110880.33857030637
        },
        {
            "year": 2013,
            "pop": 109834.82953652789
        },
        {
            "year": 2012,
            "pop": 108799.0534171249
        },
        {
            "year": 2011,
            "pop": 107677.59073055774
        },
        {
            "year": 2010,
            "pop": 105982.08326787117
        }
    ],
    "historicalincome": [
        {
            "year": 2019,
            "individualincome": 41818,
            "householdincome": 68191
        },
        {
            "year": 2018,
            "individualincome": 39170,
            "householdincome": 64334
        },
        {
            "year": 2017,
            "individualincome": 37856,
            "householdincome": 62068
        },
        {
            "year": 2016,
            "individualincome": 36334,
            "householdincome": 59474
        },
        {
            "year": 2015,
            "individualincome": 35269,
            "householdincome": 57350
        },
        {
            "year": 2014,
            "individualincome": 34015,
            "householdincome": 55319
        },
        {
            "year": 2013,
            "individualincome": 33282,
            "householdincome": 53870
        },
        {
            "year": 2012,
            "individualincome": 32551,
            "householdincome": 52609
        },
        {
            "year": 2011,
            "individualincome": 31562,
            "householdincome": 51464
        },
        {
            "year": 2010,
            "individualincome": 31534,
            "householdincome": 50982
        }
    ],
    "historicalaveragehouse": [
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 359273
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 356211
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 354207
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 352919
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 351717
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 350073
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 348187
        },
        {
            "year": 2020,
            "month": 2020,
            "housingcost": 346416
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 344861
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 343595
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 342614
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 341915
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 341542
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 341410
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 340617
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 339290
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 338132
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 337655
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 337751
        },
        {
            "year": 2019,
            "month": 2019,
            "housingcost": 337940
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 338031
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 337894
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 337391
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 336826
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 336188
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 335140
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 333344
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 331353
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 329185
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 327111
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 324737
        },
        {
            "year": 2018,
            "month": 2018,
            "housingcost": 322404
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 320026
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 317578
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 315145
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 312969
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 310936
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 309173
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 307428
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 305576
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 303784
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 302084
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 300466
        },
        {
            "year": 2017,
            "month": 2017,
            "housingcost": 298898
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 297363
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 295787
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 294236
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 292684
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 291337
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 289872
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 288625
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 287169
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 285917
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 284535
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 283377
        },
        {
            "year": 2016,
            "month": 2016,
            "housingcost": 281909
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 280335
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 278865
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 277588
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 276036
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 274396
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 272816
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 271362
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 270039
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 268315
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 266594
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 264885
        },
        {
            "year": 2015,
            "month": 2015,
            "housingcost": 263479
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 262116
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 260864
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 259249
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 258347
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 257519
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 256804
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 255899
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 255085
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 254481
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 253778
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 252787
        },
        {
            "year": 2014,
            "month": 2014,
            "housingcost": 251190
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 249379
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 247492
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 245502
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 242922
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 240507
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 237984
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 235426
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 232684
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 229640
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 227020
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 224539
        },
        {
            "year": 2013,
            "month": 2013,
            "housingcost": 222255
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 220123
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 218247
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 216581
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 214976
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 213634
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 212432
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 211269
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 210294
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 209390
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 208889
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 208702
        },
        {
            "year": 2012,
            "month": 2012,
            "housingcost": 209002
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 209381
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 209865
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 210244
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 210813
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 211483
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 212125
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 212972
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 214147
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 215750
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 217167
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 218462
        },
        {
            "year": 2011,
            "month": 2011,
            "housingcost": 219486
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 220722
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 222121
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 223710
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 224907
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 225967
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 226839
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 227874
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 228266
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 227973
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 227682
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 227682
        },
        {
            "year": 2010,
            "month": 2010,
            "housingcost": 227837
        }
    ],
    "covid": [
        {
            "year": 2020,
            "month": 10,
            "day": 12,
            "cases": 10467
        },
        {
            "year": 2020,
            "month": 10,
            "day": 11,
            "cases": 10419
        },
        {
            "year": 2020,
            "month": 10,
            "day": 10,
            "cases": 10369
        },
        {
            "year": 2020,
            "month": 10,
            "day": 9,
            "cases": 10311
        },
        {
            "year": 2020,
            "month": 10,
            "day": 8,
            "cases": 10246
        },
        {
            "year": 2020,
            "month": 10,
            "day": 7,
            "cases": 10185
        },
        {
            "year": 2020,
            "month": 10,
            "day": 6,
            "cases": 10129
        },
        {
            "year": 2020,
            "month": 10,
            "day": 5,
            "cases": 10085
        },
        {
            "year": 2020,
            "month": 10,
            "day": 4,
            "cases": 10033
        },
        {
            "year": 2020,
            "month": 10,
            "day": 3,
            "cases": 9990
        },
        {
            "year": 2020,
            "month": 10,
            "day": 2,
            "cases": 9935
        },
        {
            "year": 2020,
            "month": 10,
            "day": 1,
            "cases": 9875
        },
        {
            "year": 2020,
            "month": 9,
            "day": 30,
            "cases": 9826
        },
        {
            "year": 2020,
            "month": 9,
            "day": 29,
            "cases": 9779
        },
        {
            "year": 2020,
            "month": 9,
            "day": 28,
            "cases": 9732
        },
        {
            "year": 2020,
            "month": 9,
            "day": 27,
            "cases": 9691
        },
        {
            "year": 2020,
            "month": 9,
            "day": 26,
            "cases": 9651
        },
        {
            "year": 2020,
            "month": 9,
            "day": 25,
            "cases": 9596
        },
        {
            "year": 2020,
            "month": 9,
            "day": 24,
            "cases": 9539
        },
        {
            "year": 2020,
            "month": 9,
            "day": 23,
            "cases": 9491
        },
        {
            "year": 2020,
            "month": 9,
            "day": 22,
            "cases": 9446
        },
        {
            "year": 2020,
            "month": 9,
            "day": 21,
            "cases": 9410
        },
        {
            "year": 2020,
            "month": 9,
            "day": 20,
            "cases": 9344
        },
        {
            "year": 2020,
            "month": 9,
            "day": 19,
            "cases": 9305
        },
        {
            "year": 2020,
            "month": 9,
            "day": 18,
            "cases": 9254
        },
        {
            "year": 2020,
            "month": 9,
            "day": 17,
            "cases": 9198
        },
        {
            "year": 2020,
            "month": 9,
            "day": 16,
            "cases": 9144
        },
        {
            "year": 2020,
            "month": 9,
            "day": 15,
            "cases": 9098
        },
        {
            "year": 2020,
            "month": 9,
            "day": 14,
            "cases": 9055
        },
        {
            "year": 2020,
            "month": 9,
            "day": 13,
            "cases": 9013
        },
        {
            "year": 2020,
            "month": 9,
            "day": 12,
            "cases": 8977
        },
        {
            "year": 2020,
            "month": 9,
            "day": 11,
            "cases": 8932
        },
        {
            "year": 2020,
            "month": 9,
            "day": 10,
            "cases": 8883
        },
        {
            "year": 2020,
            "month": 9,
            "day": 9,
            "cases": 8843
        },
        {
            "year": 2020,
            "month": 9,
            "day": 8,
            "cases": 8804
        },
        {
            "year": 2020,
            "month": 9,
            "day": 7,
            "cases": 8771
        },
        {
            "year": 2020,
            "month": 9,
            "day": 6,
            "cases": 8745
        },
        {
            "year": 2020,
            "month": 9,
            "day": 5,
            "cases": 8710
        },
        {
            "year": 2020,
            "month": 9,
            "day": 4,
            "cases": 8656
        },
        {
            "year": 2020,
            "month": 9,
            "day": 3,
            "cases": 8605
        },
        {
            "year": 2020,
            "month": 9,
            "day": 2,
            "cases": 8555
        },
        {
            "year": 2020,
            "month": 9,
            "day": 1,
            "cases": 8507
        },
        {
            "year": 2020,
            "month": 8,
            "day": 31,
            "cases": 8460
        },
        {
            "year": 2020,
            "month": 8,
            "day": 30,
            "cases": 8410
        },
        {
            "year": 2020,
            "month": 8,
            "day": 29,
            "cases": 8369
        },
        {
            "year": 2020,
            "month": 8,
            "day": 28,
            "cases": 8316
        },
        {
            "year": 2020,
            "month": 8,
            "day": 27,
            "cases": 8262
        },
        {
            "year": 2020,
            "month": 8,
            "day": 26,
            "cases": 8211
        },
        {
            "year": 2020,
            "month": 8,
            "day": 25,
            "cases": 8154
        },
        {
            "year": 2020,
            "month": 8,
            "day": 24,
            "cases": 8102
        },
        {
            "year": 2020,
            "month": 8,
            "day": 23,
            "cases": 8051
        },
        {
            "year": 2020,
            "month": 8,
            "day": 22,
            "cases": 8006
        },
        {
            "year": 2020,
            "month": 8,
            "day": 21,
            "cases": 7946
        },
        {
            "year": 2020,
            "month": 8,
            "day": 20,
            "cases": 7885
        },
        {
            "year": 2020,
            "month": 8,
            "day": 19,
            "cases": 7828
        },
        {
            "year": 2020,
            "month": 8,
            "day": 18,
            "cases": 7753
        },
        {
            "year": 2020,
            "month": 8,
            "day": 17,
            "cases": 7678
        },
        {
            "year": 2020,
            "month": 8,
            "day": 16,
            "cases": 7631
        },
        {
            "year": 2020,
            "month": 8,
            "day": 15,
            "cases": 7567
        },
        {
            "year": 2020,
            "month": 8,
            "day": 14,
            "cases": 7505
        },
        {
            "year": 2020,
            "month": 8,
            "day": 13,
            "cases": 7406
        },
        {
            "year": 2020,
            "month": 8,
            "day": 12,
            "cases": 7339
        },
        {
            "year": 2020,
            "month": 8,
            "day": 11,
            "cases": 7242
        },
        {
            "year": 2020,
            "month": 8,
            "day": 10,
            "cases": 7191
        },
        {
            "year": 2020,
            "month": 8,
            "day": 9,
            "cases": 7104
        },
        {
            "year": 2020,
            "month": 8,
            "day": 8,
            "cases": 7051
        },
        {
            "year": 2020,
            "month": 8,
            "day": 7,
            "cases": 6982
        },
        {
            "year": 2020,
            "month": 8,
            "day": 6,
            "cases": 6917
        },
        {
            "year": 2020,
            "month": 8,
            "day": 5,
            "cases": 6829
        },
        {
            "year": 2020,
            "month": 8,
            "day": 4,
            "cases": 6767
        },
        {
            "year": 2020,
            "month": 8,
            "day": 3,
            "cases": 6683
        },
        {
            "year": 2020,
            "month": 8,
            "day": 2,
            "cases": 6629
        },
        {
            "year": 2020,
            "month": 8,
            "day": 1,
            "cases": 6567
        },
        {
            "year": 2020,
            "month": 7,
            "day": 31,
            "cases": 6486
        },
        {
            "year": 2020,
            "month": 7,
            "day": 30,
            "cases": 6394
        },
        {
            "year": 2020,
            "month": 7,
            "day": 29,
            "cases": 6316
        },
        {
            "year": 2020,
            "month": 7,
            "day": 28,
            "cases": 6200
        },
        {
            "year": 2020,
            "month": 7,
            "day": 27,
            "cases": 6094
        },
        {
            "year": 2020,
            "month": 7,
            "day": 26,
            "cases": 6029
        },
        {
            "year": 2020,
            "month": 7,
            "day": 25,
            "cases": 5955
        },
        {
            "year": 2020,
            "month": 7,
            "day": 24,
            "cases": 5868
        },
        {
            "year": 2020,
            "month": 7,
            "day": 23,
            "cases": 5762
        },
        {
            "year": 2020,
            "month": 7,
            "day": 22,
            "cases": 5662
        },
        {
            "year": 2020,
            "month": 7,
            "day": 21,
            "cases": 5559
        },
        {
            "year": 2020,
            "month": 7,
            "day": 20,
            "cases": 5451
        },
        {
            "year": 2020,
            "month": 7,
            "day": 19,
            "cases": 5365
        },
        {
            "year": 2020,
            "month": 7,
            "day": 18,
            "cases": 5296
        },
        {
            "year": 2020,
            "month": 7,
            "day": 17,
            "cases": 5207
        },
        {
            "year": 2020,
            "month": 7,
            "day": 16,
            "cases": 5095
        },
        {
            "year": 2020,
            "month": 7,
            "day": 15,
            "cases": 4996
        },
        {
            "year": 2020,
            "month": 7,
            "day": 14,
            "cases": 4886
        },
        {
            "year": 2020,
            "month": 7,
            "day": 13,
            "cases": 4773
        },
        {
            "year": 2020,
            "month": 7,
            "day": 12,
            "cases": 4685
        },
        {
            "year": 2020,
            "month": 7,
            "day": 11,
            "cases": 4612
        },
        {
            "year": 2020,
            "month": 7,
            "day": 10,
            "cases": 4519
        },
        {
            "year": 2020,
            "month": 7,
            "day": 9,
            "cases": 4396
        },
        {
            "year": 2020,
            "month": 7,
            "day": 8,
            "cases": 4279
        },
        {
            "year": 2020,
            "month": 7,
            "day": 7,
            "cases": 4177
        },
        {
            "year": 2020,
            "month": 7,
            "day": 6,
            "cases": 4078
        },
        {
            "year": 2020,
            "month": 7,
            "day": 5,
            "cases": 3989
        },
        {
            "year": 2020,
            "month": 7,
            "day": 4,
            "cases": 3903
        },
        {
            "year": 2020,
            "month": 7,
            "day": 3,
            "cases": 3839
        },
        {
            "year": 2020,
            "month": 7,
            "day": 2,
            "cases": 3737
        },
        {
            "year": 2020,
            "month": 7,
            "day": 1,
            "cases": 3649
        },
        {
            "year": 2020,
            "month": 6,
            "day": 30,
            "cases": 3556
        },
        {
            "year": 2020,
            "month": 6,
            "day": 29,
            "cases": 3459
        },
        {
            "year": 2020,
            "month": 6,
            "day": 28,
            "cases": 3401
        },
        {
            "year": 2020,
            "month": 6,
            "day": 27,
            "cases": 3342
        },
        {
            "year": 2020,
            "month": 6,
            "day": 26,
            "cases": 3273
        },
        {
            "year": 2020,
            "month": 6,
            "day": 25,
            "cases": 3195
        },
        {
            "year": 2020,
            "month": 6,
            "day": 24,
            "cases": 3129
        },
        {
            "year": 2020,
            "month": 6,
            "day": 23,
            "cases": 3074
        },
        {
            "year": 2020,
            "month": 6,
            "day": 22,
            "cases": 3007
        },
        {
            "year": 2020,
            "month": 6,
            "day": 21,
            "cases": 2950
        },
        {
            "year": 2020,
            "month": 6,
            "day": 20,
            "cases": 2905
        },
        {
            "year": 2020,
            "month": 6,
            "day": 19,
            "cases": 2848
        },
        {
            "year": 2020,
            "month": 6,
            "day": 18,
            "cases": 2790
        },
        {
            "year": 2020,
            "month": 6,
            "day": 17,
            "cases": 2738
        },
        {
            "year": 2020,
            "month": 6,
            "day": 16,
            "cases": 2697
        },
        {
            "year": 2020,
            "month": 6,
            "day": 15,
            "cases": 2655
        },
        {
            "year": 2020,
            "month": 6,
            "day": 14,
            "cases": 2617
        },
        {
            "year": 2020,
            "month": 6,
            "day": 13,
            "cases": 2587
        },
        {
            "year": 2020,
            "month": 6,
            "day": 12,
            "cases": 2555
        },
        {
            "year": 2020,
            "month": 6,
            "day": 11,
            "cases": 2520
        },
        {
            "year": 2020,
            "month": 6,
            "day": 10,
            "cases": 2484
        },
        {
            "year": 2020,
            "month": 6,
            "day": 9,
            "cases": 2450
        },
        {
            "year": 2020,
            "month": 6,
            "day": 8,
            "cases": 2423
        },
        {
            "year": 2020,
            "month": 6,
            "day": 7,
            "cases": 2391
        },
        {
            "year": 2020,
            "month": 6,
            "day": 6,
            "cases": 2369
        },
        {
            "year": 2020,
            "month": 6,
            "day": 5,
            "cases": 2339
        },
        {
            "year": 2020,
            "month": 6,
            "day": 4,
            "cases": 2297
        },
        {
            "year": 2020,
            "month": 6,
            "day": 3,
            "cases": 2272
        },
        {
            "year": 2020,
            "month": 6,
            "day": 2,
            "cases": 2245
        },
        {
            "year": 2020,
            "month": 6,
            "day": 1,
            "cases": 2216
        },
        {
            "year": 2020,
            "month": 5,
            "day": 31,
            "cases": 2190
        },
        {
            "year": 2020,
            "month": 5,
            "day": 30,
            "cases": 2167
        },
        {
            "year": 2020,
            "month": 5,
            "day": 29,
            "cases": 2139
        },
        {
            "year": 2020,
            "month": 5,
            "day": 28,
            "cases": 2109
        },
        {
            "year": 2020,
            "month": 5,
            "day": 27,
            "cases": 2077
        },
        {
            "year": 2020,
            "month": 5,
            "day": 26,
            "cases": 2055
        },
        {
            "year": 2020,
            "month": 5,
            "day": 25,
            "cases": 2029
        },
        {
            "year": 2020,
            "month": 5,
            "day": 24,
            "cases": 2004
        },
        {
            "year": 2020,
            "month": 5,
            "day": 23,
            "cases": 1980
        },
        {
            "year": 2020,
            "month": 5,
            "day": 22,
            "cases": 1951
        },
        {
            "year": 2020,
            "month": 5,
            "day": 21,
            "cases": 1921
        },
        {
            "year": 2020,
            "month": 5,
            "day": 20,
            "cases": 1891
        },
        {
            "year": 2020,
            "month": 5,
            "day": 19,
            "cases": 1860
        },
        {
            "year": 2020,
            "month": 5,
            "day": 18,
            "cases": 1834
        },
        {
            "year": 2020,
            "month": 5,
            "day": 17,
            "cases": 1804
        },
        {
            "year": 2020,
            "month": 5,
            "day": 16,
            "cases": 1782
        },
        {
            "year": 2020,
            "month": 5,
            "day": 15,
            "cases": 1755
        },
        {
            "year": 2020,
            "month": 5,
            "day": 14,
            "cases": 1723
        },
        {
            "year": 2020,
            "month": 5,
            "day": 13,
            "cases": 1689
        },
        {
            "year": 2020,
            "month": 5,
            "day": 12,
            "cases": 1663
        },
        {
            "year": 2020,
            "month": 5,
            "day": 11,
            "cases": 1634
        },
        {
            "year": 2020,
            "month": 5,
            "day": 10,
            "cases": 1604
        },
        {
            "year": 2020,
            "month": 5,
            "day": 9,
            "cases": 1585
        },
        {
            "year": 2020,
            "month": 5,
            "day": 8,
            "cases": 1551
        },
        {
            "year": 2020,
            "month": 5,
            "day": 7,
            "cases": 1519
        },
        {
            "year": 2020,
            "month": 5,
            "day": 6,
            "cases": 1488
        },
        {
            "year": 2020,
            "month": 5,
            "day": 5,
            "cases": 1452
        },
        {
            "year": 2020,
            "month": 5,
            "day": 4,
            "cases": 1421
        },
        {
            "year": 2020,
            "month": 5,
            "day": 3,
            "cases": 1392
        },
        {
            "year": 2020,
            "month": 5,
            "day": 2,
            "cases": 1363
        },
        {
            "year": 2020,
            "month": 5,
            "day": 1,
            "cases": 1331
        },
        {
            "year": 2020,
            "month": 4,
            "day": 30,
            "cases": 1294
        },
        {
            "year": 2020,
            "month": 4,
            "day": 29,
            "cases": 1257
        },
        {
            "year": 2020,
            "month": 4,
            "day": 28,
            "cases": 1220
        },
        {
            "year": 2020,
            "month": 4,
            "day": 27,
            "cases": 1189
        },
        {
            "year": 2020,
            "month": 4,
            "day": 26,
            "cases": 1161
        },
        {
            "year": 2020,
            "month": 4,
            "day": 25,
            "cases": 1131
        },
        {
            "year": 2020,
            "month": 4,
            "day": 24,
            "cases": 1099
        },
        {
            "year": 2020,
            "month": 4,
            "day": 23,
            "cases": 1061
        },
        {
            "year": 2020,
            "month": 4,
            "day": 22,
            "cases": 1017
        },
        {
            "year": 2020,
            "month": 4,
            "day": 21,
            "cases": 978
        },
        {
            "year": 2020,
            "month": 4,
            "day": 20,
            "cases": 952
        },
        {
            "year": 2020,
            "month": 4,
            "day": 19,
            "cases": 917
        },
        {
            "year": 2020,
            "month": 4,
            "day": 18,
            "cases": 884
        },
        {
            "year": 2020,
            "month": 4,
            "day": 17,
            "cases": 852
        },
        {
            "year": 2020,
            "month": 4,
            "day": 16,
            "cases": 806
        },
        {
            "year": 2020,
            "month": 4,
            "day": 15,
            "cases": 768
        },
        {
            "year": 2020,
            "month": 4,
            "day": 14,
            "cases": 731
        },
        {
            "year": 2020,
            "month": 4,
            "day": 13,
            "cases": 692
        },
        {
            "year": 2020,
            "month": 4,
            "day": 12,
            "cases": 664
        },
        {
            "year": 2020,
            "month": 4,
            "day": 11,
            "cases": 635
        },
        {
            "year": 2020,
            "month": 4,
            "day": 10,
            "cases": 602
        },
        {
            "year": 2020,
            "month": 4,
            "day": 9,
            "cases": 561
        },
        {
            "year": 2020,
            "month": 4,
            "day": 8,
            "cases": 523
        },
        {
            "year": 2020,
            "month": 4,
            "day": 7,
            "cases": 482
        },
        {
            "year": 2020,
            "month": 4,
            "day": 6,
            "cases": 445
        },
        {
            "year": 2020,
            "month": 4,
            "day": 5,
            "cases": 409
        },
        {
            "year": 2020,
            "month": 4,
            "day": 4,
            "cases": 376
        },
        {
            "year": 2020,
            "month": 4,
            "day": 3,
            "cases": 339
        },
        {
            "year": 2020,
            "month": 4,
            "day": 2,
            "cases": 303
        },
        {
            "year": 2020,
            "month": 4,
            "day": 1,
            "cases": 267
        },
        {
            "year": 2020,
            "month": 3,
            "day": 31,
            "cases": 238
        },
        {
            "year": 2020,
            "month": 3,
            "day": 30,
            "cases": 210
        },
        {
            "year": 2020,
            "month": 3,
            "day": 29,
            "cases": 184
        },
        {
            "year": 2020,
            "month": 3,
            "day": 28,
            "cases": 164
        },
        {
            "year": 2020,
            "month": 3,
            "day": 27,
            "cases": 139
        },
        {
            "year": 2020,
            "month": 3,
            "day": 26,
            "cases": 116
        },
        {
            "year": 2020,
            "month": 3,
            "day": 25,
            "cases": 94
        },
        {
            "year": 2020,
            "month": 3,
            "day": 24,
            "cases": 79
        },
        {
            "year": 2020,
            "month": 3,
            "day": 23,
            "cases": 65
        },
        {
            "year": 2020,
            "month": 3,
            "day": 22,
            "cases": 51
        },
        {
            "year": 2020,
            "month": 3,
            "day": 21,
            "cases": 41
        },
        {
            "year": 2020,
            "month": 3,
            "day": 20,
            "cases": 33
        },
        {
            "year": 2020,
            "month": 3,
            "day": 19,
            "cases": 25
        },
        {
            "year": 2020,
            "month": 3,
            "day": 18,
            "cases": 19
        },
        {
            "year": 2020,
            "month": 3,
            "day": 17,
            "cases": 16
        },
        {
            "year": 2020,
            "month": 3,
            "day": 16,
            "cases": 12
        },
        {
            "year": 2020,
            "month": 3,
            "day": 15,
            "cases": 9
        },
        {
            "year": 2020,
            "month": 3,
            "day": 14,
            "cases": 8
        },
        {
            "year": 2020,
            "month": 3,
            "day": 13,
            "cases": 6
        },
        {
            "year": 2020,
            "month": 3,
            "day": 12,
            "cases": 5
        },
        {
            "year": 2020,
            "month": 3,
            "day": 11,
            "cases": 4
        },
        {
            "year": 2020,
            "month": 3,
            "day": 10,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 9,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 8,
            "cases": 2
        },
        {
            "year": 2020,
            "month": 3,
            "day": 7,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 6,
            "cases": 1
        },
        {
            "year": 2020,
            "month": 3,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 3,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 23,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 21,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 20,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 19,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 18,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 17,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 16,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 15,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 14,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 13,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 12,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 11,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 10,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 9,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 8,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 7,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 6,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 5,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 4,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 3,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 2,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 2,
            "day": 1,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 22,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 31,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 30,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 29,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 28,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 27,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 26,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 25,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 24,
            "cases": 0
        },
        {
            "year": 2020,
            "month": 1,
            "day": 23,
            "cases": 0
        }
    ],
    "historicalweather": [
        {
            "month": "Sep",
            "precipitation": 2.3753181461115496,
            "temperature": 70.70188531029086
        },
        {
            "month": "Mar",
            "precipitation": 2.634650432050274,
            "temperature": 45.34084838963078
        },
        {
            "month": "Apr",
            "precipitation": 3.320329929300865,
            "temperature": 56.174234092694434
        },
        {
            "month": "Nov",
            "precipitation": 2.2309269442262374,
            "temperature": 46.270149253731354
        },
        {
            "month": "Dec",
            "precipitation": 3.6675726630007874,
            "temperature": 42.71358994501186
        },
        {
            "month": "Jan",
            "precipitation": 3.547564807541244,
            "temperature": 38.45129615082481
        },
        {
            "month": "Jun",
            "precipitation": 3.9910447761194074,
            "temperature": 69.84642576590743
        },
        {
            "month": "Jul",
            "precipitation": 3.1278476040848378,
            "temperature": 75.13409269442265
        },
        {
            "month": "Oct",
            "precipitation": 3.7357187745483107,
            "temperature": 58.45632364493329
        },
        {
            "month": "May",
            "precipitation": 4.506087981146897,
            "temperature": 62.195915161036915
        },
        {
            "month": "Feb",
            "precipitation": 4.093534956794978,
            "temperature": 39.51060487038494
        },
        {
            "month": "Aug",
            "precipitation": 3.3370699135899486,
            "temperature": 74.06763550667728
        }
    ]
}
```

</details>


<details>
<summary>http://localhost:2019/cities/allid</summary>

```JSON
[
    {
        "cityid": 1,
        "citynamestate": "Vestavia Hills, Alabama"
    },
    {
        "cityid": 2,
        "citynamestate": "Apache Junction, Arizona"
    },
    {
        "cityid": 3,
        "citynamestate": "Bullhead City, Arizona"
    },
    {
        "cityid": 4,
        "citynamestate": "Casa Grande, Arizona"
    },
    {
        "cityid": 5,
        "citynamestate": "El Mirage, Arizona"
    },
    {
        "cityid": 6,
        "citynamestate": "Lake Havasu City, Arizona"
    },
    {
        "cityid": 7,
        "citynamestate": "Oro Valley, Arizona"
    },
    {
        "cityid": 8,
        "citynamestate": "Prescott Valley, Arizona"
    },
    {
        "cityid": 9,
        "citynamestate": "Sierra Vista, Arizona"
    },
    {
        "cityid": 10,
        "citynamestate": "Fort Smith, Arkansas"
    },
    {
        "cityid": 11,
        "citynamestate": "Hot Springs, Arkansas"
    },
    {
        "cityid": 12,
        "citynamestate": "Little Rock, Arkansas"
    },
    {
        "cityid": 13,
        "citynamestate": "North Little Rock, Arkansas"
    },
    {
        "cityid": 14,
        "citynamestate": "Pine Bluff, Arkansas"
    },
    {
        "cityid": 15,
        "citynamestate": "Aliso Viejo, California"
    },
    {
        "cityid": 16,
        "citynamestate": "Apple Valley, California"
    },
    {
        "cityid": 17,
        "citynamestate": "Baldwin Park, California"
    },
    {
        "cityid": 18,
        "citynamestate": "Bell Gardens, California"
    },
    {
        "cityid": 19,
        "citynamestate": "Beverly Hills, California"
    },
    {
        "cityid": 20,
        "citynamestate": "Buena Park, California"
    },
    {
        "cityid": 21,
        "citynamestate": "Cathedral City, California"
    },
    {
        "cityid": 22,
        "citynamestate": "Chino Hills, California"
    },
    {
        "cityid": 23,
        "citynamestate": "Chula Vista, California"
    },
    {
        "cityid": 24,
        "citynamestate": "Citrus Heights, California"
    },
    {
        "cityid": 25,
        "citynamestate": "Costa Mesa, California"
    }
}
```

</details>

<details>
<summary>POST http://localhost:2019/cities/fav  MUST BE SENT WITH A VALID OKTA TOKEN</summary>

```JSON
VOID - Status 201 created
```

</details>

<details>
<summary>http://localhost:2019/users/users</summary>

```JSON
[
    {
        "userid": 588032,
        "username": "llama005@maildrop.cc",
        "favcities": [
            {
                "city": {
                    "cityid": 185362,
                    "citynamestate": "Bullhead City, Arizona",
                    "statecode": "AZ",
                    "timezone": "UTC-7 Mountain",
                    "latitude": 35.147777399999995,
                    "logitude": -114.5682983,
                    "fpis": "04-0822",
                    "gnis": null,
                    "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Bullhead_City_Arizona_4.jpg/500px-Bullhead_City_Arizona_4.jpg",
                    "website": "http://www.bullheadcity.com/",
                    "population": 40252.0,
                    "densitymisq": 688.6,
                    "densitykmsq": 265.87,
                    "averageage": 53.0,
                    "householdincome": 40566.0,
                    "individualincome": 24404.0,
                    "averagehouse": 135165.0,
                    "rent": 740.0,
                    "costoflivingindex": 87.6,
                    "acastatus": "Adopted",
                    "averagetemp": 73.05833333333334,
                    "averageperc": 0.7625000000000001,
                    "avgnewcovidcases": 1359.354716981132,
                    "zipcodes": [],
                    "counties": [
                        {
                            "name": "Mohave"
                        }
                    ],
                    "populationhist": [
                        {
                            "year": 2010,
                            "pop": 39540.0
                        },
                        {
                            "year": 2011,
                            "pop": 39710.0
                        },
                        {
                            "year": 2012,
                            "pop": 39645.0
                        },
                        {
                            "year": 2013,
                            "pop": 39568.0
                        },
                        {
                            "year": 2014,
                            "pop": 39580.0
                        },
                        {
                            "year": 2015,
                            "pop": 39796.0
                        },
                        {
                            "year": 2016,
                            "pop": 39970.0
                        },
                        {
                            "year": 2017,
                            "pop": 40233.0
                        },
                        {
                            "year": 2018,
                            "pop": 40369.0
                        },
                        {
                            "year": 2019,
                            "pop": 40884.0
                        }
                    ],
                    "historicalincome": [
                        {
                            "year": 2019,
                            "individualincome": 40198,
                            "householdincome": 62055
                        },
                        {
                            "year": 2018,
                            "individualincome": 38032,
                            "householdincome": 59246
                        },
                        {
                            "year": 2017,
                            "individualincome": 36607,
                            "householdincome": 56581
                        },
                        {
                            "year": 2016,
                            "individualincome": 34776,
                            "householdincome": 53558
                        },
                        {
                            "year": 2015,
                            "individualincome": 33452,
                            "householdincome": 51492
                        },
                        {
                            "year": 2014,
                            "individualincome": 31889,
                            "householdincome": 50068
                        },
                        {
                            "year": 2013,
                            "individualincome": 31504,
                            "householdincome": 48510
                        },
                        {
                            "year": 2012,
                            "individualincome": 31605,
                            "householdincome": 47826
                        },
                        {
                            "year": 2011,
                            "individualincome": 30542,
                            "householdincome": 46709
                        },
                        {
                            "year": 2010,
                            "individualincome": 31424,
                            "householdincome": 46789
                        }
                    ],
                    "historicalaveragehouse": [
                        {
                            "year": 2010,
                            "month": 1,
                            "housingcost": 140626
                        },
                        {
                            "year": 2010,
                            "month": 2,
                            "housingcost": 140158
                        },
                        {
                            "year": 2010,
                            "month": 3,
                            "housingcost": 139405
                        },
                        {
                            "year": 2010,
                            "month": 4,
                            "housingcost": 138878
                        },
                        {
                            "year": 2010,
                            "month": 5,
                            "housingcost": 136964
                        },
                        {
                            "year": 2010,
                            "month": 6,
                            "housingcost": 135833
                        },
                        {
                            "year": 2010,
                            "month": 7,
                            "housingcost": 134247
                        },
                        {
                            "year": 2010,
                            "month": 8,
                            "housingcost": 133325
                        },
                        {
                            "year": 2010,
                            "month": 9,
                            "housingcost": 132049
                        },
                        {
                            "year": 2010,
                            "month": 10,
                            "housingcost": 130368
                        },
                        {
                            "year": 2010,
                            "month": 11,
                            "housingcost": 128229
                        },
                        {
                            "year": 2010,
                            "month": 12,
                            "housingcost": 125843
                        },
                        {
                            "year": 2011,
                            "month": 1,
                            "housingcost": 123954
                        },
                        {
                            "year": 2011,
                            "month": 2,
                            "housingcost": 122199
                        },
                        {
                            "year": 2011,
                            "month": 3,
                            "housingcost": 121227
                        },
                        {
                            "year": 2011,
                            "month": 4,
                            "housingcost": 120669
                        },
                        {
                            "year": 2011,
                            "month": 5,
                            "housingcost": 120172
                        },
                        {
                            "year": 2011,
                            "month": 6,
                            "housingcost": 119112
                        },
                        {
                            "year": 2011,
                            "month": 7,
                            "housingcost": 117783
                        },
                        {
                            "year": 2011,
                            "month": 8,
                            "housingcost": 117409
                        },
                        {
                            "year": 2011,
                            "month": 9,
                            "housingcost": 117413
                        },
                        {
                            "year": 2011,
                            "month": 10,
                            "housingcost": 118091
                        },
                        {
                            "year": 2011,
                            "month": 11,
                            "housingcost": 118126
                        },
                        {
                            "year": 2011,
                            "month": 12,
                            "housingcost": 118282
                        },
                        {
                            "year": 2012,
                            "month": 1,
                            "housingcost": 118389
                        },
                        {
                            "year": 2012,
                            "month": 2,
                            "housingcost": 118297
                        },
                        {
                            "year": 2012,
                            "month": 3,
                            "housingcost": 117976
                        },
                        {
                            "year": 2012,
                            "month": 4,
                            "housingcost": 117160
                        },
                        {
                            "year": 2012,
                            "month": 5,
                            "housingcost": 117702
                        },
                        {
                            "year": 2012,
                            "month": 6,
                            "housingcost": 118313
                        },
                        {
                            "year": 2012,
                            "month": 7,
                            "housingcost": 120069
                        },
                        {
                            "year": 2012,
                            "month": 8,
                            "housingcost": 121119
                        },
                        {
                            "year": 2012,
                            "month": 9,
                            "housingcost": 122681
                        },
                        {
                            "year": 2012,
                            "month": 10,
                            "housingcost": 123372
                        },
                        {
                            "year": 2012,
                            "month": 11,
                            "housingcost": 124542
                        },
                        {
                            "year": 2012,
                            "month": 12,
                            "housingcost": 125474
                        },
                        {
                            "year": 2013,
                            "month": 1,
                            "housingcost": 126222
                        },
                        {
                            "year": 2013,
                            "month": 2,
                            "housingcost": 127283
                        },
                        {
                            "year": 2013,
                            "month": 3,
                            "housingcost": 128496
                        },
                        {
                            "year": 2013,
                            "month": 4,
                            "housingcost": 130639
                        },
                        {
                            "year": 2013,
                            "month": 5,
                            "housingcost": 131785
                        },
                        {
                            "year": 2013,
                            "month": 6,
                            "housingcost": 133271
                        },
                        {
                            "year": 2013,
                            "month": 7,
                            "housingcost": 134206
                        },
                        {
                            "year": 2013,
                            "month": 8,
                            "housingcost": 134590
                        },
                        {
                            "year": 2013,
                            "month": 9,
                            "housingcost": 133969
                        },
                        {
                            "year": 2013,
                            "month": 10,
                            "housingcost": 133546
                        },
                        {
                            "year": 2013,
                            "month": 11,
                            "housingcost": 134122
                        },
                        {
                            "year": 2013,
                            "month": 12,
                            "housingcost": 135605
                        },
                        {
                            "year": 2014,
                            "month": 1,
                            "housingcost": 137892
                        },
                        {
                            "year": 2014,
                            "month": 2,
                            "housingcost": 139939
                        },
                        {
                            "year": 2014,
                            "month": 3,
                            "housingcost": 141369
                        },
                        {
                            "year": 2014,
                            "month": 4,
                            "housingcost": 141303
                        },
                        {
                            "year": 2014,
                            "month": 5,
                            "housingcost": 141630
                        },
                        {
                            "year": 2014,
                            "month": 6,
                            "housingcost": 142196
                        },
                        {
                            "year": 2014,
                            "month": 7,
                            "housingcost": 142517
                        },
                        {
                            "year": 2014,
                            "month": 8,
                            "housingcost": 142946
                        },
                        {
                            "year": 2014,
                            "month": 9,
                            "housingcost": 144203
                        },
                        {
                            "year": 2014,
                            "month": 10,
                            "housingcost": 146107
                        },
                        {
                            "year": 2014,
                            "month": 11,
                            "housingcost": 147137
                        },
                        {
                            "year": 2014,
                            "month": 12,
                            "housingcost": 147198
                        },
                        {
                            "year": 2015,
                            "month": 1,
                            "housingcost": 146655
                        },
                        {
                            "year": 2015,
                            "month": 2,
                            "housingcost": 146683
                        },
                        {
                            "year": 2015,
                            "month": 3,
                            "housingcost": 147182
                        },
                        {
                            "year": 2015,
                            "month": 4,
                            "housingcost": 148727
                        },
                        {
                            "year": 2015,
                            "month": 5,
                            "housingcost": 149685
                        },
                        {
                            "year": 2015,
                            "month": 6,
                            "housingcost": 150184
                        },
                        {
                            "year": 2015,
                            "month": 7,
                            "housingcost": 150782
                        },
                        {
                            "year": 2015,
                            "month": 8,
                            "housingcost": 151912
                        },
                        {
                            "year": 2015,
                            "month": 9,
                            "housingcost": 152562
                        },
                        {
                            "year": 2015,
                            "month": 10,
                            "housingcost": 152454
                        },
                        {
                            "year": 2015,
                            "month": 11,
                            "housingcost": 152427
                        },
                        {
                            "year": 2015,
                            "month": 12,
                            "housingcost": 152947
                        },
                        {
                            "year": 2016,
                            "month": 1,
                            "housingcost": 153983
                        },
                        {
                            "year": 2016,
                            "month": 2,
                            "housingcost": 154162
                        },
                        {
                            "year": 2016,
                            "month": 3,
                            "housingcost": 154484
                        },
                        {
                            "year": 2016,
                            "month": 4,
                            "housingcost": 154380
                        },
                        {
                            "year": 2016,
                            "month": 5,
                            "housingcost": 154942
                        },
                        {
                            "year": 2016,
                            "month": 6,
                            "housingcost": 155487
                        },
                        {
                            "year": 2016,
                            "month": 7,
                            "housingcost": 156122
                        },
                        {
                            "year": 2016,
                            "month": 8,
                            "housingcost": 156625
                        },
                        {
                            "year": 2016,
                            "month": 9,
                            "housingcost": 157234
                        },
                        {
                            "year": 2016,
                            "month": 10,
                            "housingcost": 158285
                        },
                        {
                            "year": 2016,
                            "month": 11,
                            "housingcost": 159349
                        },
                        {
                            "year": 2016,
                            "month": 12,
                            "housingcost": 160094
                        },
                        {
                            "year": 2017,
                            "month": 1,
                            "housingcost": 160247
                        },
                        {
                            "year": 2017,
                            "month": 2,
                            "housingcost": 161000
                        },
                        {
                            "year": 2017,
                            "month": 3,
                            "housingcost": 161840
                        },
                        {
                            "year": 2017,
                            "month": 4,
                            "housingcost": 162787
                        },
                        {
                            "year": 2017,
                            "month": 5,
                            "housingcost": 163625
                        },
                        {
                            "year": 2017,
                            "month": 6,
                            "housingcost": 164341
                        },
                        {
                            "year": 2017,
                            "month": 7,
                            "housingcost": 165053
                        },
                        {
                            "year": 2017,
                            "month": 8,
                            "housingcost": 165487
                        },
                        {
                            "year": 2017,
                            "month": 9,
                            "housingcost": 166145
                        },
                        {
                            "year": 2017,
                            "month": 10,
                            "housingcost": 167144
                        },
                        {
                            "year": 2017,
                            "month": 11,
                            "housingcost": 168072
                        },
                        {
                            "year": 2017,
                            "month": 12,
                            "housingcost": 169024
                        },
                        {
                            "year": 2018,
                            "month": 1,
                            "housingcost": 169940
                        },
                        {
                            "year": 2018,
                            "month": 2,
                            "housingcost": 170684
                        },
                        {
                            "year": 2018,
                            "month": 3,
                            "housingcost": 171584
                        },
                        {
                            "year": 2018,
                            "month": 4,
                            "housingcost": 172821
                        },
                        {
                            "year": 2018,
                            "month": 5,
                            "housingcost": 173932
                        },
                        {
                            "year": 2018,
                            "month": 6,
                            "housingcost": 175171
                        },
                        {
                            "year": 2018,
                            "month": 7,
                            "housingcost": 176128
                        },
                        {
                            "year": 2018,
                            "month": 8,
                            "housingcost": 177578
                        },
                        {
                            "year": 2018,
                            "month": 9,
                            "housingcost": 178985
                        },
                        {
                            "year": 2018,
                            "month": 10,
                            "housingcost": 180209
                        },
                        {
                            "year": 2018,
                            "month": 11,
                            "housingcost": 181811
                        },
                        {
                            "year": 2018,
                            "month": 12,
                            "housingcost": 183392
                        },
                        {
                            "year": 2019,
                            "month": 1,
                            "housingcost": 184981
                        },
                        {
                            "year": 2019,
                            "month": 2,
                            "housingcost": 186258
                        },
                        {
                            "year": 2019,
                            "month": 3,
                            "housingcost": 187295
                        },
                        {
                            "year": 2019,
                            "month": 4,
                            "housingcost": 188188
                        },
                        {
                            "year": 2019,
                            "month": 5,
                            "housingcost": 189595
                        },
                        {
                            "year": 2019,
                            "month": 6,
                            "housingcost": 191294
                        },
                        {
                            "year": 2019,
                            "month": 7,
                            "housingcost": 193299
                        },
                        {
                            "year": 2019,
                            "month": 8,
                            "housingcost": 194519
                        },
                        {
                            "year": 2019,
                            "month": 9,
                            "housingcost": 195551
                        },
                        {
                            "year": 2019,
                            "month": 10,
                            "housingcost": 196653
                        },
                        {
                            "year": 2019,
                            "month": 11,
                            "housingcost": 197751
                        },
                        {
                            "year": 2019,
                            "month": 12,
                            "housingcost": 198974
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "housingcost": 200412
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "housingcost": 202187
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "housingcost": 204150
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "housingcost": 206140
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "housingcost": 207866
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "housingcost": 209411
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "housingcost": 210972
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "housingcost": 213111
                        }
                    ],
                    "covid": [
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 30,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 31,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 26,
                            "cases": 2
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 27,
                            "cases": 4
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 28,
                            "cases": 5
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 29,
                            "cases": 6
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 30,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 31,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 1,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 2,
                            "cases": 8
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 3,
                            "cases": 9
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 4,
                            "cases": 12
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 5,
                            "cases": 16
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 6,
                            "cases": 20
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 7,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 8,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 9,
                            "cases": 27
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 10,
                            "cases": 28
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 11,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 12,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 13,
                            "cases": 40
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 14,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 15,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 16,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 17,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 18,
                            "cases": 52
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 19,
                            "cases": 54
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 20,
                            "cases": 56
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 21,
                            "cases": 59
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 22,
                            "cases": 62
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 23,
                            "cases": 69
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 24,
                            "cases": 73
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 25,
                            "cases": 81
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 26,
                            "cases": 88
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 27,
                            "cases": 96
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 28,
                            "cases": 99
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 29,
                            "cases": 105
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 30,
                            "cases": 117
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 1,
                            "cases": 122
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 2,
                            "cases": 127
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 3,
                            "cases": 135
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 4,
                            "cases": 141
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 5,
                            "cases": 147
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 6,
                            "cases": 150
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 7,
                            "cases": 158
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 8,
                            "cases": 171
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 9,
                            "cases": 178
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 10,
                            "cases": 193
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 11,
                            "cases": 198
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 12,
                            "cases": 207
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 13,
                            "cases": 213
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 14,
                            "cases": 220
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 15,
                            "cases": 242
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 16,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 17,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 18,
                            "cases": 251
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 19,
                            "cases": 262
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 20,
                            "cases": 267
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 21,
                            "cases": 277
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 22,
                            "cases": 288
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 23,
                            "cases": 303
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 24,
                            "cases": 304
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 25,
                            "cases": 319
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 26,
                            "cases": 329
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 27,
                            "cases": 339
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 28,
                            "cases": 350
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 29,
                            "cases": 369
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 30,
                            "cases": 383
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 31,
                            "cases": 396
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 1,
                            "cases": 403
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 2,
                            "cases": 409
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 3,
                            "cases": 422
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 4,
                            "cases": 428
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 5,
                            "cases": 447
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 6,
                            "cases": 485
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 7,
                            "cases": 500
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 8,
                            "cases": 512
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 9,
                            "cases": 513
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 10,
                            "cases": 552
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 11,
                            "cases": 563
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 12,
                            "cases": 584
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 13,
                            "cases": 586
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 14,
                            "cases": 589
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 15,
                            "cases": 618
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 16,
                            "cases": 624
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 17,
                            "cases": 636
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 18,
                            "cases": 676
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 19,
                            "cases": 686
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 20,
                            "cases": 717
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 21,
                            "cases": 721
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 22,
                            "cases": 723
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 23,
                            "cases": 813
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 24,
                            "cases": 841
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 25,
                            "cases": 881
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 26,
                            "cases": 927
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 27,
                            "cases": 962
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 28,
                            "cases": 1004
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 29,
                            "cases": 1028
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 30,
                            "cases": 1071
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 1,
                            "cases": 1142
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 2,
                            "cases": 1248
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 3,
                            "cases": 1342
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 4,
                            "cases": 1358
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 5,
                            "cases": 1384
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 6,
                            "cases": 1413
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 7,
                            "cases": 1448
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 8,
                            "cases": 1509
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 9,
                            "cases": 1595
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 10,
                            "cases": 1696
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 11,
                            "cases": 1759
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 12,
                            "cases": 1825
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 13,
                            "cases": 1831
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 14,
                            "cases": 1937
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 15,
                            "cases": 2045
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 16,
                            "cases": 2108
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 17,
                            "cases": 2195
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 18,
                            "cases": 2229
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 19,
                            "cases": 2269
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 20,
                            "cases": 2281
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 21,
                            "cases": 2403
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 22,
                            "cases": 2464
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 23,
                            "cases": 2525
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 24,
                            "cases": 2602
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 25,
                            "cases": 2681
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 26,
                            "cases": 2698
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 27,
                            "cases": 2725
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 28,
                            "cases": 2791
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 29,
                            "cases": 2828
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 30,
                            "cases": 2865
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 31,
                            "cases": 2918
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 1,
                            "cases": 2990
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 2,
                            "cases": 3027
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 3,
                            "cases": 3040
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 4,
                            "cases": 3048
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 5,
                            "cases": 3073
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 6,
                            "cases": 3078
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 7,
                            "cases": 3147
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 8,
                            "cases": 3150
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 9,
                            "cases": 3186
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 10,
                            "cases": 3202
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 11,
                            "cases": 3226
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 12,
                            "cases": 3250
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 13,
                            "cases": 3285
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 14,
                            "cases": 3294
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 15,
                            "cases": 3348
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 16,
                            "cases": 3363
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 17,
                            "cases": 3368
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 18,
                            "cases": 3383
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 19,
                            "cases": 3411
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 20,
                            "cases": 3454
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 21,
                            "cases": 3468
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 22,
                            "cases": 3484
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 23,
                            "cases": 3489
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 24,
                            "cases": 3500
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 25,
                            "cases": 3534
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 26,
                            "cases": 3541
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 27,
                            "cases": 3566
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 28,
                            "cases": 3585
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 29,
                            "cases": 3597
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 30,
                            "cases": 3606
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 31,
                            "cases": 3615
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 1,
                            "cases": 3639
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 2,
                            "cases": 3651
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 3,
                            "cases": 3675
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 4,
                            "cases": 3700
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 5,
                            "cases": 3747
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 6,
                            "cases": 3761
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 7,
                            "cases": 3762
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 8,
                            "cases": 3757
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 9,
                            "cases": 3769
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 10,
                            "cases": 3776
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 11,
                            "cases": 3781
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 12,
                            "cases": 3787
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 13,
                            "cases": 3790
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 14,
                            "cases": 3792
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 15,
                            "cases": 3798
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 16,
                            "cases": 3811
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 17,
                            "cases": 3817
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 18,
                            "cases": 3886
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 19,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 20,
                            "cases": 3896
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 21,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 22,
                            "cases": 3914
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 23,
                            "cases": 3930
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 24,
                            "cases": 3947
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 25,
                            "cases": 3957
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 26,
                            "cases": 3978
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 27,
                            "cases": 3977
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 28,
                            "cases": 3985
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 29,
                            "cases": 3997
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 30,
                            "cases": 4004
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 1,
                            "cases": 4017
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 2,
                            "cases": 4033
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 3,
                            "cases": 4048
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 4,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 5,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 6,
                            "cases": 4068
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 7,
                            "cases": 4075
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 8,
                            "cases": 4079
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 9,
                            "cases": 4078
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 10,
                            "cases": 4090
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 11,
                            "cases": 4089
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 12,
                            "cases": 4089
                        }
                    ],
                    "historicalweather": [
                        {
                            "month": "Sep",
                            "precipitation": 0.33,
                            "temperature": 87.2
                        },
                        {
                            "month": "Mar",
                            "precipitation": 0.39,
                            "temperature": 63.7
                        },
                        {
                            "month": "Nov",
                            "precipitation": 2.93,
                            "temperature": 63.5
                        },
                        {
                            "month": "Apr",
                            "precipitation": 0.49,
                            "temperature": 74.7
                        },
                        {
                            "month": "Dec",
                            "precipitation": 1.35,
                            "temperature": 52.8
                        },
                        {
                            "month": "Jan",
                            "precipitation": 1.67,
                            "temperature": 54.1
                        },
                        {
                            "month": "Jun",
                            "precipitation": 0.0,
                            "temperature": 89.6
                        },
                        {
                            "month": "Oct",
                            "precipitation": 0.0,
                            "temperature": 71.4
                        },
                        {
                            "month": "Jul",
                            "precipitation": 0.02,
                            "temperature": 96.1
                        },
                        {
                            "month": "May",
                            "precipitation": 0.13,
                            "temperature": 75.9
                        },
                        {
                            "month": "Feb",
                            "precipitation": 1.71,
                            "temperature": 51.5
                        },
                        {
                            "month": "Aug",
                            "precipitation": 0.13,
                            "temperature": 96.2
                        }
                    ]
                }
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/users/user/7</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/cinnamon</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/like/da</summary>

```JSON
[]
```

</details>

<details>
<summary>POST http://localhost:2019/users/user</summary>

DATA

```JSON
[
    {
        "userid": 588032,
        "username": "llama005@maildrop.cc",
        "favcities": [
            {
                "city": {
                    "cityid": 185362,
                    "citynamestate": "Bullhead City, Arizona",
                    "statecode": "AZ",
                    "timezone": "UTC-7 Mountain",
                    "latitude": 35.147777399999995,
                    "logitude": -114.5682983,
                    "fpis": "04-0822",
                    "gnis": null,
                    "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Bullhead_City_Arizona_4.jpg/500px-Bullhead_City_Arizona_4.jpg",
                    "website": "http://www.bullheadcity.com/",
                    "population": 40252.0,
                    "densitymisq": 688.6,
                    "densitykmsq": 265.87,
                    "averageage": 53.0,
                    "householdincome": 40566.0,
                    "individualincome": 24404.0,
                    "averagehouse": 135165.0,
                    "rent": 740.0,
                    "costoflivingindex": 87.6,
                    "acastatus": "Adopted",
                    "averagetemp": 73.05833333333334,
                    "averageperc": 0.7625000000000001,
                    "avgnewcovidcases": 1359.354716981132,
                    "zipcodes": [],
                    "counties": [
                        {
                            "name": "Mohave"
                        }
                    ],
                    "populationhist": [
                        {
                            "year": 2010,
                            "pop": 39540.0
                        },
                        {
                            "year": 2011,
                            "pop": 39710.0
                        },
                        {
                            "year": 2012,
                            "pop": 39645.0
                        },
                        {
                            "year": 2013,
                            "pop": 39568.0
                        },
                        {
                            "year": 2014,
                            "pop": 39580.0
                        },
                        {
                            "year": 2015,
                            "pop": 39796.0
                        },
                        {
                            "year": 2016,
                            "pop": 39970.0
                        },
                        {
                            "year": 2017,
                            "pop": 40233.0
                        },
                        {
                            "year": 2018,
                            "pop": 40369.0
                        },
                        {
                            "year": 2019,
                            "pop": 40884.0
                        }
                    ],
                    "historicalincome": [
                        {
                            "year": 2019,
                            "individualincome": 40198,
                            "householdincome": 62055
                        },
                        {
                            "year": 2018,
                            "individualincome": 38032,
                            "householdincome": 59246
                        },
                        {
                            "year": 2017,
                            "individualincome": 36607,
                            "householdincome": 56581
                        },
                        {
                            "year": 2016,
                            "individualincome": 34776,
                            "householdincome": 53558
                        },
                        {
                            "year": 2015,
                            "individualincome": 33452,
                            "householdincome": 51492
                        },
                        {
                            "year": 2014,
                            "individualincome": 31889,
                            "householdincome": 50068
                        },
                        {
                            "year": 2013,
                            "individualincome": 31504,
                            "householdincome": 48510
                        },
                        {
                            "year": 2012,
                            "individualincome": 31605,
                            "householdincome": 47826
                        },
                        {
                            "year": 2011,
                            "individualincome": 30542,
                            "householdincome": 46709
                        },
                        {
                            "year": 2010,
                            "individualincome": 31424,
                            "householdincome": 46789
                        }
                    ],
                    "historicalaveragehouse": [
                        {
                            "year": 2010,
                            "month": 1,
                            "housingcost": 140626
                        },
                        {
                            "year": 2010,
                            "month": 2,
                            "housingcost": 140158
                        },
                        {
                            "year": 2010,
                            "month": 3,
                            "housingcost": 139405
                        },
                        {
                            "year": 2010,
                            "month": 4,
                            "housingcost": 138878
                        },
                        {
                            "year": 2010,
                            "month": 5,
                            "housingcost": 136964
                        },
                        {
                            "year": 2010,
                            "month": 6,
                            "housingcost": 135833
                        },
                        {
                            "year": 2010,
                            "month": 7,
                            "housingcost": 134247
                        },
                        {
                            "year": 2010,
                            "month": 8,
                            "housingcost": 133325
                        },
                        {
                            "year": 2010,
                            "month": 9,
                            "housingcost": 132049
                        },
                        {
                            "year": 2010,
                            "month": 10,
                            "housingcost": 130368
                        },
                        {
                            "year": 2010,
                            "month": 11,
                            "housingcost": 128229
                        },
                        {
                            "year": 2010,
                            "month": 12,
                            "housingcost": 125843
                        },
                        {
                            "year": 2011,
                            "month": 1,
                            "housingcost": 123954
                        },
                        {
                            "year": 2011,
                            "month": 2,
                            "housingcost": 122199
                        },
                        {
                            "year": 2011,
                            "month": 3,
                            "housingcost": 121227
                        },
                        {
                            "year": 2011,
                            "month": 4,
                            "housingcost": 120669
                        },
                        {
                            "year": 2011,
                            "month": 5,
                            "housingcost": 120172
                        },
                        {
                            "year": 2011,
                            "month": 6,
                            "housingcost": 119112
                        },
                        {
                            "year": 2011,
                            "month": 7,
                            "housingcost": 117783
                        },
                        {
                            "year": 2011,
                            "month": 8,
                            "housingcost": 117409
                        },
                        {
                            "year": 2011,
                            "month": 9,
                            "housingcost": 117413
                        },
                        {
                            "year": 2011,
                            "month": 10,
                            "housingcost": 118091
                        },
                        {
                            "year": 2011,
                            "month": 11,
                            "housingcost": 118126
                        },
                        {
                            "year": 2011,
                            "month": 12,
                            "housingcost": 118282
                        },
                        {
                            "year": 2012,
                            "month": 1,
                            "housingcost": 118389
                        },
                        {
                            "year": 2012,
                            "month": 2,
                            "housingcost": 118297
                        },
                        {
                            "year": 2012,
                            "month": 3,
                            "housingcost": 117976
                        },
                        {
                            "year": 2012,
                            "month": 4,
                            "housingcost": 117160
                        },
                        {
                            "year": 2012,
                            "month": 5,
                            "housingcost": 117702
                        },
                        {
                            "year": 2012,
                            "month": 6,
                            "housingcost": 118313
                        },
                        {
                            "year": 2012,
                            "month": 7,
                            "housingcost": 120069
                        },
                        {
                            "year": 2012,
                            "month": 8,
                            "housingcost": 121119
                        },
                        {
                            "year": 2012,
                            "month": 9,
                            "housingcost": 122681
                        },
                        {
                            "year": 2012,
                            "month": 10,
                            "housingcost": 123372
                        },
                        {
                            "year": 2012,
                            "month": 11,
                            "housingcost": 124542
                        },
                        {
                            "year": 2012,
                            "month": 12,
                            "housingcost": 125474
                        },
                        {
                            "year": 2013,
                            "month": 1,
                            "housingcost": 126222
                        },
                        {
                            "year": 2013,
                            "month": 2,
                            "housingcost": 127283
                        },
                        {
                            "year": 2013,
                            "month": 3,
                            "housingcost": 128496
                        },
                        {
                            "year": 2013,
                            "month": 4,
                            "housingcost": 130639
                        },
                        {
                            "year": 2013,
                            "month": 5,
                            "housingcost": 131785
                        },
                        {
                            "year": 2013,
                            "month": 6,
                            "housingcost": 133271
                        },
                        {
                            "year": 2013,
                            "month": 7,
                            "housingcost": 134206
                        },
                        {
                            "year": 2013,
                            "month": 8,
                            "housingcost": 134590
                        },
                        {
                            "year": 2013,
                            "month": 9,
                            "housingcost": 133969
                        },
                        {
                            "year": 2013,
                            "month": 10,
                            "housingcost": 133546
                        },
                        {
                            "year": 2013,
                            "month": 11,
                            "housingcost": 134122
                        },
                        {
                            "year": 2013,
                            "month": 12,
                            "housingcost": 135605
                        },
                        {
                            "year": 2014,
                            "month": 1,
                            "housingcost": 137892
                        },
                        {
                            "year": 2014,
                            "month": 2,
                            "housingcost": 139939
                        },
                        {
                            "year": 2014,
                            "month": 3,
                            "housingcost": 141369
                        },
                        {
                            "year": 2014,
                            "month": 4,
                            "housingcost": 141303
                        },
                        {
                            "year": 2014,
                            "month": 5,
                            "housingcost": 141630
                        },
                        {
                            "year": 2014,
                            "month": 6,
                            "housingcost": 142196
                        },
                        {
                            "year": 2014,
                            "month": 7,
                            "housingcost": 142517
                        },
                        {
                            "year": 2014,
                            "month": 8,
                            "housingcost": 142946
                        },
                        {
                            "year": 2014,
                            "month": 9,
                            "housingcost": 144203
                        },
                        {
                            "year": 2014,
                            "month": 10,
                            "housingcost": 146107
                        },
                        {
                            "year": 2014,
                            "month": 11,
                            "housingcost": 147137
                        },
                        {
                            "year": 2014,
                            "month": 12,
                            "housingcost": 147198
                        },
                        {
                            "year": 2015,
                            "month": 1,
                            "housingcost": 146655
                        },
                        {
                            "year": 2015,
                            "month": 2,
                            "housingcost": 146683
                        },
                        {
                            "year": 2015,
                            "month": 3,
                            "housingcost": 147182
                        },
                        {
                            "year": 2015,
                            "month": 4,
                            "housingcost": 148727
                        },
                        {
                            "year": 2015,
                            "month": 5,
                            "housingcost": 149685
                        },
                        {
                            "year": 2015,
                            "month": 6,
                            "housingcost": 150184
                        },
                        {
                            "year": 2015,
                            "month": 7,
                            "housingcost": 150782
                        },
                        {
                            "year": 2015,
                            "month": 8,
                            "housingcost": 151912
                        },
                        {
                            "year": 2015,
                            "month": 9,
                            "housingcost": 152562
                        },
                        {
                            "year": 2015,
                            "month": 10,
                            "housingcost": 152454
                        },
                        {
                            "year": 2015,
                            "month": 11,
                            "housingcost": 152427
                        },
                        {
                            "year": 2015,
                            "month": 12,
                            "housingcost": 152947
                        },
                        {
                            "year": 2016,
                            "month": 1,
                            "housingcost": 153983
                        },
                        {
                            "year": 2016,
                            "month": 2,
                            "housingcost": 154162
                        },
                        {
                            "year": 2016,
                            "month": 3,
                            "housingcost": 154484
                        },
                        {
                            "year": 2016,
                            "month": 4,
                            "housingcost": 154380
                        },
                        {
                            "year": 2016,
                            "month": 5,
                            "housingcost": 154942
                        },
                        {
                            "year": 2016,
                            "month": 6,
                            "housingcost": 155487
                        },
                        {
                            "year": 2016,
                            "month": 7,
                            "housingcost": 156122
                        },
                        {
                            "year": 2016,
                            "month": 8,
                            "housingcost": 156625
                        },
                        {
                            "year": 2016,
                            "month": 9,
                            "housingcost": 157234
                        },
                        {
                            "year": 2016,
                            "month": 10,
                            "housingcost": 158285
                        },
                        {
                            "year": 2016,
                            "month": 11,
                            "housingcost": 159349
                        },
                        {
                            "year": 2016,
                            "month": 12,
                            "housingcost": 160094
                        },
                        {
                            "year": 2017,
                            "month": 1,
                            "housingcost": 160247
                        },
                        {
                            "year": 2017,
                            "month": 2,
                            "housingcost": 161000
                        },
                        {
                            "year": 2017,
                            "month": 3,
                            "housingcost": 161840
                        },
                        {
                            "year": 2017,
                            "month": 4,
                            "housingcost": 162787
                        },
                        {
                            "year": 2017,
                            "month": 5,
                            "housingcost": 163625
                        },
                        {
                            "year": 2017,
                            "month": 6,
                            "housingcost": 164341
                        },
                        {
                            "year": 2017,
                            "month": 7,
                            "housingcost": 165053
                        },
                        {
                            "year": 2017,
                            "month": 8,
                            "housingcost": 165487
                        },
                        {
                            "year": 2017,
                            "month": 9,
                            "housingcost": 166145
                        },
                        {
                            "year": 2017,
                            "month": 10,
                            "housingcost": 167144
                        },
                        {
                            "year": 2017,
                            "month": 11,
                            "housingcost": 168072
                        },
                        {
                            "year": 2017,
                            "month": 12,
                            "housingcost": 169024
                        },
                        {
                            "year": 2018,
                            "month": 1,
                            "housingcost": 169940
                        },
                        {
                            "year": 2018,
                            "month": 2,
                            "housingcost": 170684
                        },
                        {
                            "year": 2018,
                            "month": 3,
                            "housingcost": 171584
                        },
                        {
                            "year": 2018,
                            "month": 4,
                            "housingcost": 172821
                        },
                        {
                            "year": 2018,
                            "month": 5,
                            "housingcost": 173932
                        },
                        {
                            "year": 2018,
                            "month": 6,
                            "housingcost": 175171
                        },
                        {
                            "year": 2018,
                            "month": 7,
                            "housingcost": 176128
                        },
                        {
                            "year": 2018,
                            "month": 8,
                            "housingcost": 177578
                        },
                        {
                            "year": 2018,
                            "month": 9,
                            "housingcost": 178985
                        },
                        {
                            "year": 2018,
                            "month": 10,
                            "housingcost": 180209
                        },
                        {
                            "year": 2018,
                            "month": 11,
                            "housingcost": 181811
                        },
                        {
                            "year": 2018,
                            "month": 12,
                            "housingcost": 183392
                        },
                        {
                            "year": 2019,
                            "month": 1,
                            "housingcost": 184981
                        },
                        {
                            "year": 2019,
                            "month": 2,
                            "housingcost": 186258
                        },
                        {
                            "year": 2019,
                            "month": 3,
                            "housingcost": 187295
                        },
                        {
                            "year": 2019,
                            "month": 4,
                            "housingcost": 188188
                        },
                        {
                            "year": 2019,
                            "month": 5,
                            "housingcost": 189595
                        },
                        {
                            "year": 2019,
                            "month": 6,
                            "housingcost": 191294
                        },
                        {
                            "year": 2019,
                            "month": 7,
                            "housingcost": 193299
                        },
                        {
                            "year": 2019,
                            "month": 8,
                            "housingcost": 194519
                        },
                        {
                            "year": 2019,
                            "month": 9,
                            "housingcost": 195551
                        },
                        {
                            "year": 2019,
                            "month": 10,
                            "housingcost": 196653
                        },
                        {
                            "year": 2019,
                            "month": 11,
                            "housingcost": 197751
                        },
                        {
                            "year": 2019,
                            "month": 12,
                            "housingcost": 198974
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "housingcost": 200412
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "housingcost": 202187
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "housingcost": 204150
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "housingcost": 206140
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "housingcost": 207866
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "housingcost": 209411
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "housingcost": 210972
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "housingcost": 213111
                        }
                    ],
                    "covid": [
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 30,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 31,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 26,
                            "cases": 2
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 27,
                            "cases": 4
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 28,
                            "cases": 5
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 29,
                            "cases": 6
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 30,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 31,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 1,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 2,
                            "cases": 8
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 3,
                            "cases": 9
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 4,
                            "cases": 12
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 5,
                            "cases": 16
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 6,
                            "cases": 20
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 7,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 8,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 9,
                            "cases": 27
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 10,
                            "cases": 28
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 11,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 12,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 13,
                            "cases": 40
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 14,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 15,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 16,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 17,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 18,
                            "cases": 52
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 19,
                            "cases": 54
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 20,
                            "cases": 56
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 21,
                            "cases": 59
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 22,
                            "cases": 62
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 23,
                            "cases": 69
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 24,
                            "cases": 73
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 25,
                            "cases": 81
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 26,
                            "cases": 88
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 27,
                            "cases": 96
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 28,
                            "cases": 99
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 29,
                            "cases": 105
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 30,
                            "cases": 117
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 1,
                            "cases": 122
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 2,
                            "cases": 127
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 3,
                            "cases": 135
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 4,
                            "cases": 141
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 5,
                            "cases": 147
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 6,
                            "cases": 150
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 7,
                            "cases": 158
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 8,
                            "cases": 171
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 9,
                            "cases": 178
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 10,
                            "cases": 193
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 11,
                            "cases": 198
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 12,
                            "cases": 207
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 13,
                            "cases": 213
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 14,
                            "cases": 220
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 15,
                            "cases": 242
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 16,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 17,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 18,
                            "cases": 251
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 19,
                            "cases": 262
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 20,
                            "cases": 267
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 21,
                            "cases": 277
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 22,
                            "cases": 288
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 23,
                            "cases": 303
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 24,
                            "cases": 304
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 25,
                            "cases": 319
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 26,
                            "cases": 329
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 27,
                            "cases": 339
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 28,
                            "cases": 350
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 29,
                            "cases": 369
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 30,
                            "cases": 383
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 31,
                            "cases": 396
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 1,
                            "cases": 403
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 2,
                            "cases": 409
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 3,
                            "cases": 422
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 4,
                            "cases": 428
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 5,
                            "cases": 447
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 6,
                            "cases": 485
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 7,
                            "cases": 500
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 8,
                            "cases": 512
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 9,
                            "cases": 513
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 10,
                            "cases": 552
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 11,
                            "cases": 563
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 12,
                            "cases": 584
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 13,
                            "cases": 586
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 14,
                            "cases": 589
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 15,
                            "cases": 618
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 16,
                            "cases": 624
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 17,
                            "cases": 636
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 18,
                            "cases": 676
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 19,
                            "cases": 686
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 20,
                            "cases": 717
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 21,
                            "cases": 721
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 22,
                            "cases": 723
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 23,
                            "cases": 813
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 24,
                            "cases": 841
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 25,
                            "cases": 881
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 26,
                            "cases": 927
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 27,
                            "cases": 962
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 28,
                            "cases": 1004
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 29,
                            "cases": 1028
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 30,
                            "cases": 1071
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 1,
                            "cases": 1142
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 2,
                            "cases": 1248
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 3,
                            "cases": 1342
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 4,
                            "cases": 1358
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 5,
                            "cases": 1384
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 6,
                            "cases": 1413
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 7,
                            "cases": 1448
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 8,
                            "cases": 1509
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 9,
                            "cases": 1595
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 10,
                            "cases": 1696
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 11,
                            "cases": 1759
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 12,
                            "cases": 1825
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 13,
                            "cases": 1831
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 14,
                            "cases": 1937
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 15,
                            "cases": 2045
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 16,
                            "cases": 2108
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 17,
                            "cases": 2195
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 18,
                            "cases": 2229
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 19,
                            "cases": 2269
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 20,
                            "cases": 2281
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 21,
                            "cases": 2403
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 22,
                            "cases": 2464
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 23,
                            "cases": 2525
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 24,
                            "cases": 2602
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 25,
                            "cases": 2681
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 26,
                            "cases": 2698
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 27,
                            "cases": 2725
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 28,
                            "cases": 2791
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 29,
                            "cases": 2828
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 30,
                            "cases": 2865
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 31,
                            "cases": 2918
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 1,
                            "cases": 2990
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 2,
                            "cases": 3027
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 3,
                            "cases": 3040
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 4,
                            "cases": 3048
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 5,
                            "cases": 3073
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 6,
                            "cases": 3078
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 7,
                            "cases": 3147
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 8,
                            "cases": 3150
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 9,
                            "cases": 3186
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 10,
                            "cases": 3202
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 11,
                            "cases": 3226
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 12,
                            "cases": 3250
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 13,
                            "cases": 3285
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 14,
                            "cases": 3294
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 15,
                            "cases": 3348
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 16,
                            "cases": 3363
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 17,
                            "cases": 3368
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 18,
                            "cases": 3383
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 19,
                            "cases": 3411
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 20,
                            "cases": 3454
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 21,
                            "cases": 3468
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 22,
                            "cases": 3484
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 23,
                            "cases": 3489
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 24,
                            "cases": 3500
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 25,
                            "cases": 3534
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 26,
                            "cases": 3541
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 27,
                            "cases": 3566
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 28,
                            "cases": 3585
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 29,
                            "cases": 3597
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 30,
                            "cases": 3606
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 31,
                            "cases": 3615
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 1,
                            "cases": 3639
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 2,
                            "cases": 3651
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 3,
                            "cases": 3675
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 4,
                            "cases": 3700
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 5,
                            "cases": 3747
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 6,
                            "cases": 3761
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 7,
                            "cases": 3762
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 8,
                            "cases": 3757
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 9,
                            "cases": 3769
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 10,
                            "cases": 3776
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 11,
                            "cases": 3781
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 12,
                            "cases": 3787
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 13,
                            "cases": 3790
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 14,
                            "cases": 3792
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 15,
                            "cases": 3798
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 16,
                            "cases": 3811
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 17,
                            "cases": 3817
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 18,
                            "cases": 3886
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 19,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 20,
                            "cases": 3896
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 21,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 22,
                            "cases": 3914
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 23,
                            "cases": 3930
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 24,
                            "cases": 3947
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 25,
                            "cases": 3957
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 26,
                            "cases": 3978
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 27,
                            "cases": 3977
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 28,
                            "cases": 3985
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 29,
                            "cases": 3997
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 30,
                            "cases": 4004
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 1,
                            "cases": 4017
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 2,
                            "cases": 4033
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 3,
                            "cases": 4048
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 4,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 5,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 6,
                            "cases": 4068
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 7,
                            "cases": 4075
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 8,
                            "cases": 4079
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 9,
                            "cases": 4078
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 10,
                            "cases": 4090
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 11,
                            "cases": 4089
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 12,
                            "cases": 4089
                        }
                    ],
                    "historicalweather": [
                        {
                            "month": "Sep",
                            "precipitation": 0.33,
                            "temperature": 87.2
                        },
                        {
                            "month": "Mar",
                            "precipitation": 0.39,
                            "temperature": 63.7
                        },
                        {
                            "month": "Nov",
                            "precipitation": 2.93,
                            "temperature": 63.5
                        },
                        {
                            "month": "Apr",
                            "precipitation": 0.49,
                            "temperature": 74.7
                        },
                        {
                            "month": "Dec",
                            "precipitation": 1.35,
                            "temperature": 52.8
                        },
                        {
                            "month": "Jan",
                            "precipitation": 1.67,
                            "temperature": 54.1
                        },
                        {
                            "month": "Jun",
                            "precipitation": 0.0,
                            "temperature": 89.6
                        },
                        {
                            "month": "Oct",
                            "precipitation": 0.0,
                            "temperature": 71.4
                        },
                        {
                            "month": "Jul",
                            "precipitation": 0.02,
                            "temperature": 96.1
                        },
                        {
                            "month": "May",
                            "precipitation": 0.13,
                            "temperature": 75.9
                        },
                        {
                            "month": "Feb",
                            "precipitation": 1.71,
                            "temperature": 51.5
                        },
                        {
                            "month": "Aug",
                            "precipitation": 0.13,
                            "temperature": 96.2
                        }
                    ]
                }
            }
        ]
    }
]
```

OUTPUT

```TEXT
No Body Data

Location Header: http://localhost:2019/users/user/17
Status 201 Created
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/mojo</summary>

</details>

<details>
<summary>PUT http://localhost:2019/users/user/14</summary>

DATA

```JSON
{
    "username": "stumps",
    "primaryemail": "stumps@lambdaschool.local",
    "password" : "EarlGray123",
    "useremails": [
        {
            "useremail": "stumps@mymail.local"
        },
        {
            "useremail": "stumps@email.local"
        }
        ],
    "roles": [
        {  
            "role": {
                "roleid": 3
            }
        },
        {  
            "role": {
                "roleid": 1
            }
        }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/stumps</summary>

```JSON
{
    "userid": 16,
    "username": "stumps",
    "primaryemail": "stumps@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 19,
            "useremail": "stumps@mymail.local"
        },
        {
            "useremailid": 20,
            "useremail": "stumps@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 1,
                "name": "ADMIN"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "DATA"
            }
        }
    ]
}
```

</details>

<details>
<summary>PATCH http://localhost:2019/users/user/7</summary>

DATA

```JSON
[
    {
        "userid": 588032,
        "username": "llama005@maildrop.cc",
        "favcities": [
            {
                "city": {
                    "cityid": 185362,
                    "citynamestate": "Bullhead City, Arizona",
                    "statecode": "AZ",
                    "timezone": "UTC-7 Mountain",
                    "latitude": 35.147777399999995,
                    "logitude": -114.5682983,
                    "fpis": "04-0822",
                    "gnis": null,
                    "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Bullhead_City_Arizona_4.jpg/500px-Bullhead_City_Arizona_4.jpg",
                    "website": "http://www.bullheadcity.com/",
                    "population": 40252.0,
                    "densitymisq": 688.6,
                    "densitykmsq": 265.87,
                    "averageage": 53.0,
                    "householdincome": 40566.0,
                    "individualincome": 24404.0,
                    "averagehouse": 135165.0,
                    "rent": 740.0,
                    "costoflivingindex": 87.6,
                    "acastatus": "Adopted",
                    "averagetemp": 73.05833333333334,
                    "averageperc": 0.7625000000000001,
                    "avgnewcovidcases": 1359.354716981132,
                    "zipcodes": [],
                    "counties": [
                        {
                            "name": "Mohave"
                        }
                    ],
                    "populationhist": [
                        {
                            "year": 2010,
                            "pop": 39540.0
                        },
                        {
                            "year": 2011,
                            "pop": 39710.0
                        },
                        {
                            "year": 2012,
                            "pop": 39645.0
                        },
                        {
                            "year": 2013,
                            "pop": 39568.0
                        },
                        {
                            "year": 2014,
                            "pop": 39580.0
                        },
                        {
                            "year": 2015,
                            "pop": 39796.0
                        },
                        {
                            "year": 2016,
                            "pop": 39970.0
                        },
                        {
                            "year": 2017,
                            "pop": 40233.0
                        },
                        {
                            "year": 2018,
                            "pop": 40369.0
                        },
                        {
                            "year": 2019,
                            "pop": 40884.0
                        }
                    ],
                    "historicalincome": [
                        {
                            "year": 2019,
                            "individualincome": 40198,
                            "householdincome": 62055
                        },
                        {
                            "year": 2018,
                            "individualincome": 38032,
                            "householdincome": 59246
                        },
                        {
                            "year": 2017,
                            "individualincome": 36607,
                            "householdincome": 56581
                        },
                        {
                            "year": 2016,
                            "individualincome": 34776,
                            "householdincome": 53558
                        },
                        {
                            "year": 2015,
                            "individualincome": 33452,
                            "householdincome": 51492
                        },
                        {
                            "year": 2014,
                            "individualincome": 31889,
                            "householdincome": 50068
                        },
                        {
                            "year": 2013,
                            "individualincome": 31504,
                            "householdincome": 48510
                        },
                        {
                            "year": 2012,
                            "individualincome": 31605,
                            "householdincome": 47826
                        },
                        {
                            "year": 2011,
                            "individualincome": 30542,
                            "householdincome": 46709
                        },
                        {
                            "year": 2010,
                            "individualincome": 31424,
                            "householdincome": 46789
                        }
                    ],
                    "historicalaveragehouse": [
                        {
                            "year": 2010,
                            "month": 1,
                            "housingcost": 140626
                        },
                        {
                            "year": 2010,
                            "month": 2,
                            "housingcost": 140158
                        },
                        {
                            "year": 2010,
                            "month": 3,
                            "housingcost": 139405
                        },
                        {
                            "year": 2010,
                            "month": 4,
                            "housingcost": 138878
                        },
                        {
                            "year": 2010,
                            "month": 5,
                            "housingcost": 136964
                        },
                        {
                            "year": 2010,
                            "month": 6,
                            "housingcost": 135833
                        },
                        {
                            "year": 2010,
                            "month": 7,
                            "housingcost": 134247
                        },
                        {
                            "year": 2010,
                            "month": 8,
                            "housingcost": 133325
                        },
                        {
                            "year": 2010,
                            "month": 9,
                            "housingcost": 132049
                        },
                        {
                            "year": 2010,
                            "month": 10,
                            "housingcost": 130368
                        },
                        {
                            "year": 2010,
                            "month": 11,
                            "housingcost": 128229
                        },
                        {
                            "year": 2010,
                            "month": 12,
                            "housingcost": 125843
                        },
                        {
                            "year": 2011,
                            "month": 1,
                            "housingcost": 123954
                        },
                        {
                            "year": 2011,
                            "month": 2,
                            "housingcost": 122199
                        },
                        {
                            "year": 2011,
                            "month": 3,
                            "housingcost": 121227
                        },
                        {
                            "year": 2011,
                            "month": 4,
                            "housingcost": 120669
                        },
                        {
                            "year": 2011,
                            "month": 5,
                            "housingcost": 120172
                        },
                        {
                            "year": 2011,
                            "month": 6,
                            "housingcost": 119112
                        },
                        {
                            "year": 2011,
                            "month": 7,
                            "housingcost": 117783
                        },
                        {
                            "year": 2011,
                            "month": 8,
                            "housingcost": 117409
                        },
                        {
                            "year": 2011,
                            "month": 9,
                            "housingcost": 117413
                        },
                        {
                            "year": 2011,
                            "month": 10,
                            "housingcost": 118091
                        },
                        {
                            "year": 2011,
                            "month": 11,
                            "housingcost": 118126
                        },
                        {
                            "year": 2011,
                            "month": 12,
                            "housingcost": 118282
                        },
                        {
                            "year": 2012,
                            "month": 1,
                            "housingcost": 118389
                        },
                        {
                            "year": 2012,
                            "month": 2,
                            "housingcost": 118297
                        },
                        {
                            "year": 2012,
                            "month": 3,
                            "housingcost": 117976
                        },
                        {
                            "year": 2012,
                            "month": 4,
                            "housingcost": 117160
                        },
                        {
                            "year": 2012,
                            "month": 5,
                            "housingcost": 117702
                        },
                        {
                            "year": 2012,
                            "month": 6,
                            "housingcost": 118313
                        },
                        {
                            "year": 2012,
                            "month": 7,
                            "housingcost": 120069
                        },
                        {
                            "year": 2012,
                            "month": 8,
                            "housingcost": 121119
                        },
                        {
                            "year": 2012,
                            "month": 9,
                            "housingcost": 122681
                        },
                        {
                            "year": 2012,
                            "month": 10,
                            "housingcost": 123372
                        },
                        {
                            "year": 2012,
                            "month": 11,
                            "housingcost": 124542
                        },
                        {
                            "year": 2012,
                            "month": 12,
                            "housingcost": 125474
                        },
                        {
                            "year": 2013,
                            "month": 1,
                            "housingcost": 126222
                        },
                        {
                            "year": 2013,
                            "month": 2,
                            "housingcost": 127283
                        },
                        {
                            "year": 2013,
                            "month": 3,
                            "housingcost": 128496
                        },
                        {
                            "year": 2013,
                            "month": 4,
                            "housingcost": 130639
                        },
                        {
                            "year": 2013,
                            "month": 5,
                            "housingcost": 131785
                        },
                        {
                            "year": 2013,
                            "month": 6,
                            "housingcost": 133271
                        },
                        {
                            "year": 2013,
                            "month": 7,
                            "housingcost": 134206
                        },
                        {
                            "year": 2013,
                            "month": 8,
                            "housingcost": 134590
                        },
                        {
                            "year": 2013,
                            "month": 9,
                            "housingcost": 133969
                        },
                        {
                            "year": 2013,
                            "month": 10,
                            "housingcost": 133546
                        },
                        {
                            "year": 2013,
                            "month": 11,
                            "housingcost": 134122
                        },
                        {
                            "year": 2013,
                            "month": 12,
                            "housingcost": 135605
                        },
                        {
                            "year": 2014,
                            "month": 1,
                            "housingcost": 137892
                        },
                        {
                            "year": 2014,
                            "month": 2,
                            "housingcost": 139939
                        },
                        {
                            "year": 2014,
                            "month": 3,
                            "housingcost": 141369
                        },
                        {
                            "year": 2014,
                            "month": 4,
                            "housingcost": 141303
                        },
                        {
                            "year": 2014,
                            "month": 5,
                            "housingcost": 141630
                        },
                        {
                            "year": 2014,
                            "month": 6,
                            "housingcost": 142196
                        },
                        {
                            "year": 2014,
                            "month": 7,
                            "housingcost": 142517
                        },
                        {
                            "year": 2014,
                            "month": 8,
                            "housingcost": 142946
                        },
                        {
                            "year": 2014,
                            "month": 9,
                            "housingcost": 144203
                        },
                        {
                            "year": 2014,
                            "month": 10,
                            "housingcost": 146107
                        },
                        {
                            "year": 2014,
                            "month": 11,
                            "housingcost": 147137
                        },
                        {
                            "year": 2014,
                            "month": 12,
                            "housingcost": 147198
                        },
                        {
                            "year": 2015,
                            "month": 1,
                            "housingcost": 146655
                        },
                        {
                            "year": 2015,
                            "month": 2,
                            "housingcost": 146683
                        },
                        {
                            "year": 2015,
                            "month": 3,
                            "housingcost": 147182
                        },
                        {
                            "year": 2015,
                            "month": 4,
                            "housingcost": 148727
                        },
                        {
                            "year": 2015,
                            "month": 5,
                            "housingcost": 149685
                        },
                        {
                            "year": 2015,
                            "month": 6,
                            "housingcost": 150184
                        },
                        {
                            "year": 2015,
                            "month": 7,
                            "housingcost": 150782
                        },
                        {
                            "year": 2015,
                            "month": 8,
                            "housingcost": 151912
                        },
                        {
                            "year": 2015,
                            "month": 9,
                            "housingcost": 152562
                        },
                        {
                            "year": 2015,
                            "month": 10,
                            "housingcost": 152454
                        },
                        {
                            "year": 2015,
                            "month": 11,
                            "housingcost": 152427
                        },
                        {
                            "year": 2015,
                            "month": 12,
                            "housingcost": 152947
                        },
                        {
                            "year": 2016,
                            "month": 1,
                            "housingcost": 153983
                        },
                        {
                            "year": 2016,
                            "month": 2,
                            "housingcost": 154162
                        },
                        {
                            "year": 2016,
                            "month": 3,
                            "housingcost": 154484
                        },
                        {
                            "year": 2016,
                            "month": 4,
                            "housingcost": 154380
                        },
                        {
                            "year": 2016,
                            "month": 5,
                            "housingcost": 154942
                        },
                        {
                            "year": 2016,
                            "month": 6,
                            "housingcost": 155487
                        },
                        {
                            "year": 2016,
                            "month": 7,
                            "housingcost": 156122
                        },
                        {
                            "year": 2016,
                            "month": 8,
                            "housingcost": 156625
                        },
                        {
                            "year": 2016,
                            "month": 9,
                            "housingcost": 157234
                        },
                        {
                            "year": 2016,
                            "month": 10,
                            "housingcost": 158285
                        },
                        {
                            "year": 2016,
                            "month": 11,
                            "housingcost": 159349
                        },
                        {
                            "year": 2016,
                            "month": 12,
                            "housingcost": 160094
                        },
                        {
                            "year": 2017,
                            "month": 1,
                            "housingcost": 160247
                        },
                        {
                            "year": 2017,
                            "month": 2,
                            "housingcost": 161000
                        },
                        {
                            "year": 2017,
                            "month": 3,
                            "housingcost": 161840
                        },
                        {
                            "year": 2017,
                            "month": 4,
                            "housingcost": 162787
                        },
                        {
                            "year": 2017,
                            "month": 5,
                            "housingcost": 163625
                        },
                        {
                            "year": 2017,
                            "month": 6,
                            "housingcost": 164341
                        },
                        {
                            "year": 2017,
                            "month": 7,
                            "housingcost": 165053
                        },
                        {
                            "year": 2017,
                            "month": 8,
                            "housingcost": 165487
                        },
                        {
                            "year": 2017,
                            "month": 9,
                            "housingcost": 166145
                        },
                        {
                            "year": 2017,
                            "month": 10,
                            "housingcost": 167144
                        },
                        {
                            "year": 2017,
                            "month": 11,
                            "housingcost": 168072
                        },
                        {
                            "year": 2017,
                            "month": 12,
                            "housingcost": 169024
                        },
                        {
                            "year": 2018,
                            "month": 1,
                            "housingcost": 169940
                        },
                        {
                            "year": 2018,
                            "month": 2,
                            "housingcost": 170684
                        },
                        {
                            "year": 2018,
                            "month": 3,
                            "housingcost": 171584
                        },
                        {
                            "year": 2018,
                            "month": 4,
                            "housingcost": 172821
                        },
                        {
                            "year": 2018,
                            "month": 5,
                            "housingcost": 173932
                        },
                        {
                            "year": 2018,
                            "month": 6,
                            "housingcost": 175171
                        },
                        {
                            "year": 2018,
                            "month": 7,
                            "housingcost": 176128
                        },
                        {
                            "year": 2018,
                            "month": 8,
                            "housingcost": 177578
                        },
                        {
                            "year": 2018,
                            "month": 9,
                            "housingcost": 178985
                        },
                        {
                            "year": 2018,
                            "month": 10,
                            "housingcost": 180209
                        },
                        {
                            "year": 2018,
                            "month": 11,
                            "housingcost": 181811
                        },
                        {
                            "year": 2018,
                            "month": 12,
                            "housingcost": 183392
                        },
                        {
                            "year": 2019,
                            "month": 1,
                            "housingcost": 184981
                        },
                        {
                            "year": 2019,
                            "month": 2,
                            "housingcost": 186258
                        },
                        {
                            "year": 2019,
                            "month": 3,
                            "housingcost": 187295
                        },
                        {
                            "year": 2019,
                            "month": 4,
                            "housingcost": 188188
                        },
                        {
                            "year": 2019,
                            "month": 5,
                            "housingcost": 189595
                        },
                        {
                            "year": 2019,
                            "month": 6,
                            "housingcost": 191294
                        },
                        {
                            "year": 2019,
                            "month": 7,
                            "housingcost": 193299
                        },
                        {
                            "year": 2019,
                            "month": 8,
                            "housingcost": 194519
                        },
                        {
                            "year": 2019,
                            "month": 9,
                            "housingcost": 195551
                        },
                        {
                            "year": 2019,
                            "month": 10,
                            "housingcost": 196653
                        },
                        {
                            "year": 2019,
                            "month": 11,
                            "housingcost": 197751
                        },
                        {
                            "year": 2019,
                            "month": 12,
                            "housingcost": 198974
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "housingcost": 200412
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "housingcost": 202187
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "housingcost": 204150
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "housingcost": 206140
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "housingcost": 207866
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "housingcost": 209411
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "housingcost": 210972
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "housingcost": 213111
                        }
                    ],
                    "covid": [
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 30,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 1,
                            "day": 31,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 26,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 27,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 28,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 2,
                            "day": 29,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 1,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 2,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 3,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 4,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 5,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 6,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 7,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 8,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 9,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 10,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 11,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 12,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 13,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 14,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 15,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 16,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 17,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 18,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 19,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 20,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 21,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 22,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 23,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 24,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 25,
                            "cases": 0
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 26,
                            "cases": 2
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 27,
                            "cases": 4
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 28,
                            "cases": 5
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 29,
                            "cases": 6
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 30,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 3,
                            "day": 31,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 1,
                            "cases": 7
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 2,
                            "cases": 8
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 3,
                            "cases": 9
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 4,
                            "cases": 12
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 5,
                            "cases": 16
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 6,
                            "cases": 20
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 7,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 8,
                            "cases": 23
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 9,
                            "cases": 27
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 10,
                            "cases": 28
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 11,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 12,
                            "cases": 30
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 13,
                            "cases": 40
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 14,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 15,
                            "cases": 45
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 16,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 17,
                            "cases": 51
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 18,
                            "cases": 52
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 19,
                            "cases": 54
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 20,
                            "cases": 56
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 21,
                            "cases": 59
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 22,
                            "cases": 62
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 23,
                            "cases": 69
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 24,
                            "cases": 73
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 25,
                            "cases": 81
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 26,
                            "cases": 88
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 27,
                            "cases": 96
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 28,
                            "cases": 99
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 29,
                            "cases": 105
                        },
                        {
                            "year": 2020,
                            "month": 4,
                            "day": 30,
                            "cases": 117
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 1,
                            "cases": 122
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 2,
                            "cases": 127
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 3,
                            "cases": 135
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 4,
                            "cases": 141
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 5,
                            "cases": 147
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 6,
                            "cases": 150
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 7,
                            "cases": 158
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 8,
                            "cases": 171
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 9,
                            "cases": 178
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 10,
                            "cases": 193
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 11,
                            "cases": 198
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 12,
                            "cases": 207
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 13,
                            "cases": 213
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 14,
                            "cases": 220
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 15,
                            "cases": 242
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 16,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 17,
                            "cases": 250
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 18,
                            "cases": 251
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 19,
                            "cases": 262
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 20,
                            "cases": 267
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 21,
                            "cases": 277
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 22,
                            "cases": 288
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 23,
                            "cases": 303
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 24,
                            "cases": 304
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 25,
                            "cases": 319
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 26,
                            "cases": 329
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 27,
                            "cases": 339
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 28,
                            "cases": 350
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 29,
                            "cases": 369
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 30,
                            "cases": 383
                        },
                        {
                            "year": 2020,
                            "month": 5,
                            "day": 31,
                            "cases": 396
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 1,
                            "cases": 403
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 2,
                            "cases": 409
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 3,
                            "cases": 422
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 4,
                            "cases": 428
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 5,
                            "cases": 447
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 6,
                            "cases": 485
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 7,
                            "cases": 500
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 8,
                            "cases": 512
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 9,
                            "cases": 513
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 10,
                            "cases": 552
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 11,
                            "cases": 563
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 12,
                            "cases": 584
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 13,
                            "cases": 586
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 14,
                            "cases": 589
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 15,
                            "cases": 618
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 16,
                            "cases": 624
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 17,
                            "cases": 636
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 18,
                            "cases": 676
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 19,
                            "cases": 686
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 20,
                            "cases": 717
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 21,
                            "cases": 721
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 22,
                            "cases": 723
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 23,
                            "cases": 813
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 24,
                            "cases": 841
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 25,
                            "cases": 881
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 26,
                            "cases": 927
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 27,
                            "cases": 962
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 28,
                            "cases": 1004
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 29,
                            "cases": 1028
                        },
                        {
                            "year": 2020,
                            "month": 6,
                            "day": 30,
                            "cases": 1071
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 1,
                            "cases": 1142
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 2,
                            "cases": 1248
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 3,
                            "cases": 1342
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 4,
                            "cases": 1358
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 5,
                            "cases": 1384
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 6,
                            "cases": 1413
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 7,
                            "cases": 1448
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 8,
                            "cases": 1509
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 9,
                            "cases": 1595
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 10,
                            "cases": 1696
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 11,
                            "cases": 1759
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 12,
                            "cases": 1825
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 13,
                            "cases": 1831
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 14,
                            "cases": 1937
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 15,
                            "cases": 2045
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 16,
                            "cases": 2108
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 17,
                            "cases": 2195
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 18,
                            "cases": 2229
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 19,
                            "cases": 2269
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 20,
                            "cases": 2281
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 21,
                            "cases": 2403
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 22,
                            "cases": 2464
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 23,
                            "cases": 2525
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 24,
                            "cases": 2602
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 25,
                            "cases": 2681
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 26,
                            "cases": 2698
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 27,
                            "cases": 2725
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 28,
                            "cases": 2791
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 29,
                            "cases": 2828
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 30,
                            "cases": 2865
                        },
                        {
                            "year": 2020,
                            "month": 7,
                            "day": 31,
                            "cases": 2918
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 1,
                            "cases": 2990
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 2,
                            "cases": 3027
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 3,
                            "cases": 3040
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 4,
                            "cases": 3048
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 5,
                            "cases": 3073
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 6,
                            "cases": 3078
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 7,
                            "cases": 3147
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 8,
                            "cases": 3150
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 9,
                            "cases": 3186
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 10,
                            "cases": 3202
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 11,
                            "cases": 3226
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 12,
                            "cases": 3250
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 13,
                            "cases": 3285
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 14,
                            "cases": 3294
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 15,
                            "cases": 3348
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 16,
                            "cases": 3363
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 17,
                            "cases": 3368
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 18,
                            "cases": 3383
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 19,
                            "cases": 3411
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 20,
                            "cases": 3454
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 21,
                            "cases": 3468
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 22,
                            "cases": 3484
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 23,
                            "cases": 3489
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 24,
                            "cases": 3500
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 25,
                            "cases": 3534
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 26,
                            "cases": 3541
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 27,
                            "cases": 3566
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 28,
                            "cases": 3585
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 29,
                            "cases": 3597
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 30,
                            "cases": 3606
                        },
                        {
                            "year": 2020,
                            "month": 8,
                            "day": 31,
                            "cases": 3615
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 1,
                            "cases": 3639
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 2,
                            "cases": 3651
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 3,
                            "cases": 3675
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 4,
                            "cases": 3700
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 5,
                            "cases": 3747
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 6,
                            "cases": 3761
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 7,
                            "cases": 3762
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 8,
                            "cases": 3757
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 9,
                            "cases": 3769
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 10,
                            "cases": 3776
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 11,
                            "cases": 3781
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 12,
                            "cases": 3787
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 13,
                            "cases": 3790
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 14,
                            "cases": 3792
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 15,
                            "cases": 3798
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 16,
                            "cases": 3811
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 17,
                            "cases": 3817
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 18,
                            "cases": 3886
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 19,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 20,
                            "cases": 3896
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 21,
                            "cases": 3895
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 22,
                            "cases": 3914
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 23,
                            "cases": 3930
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 24,
                            "cases": 3947
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 25,
                            "cases": 3957
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 26,
                            "cases": 3978
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 27,
                            "cases": 3977
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 28,
                            "cases": 3985
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 29,
                            "cases": 3997
                        },
                        {
                            "year": 2020,
                            "month": 9,
                            "day": 30,
                            "cases": 4004
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 1,
                            "cases": 4017
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 2,
                            "cases": 4033
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 3,
                            "cases": 4048
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 4,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 5,
                            "cases": 4050
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 6,
                            "cases": 4068
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 7,
                            "cases": 4075
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 8,
                            "cases": 4079
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 9,
                            "cases": 4078
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 10,
                            "cases": 4090
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 11,
                            "cases": 4089
                        },
                        {
                            "year": 2020,
                            "month": 10,
                            "day": 12,
                            "cases": 4089
                        }
                    ],
                    "historicalweather": [
                        {
                            "month": "Sep",
                            "precipitation": 0.33,
                            "temperature": 87.2
                        },
                        {
                            "month": "Mar",
                            "precipitation": 0.39,
                            "temperature": 63.7
                        },
                        {
                            "month": "Nov",
                            "precipitation": 2.93,
                            "temperature": 63.5
                        },
                        {
                            "month": "Apr",
                            "precipitation": 0.49,
                            "temperature": 74.7
                        },
                        {
                            "month": "Dec",
                            "precipitation": 1.35,
                            "temperature": 52.8
                        },
                        {
                            "month": "Jan",
                            "precipitation": 1.67,
                            "temperature": 54.1
                        },
                        {
                            "month": "Jun",
                            "precipitation": 0.0,
                            "temperature": 89.6
                        },
                        {
                            "month": "Oct",
                            "precipitation": 0.0,
                            "temperature": 71.4
                        },
                        {
                            "month": "Jul",
                            "precipitation": 0.02,
                            "temperature": 96.1
                        },
                        {
                            "month": "May",
                            "precipitation": 0.13,
                            "temperature": 75.9
                        },
                        {
                            "month": "Feb",
                            "precipitation": 1.71,
                            "temperature": 51.5
                        },
                        {
                            "month": "Aug",
                            "precipitation": 0.13,
                            "temperature": 96.2
                        }
                    ]
                }
            }
        ]
    }
]
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
No Body Data

Status OK
```

</details>

</details>

<details>
<summary>GET http://localhost:2019/users/favs MUST BE SENT WITH A VALID OKTA TOKEN</summary>

```TEXT
[
    {
        "user": {
            "userid": 588032,
            "username": "llama005@maildrop.cc",
            "favcities": [
                {
                    "city": {
                        "cityid": 185362,
                        "citynamestate": "Bullhead City, Arizona",
                        "statecode": "AZ",
                        "timezone": "UTC-7 Mountain",
                        "latitude": 35.147777399999995,
                        "logitude": -114.5682983,
                        "fpis": "04-0822",
                        "gnis": null,
                        "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Bullhead_City_Arizona_4.jpg/500px-Bullhead_City_Arizona_4.jpg",
                        "website": "http://www.bullheadcity.com/",
                        "population": 40252.0,
                        "densitymisq": 688.6,
                        "densitykmsq": 265.87,
                        "averageage": 53.0,
                        "householdincome": 40566.0,
                        "individualincome": 24404.0,
                        "averagehouse": 135165.0,
                        "rent": 740.0,
                        "costoflivingindex": 87.6,
                        "acastatus": "Adopted",
                        "averagetemp": 73.05833333333334,
                        "averageperc": 0.7625000000000001,
                        "avgnewcovidcases": 1359.354716981132,
                        "zipcodes": [],
                        "counties": [
                            {
                                "name": "Mohave"
                            }
                        ],
                        "populationhist": [
                            {
                                "year": 2010,
                                "pop": 39540.0
                            },
                            {
                                "year": 2011,
                                "pop": 39710.0
                            },
                            {
                                "year": 2012,
                                "pop": 39645.0
                            },
                            {
                                "year": 2013,
                                "pop": 39568.0
                            },
                            {
                                "year": 2014,
                                "pop": 39580.0
                            },
                            {
                                "year": 2015,
                                "pop": 39796.0
                            },
                            {
                                "year": 2016,
                                "pop": 39970.0
                            },
                            {
                                "year": 2017,
                                "pop": 40233.0
                            },
                            {
                                "year": 2018,
                                "pop": 40369.0
                            },
                            {
                                "year": 2019,
                                "pop": 40884.0
                            }
                        ],
                        "historicalincome": [
                            {
                                "year": 2019,
                                "individualincome": 40198,
                                "householdincome": 62055
                            },
                            {
                                "year": 2018,
                                "individualincome": 38032,
                                "householdincome": 59246
                            },
                            {
                                "year": 2017,
                                "individualincome": 36607,
                                "householdincome": 56581
                            },
                            {
                                "year": 2016,
                                "individualincome": 34776,
                                "householdincome": 53558
                            },
                            {
                                "year": 2015,
                                "individualincome": 33452,
                                "householdincome": 51492
                            },
                            {
                                "year": 2014,
                                "individualincome": 31889,
                                "householdincome": 50068
                            },
                            {
                                "year": 2013,
                                "individualincome": 31504,
                                "householdincome": 48510
                            },
                            {
                                "year": 2012,
                                "individualincome": 31605,
                                "householdincome": 47826
                            },
                            {
                                "year": 2011,
                                "individualincome": 30542,
                                "householdincome": 46709
                            },
                            {
                                "year": 2010,
                                "individualincome": 31424,
                                "householdincome": 46789
                            }
                        ],
                        "historicalaveragehouse": [
                            {
                                "year": 2010,
                                "month": 1,
                                "housingcost": 140626
                            },
                            {
                                "year": 2010,
                                "month": 2,
                                "housingcost": 140158
                            },
                            {
                                "year": 2010,
                                "month": 3,
                                "housingcost": 139405
                            },
                            {
                                "year": 2010,
                                "month": 4,
                                "housingcost": 138878
                            },
                            {
                                "year": 2010,
                                "month": 5,
                                "housingcost": 136964
                            },
                            {
                                "year": 2010,
                                "month": 6,
                                "housingcost": 135833
                            },
                            {
                                "year": 2010,
                                "month": 7,
                                "housingcost": 134247
                            },
                            {
                                "year": 2010,
                                "month": 8,
                                "housingcost": 133325
                            },
                            {
                                "year": 2010,
                                "month": 9,
                                "housingcost": 132049
                            },
                            {
                                "year": 2010,
                                "month": 10,
                                "housingcost": 130368
                            },
                            {
                                "year": 2010,
                                "month": 11,
                                "housingcost": 128229
                            },
                            {
                                "year": 2010,
                                "month": 12,
                                "housingcost": 125843
                            },
                            {
                                "year": 2011,
                                "month": 1,
                                "housingcost": 123954
                            },
                            {
                                "year": 2011,
                                "month": 2,
                                "housingcost": 122199
                            },
                            {
                                "year": 2011,
                                "month": 3,
                                "housingcost": 121227
                            },
                            {
                                "year": 2011,
                                "month": 4,
                                "housingcost": 120669
                            },
                            {
                                "year": 2011,
                                "month": 5,
                                "housingcost": 120172
                            },
                            {
                                "year": 2011,
                                "month": 6,
                                "housingcost": 119112
                            },
                            {
                                "year": 2011,
                                "month": 7,
                                "housingcost": 117783
                            },
                            {
                                "year": 2011,
                                "month": 8,
                                "housingcost": 117409
                            },
                            {
                                "year": 2011,
                                "month": 9,
                                "housingcost": 117413
                            },
                            {
                                "year": 2011,
                                "month": 10,
                                "housingcost": 118091
                            },
                            {
                                "year": 2011,
                                "month": 11,
                                "housingcost": 118126
                            },
                            {
                                "year": 2011,
                                "month": 12,
                                "housingcost": 118282
                            },
                            {
                                "year": 2012,
                                "month": 1,
                                "housingcost": 118389
                            },
                            {
                                "year": 2012,
                                "month": 2,
                                "housingcost": 118297
                            },
                            {
                                "year": 2012,
                                "month": 3,
                                "housingcost": 117976
                            },
                            {
                                "year": 2012,
                                "month": 4,
                                "housingcost": 117160
                            },
                            {
                                "year": 2012,
                                "month": 5,
                                "housingcost": 117702
                            },
                            {
                                "year": 2012,
                                "month": 6,
                                "housingcost": 118313
                            },
                            {
                                "year": 2012,
                                "month": 7,
                                "housingcost": 120069
                            },
                            {
                                "year": 2012,
                                "month": 8,
                                "housingcost": 121119
                            },
                            {
                                "year": 2012,
                                "month": 9,
                                "housingcost": 122681
                            },
                            {
                                "year": 2012,
                                "month": 10,
                                "housingcost": 123372
                            },
                            {
                                "year": 2012,
                                "month": 11,
                                "housingcost": 124542
                            },
                            {
                                "year": 2012,
                                "month": 12,
                                "housingcost": 125474
                            },
                            {
                                "year": 2013,
                                "month": 1,
                                "housingcost": 126222
                            },
                            {
                                "year": 2013,
                                "month": 2,
                                "housingcost": 127283
                            },
                            {
                                "year": 2013,
                                "month": 3,
                                "housingcost": 128496
                            },
                            {
                                "year": 2013,
                                "month": 4,
                                "housingcost": 130639
                            },
                            {
                                "year": 2013,
                                "month": 5,
                                "housingcost": 131785
                            },
                            {
                                "year": 2013,
                                "month": 6,
                                "housingcost": 133271
                            },
                            {
                                "year": 2013,
                                "month": 7,
                                "housingcost": 134206
                            },
                            {
                                "year": 2013,
                                "month": 8,
                                "housingcost": 134590
                            },
                            {
                                "year": 2013,
                                "month": 9,
                                "housingcost": 133969
                            },
                            {
                                "year": 2013,
                                "month": 10,
                                "housingcost": 133546
                            },
                            {
                                "year": 2013,
                                "month": 11,
                                "housingcost": 134122
                            },
                            {
                                "year": 2013,
                                "month": 12,
                                "housingcost": 135605
                            },
                            {
                                "year": 2014,
                                "month": 1,
                                "housingcost": 137892
                            },
                            {
                                "year": 2014,
                                "month": 2,
                                "housingcost": 139939
                            },
                            {
                                "year": 2014,
                                "month": 3,
                                "housingcost": 141369
                            },
                            {
                                "year": 2014,
                                "month": 4,
                                "housingcost": 141303
                            },
                            {
                                "year": 2014,
                                "month": 5,
                                "housingcost": 141630
                            },
                            {
                                "year": 2014,
                                "month": 6,
                                "housingcost": 142196
                            },
                            {
                                "year": 2014,
                                "month": 7,
                                "housingcost": 142517
                            },
                            {
                                "year": 2014,
                                "month": 8,
                                "housingcost": 142946
                            },
                            {
                                "year": 2014,
                                "month": 9,
                                "housingcost": 144203
                            },
                            {
                                "year": 2014,
                                "month": 10,
                                "housingcost": 146107
                            },
                            {
                                "year": 2014,
                                "month": 11,
                                "housingcost": 147137
                            },
                            {
                                "year": 2014,
                                "month": 12,
                                "housingcost": 147198
                            },
                            {
                                "year": 2015,
                                "month": 1,
                                "housingcost": 146655
                            },
                            {
                                "year": 2015,
                                "month": 2,
                                "housingcost": 146683
                            },
                            {
                                "year": 2015,
                                "month": 3,
                                "housingcost": 147182
                            },
                            {
                                "year": 2015,
                                "month": 4,
                                "housingcost": 148727
                            },
                            {
                                "year": 2015,
                                "month": 5,
                                "housingcost": 149685
                            },
                            {
                                "year": 2015,
                                "month": 6,
                                "housingcost": 150184
                            },
                            {
                                "year": 2015,
                                "month": 7,
                                "housingcost": 150782
                            },
                            {
                                "year": 2015,
                                "month": 8,
                                "housingcost": 151912
                            },
                            {
                                "year": 2015,
                                "month": 9,
                                "housingcost": 152562
                            },
                            {
                                "year": 2015,
                                "month": 10,
                                "housingcost": 152454
                            },
                            {
                                "year": 2015,
                                "month": 11,
                                "housingcost": 152427
                            },
                            {
                                "year": 2015,
                                "month": 12,
                                "housingcost": 152947
                            },
                            {
                                "year": 2016,
                                "month": 1,
                                "housingcost": 153983
                            },
                            {
                                "year": 2016,
                                "month": 2,
                                "housingcost": 154162
                            },
                            {
                                "year": 2016,
                                "month": 3,
                                "housingcost": 154484
                            },
                            {
                                "year": 2016,
                                "month": 4,
                                "housingcost": 154380
                            },
                            {
                                "year": 2016,
                                "month": 5,
                                "housingcost": 154942
                            },
                            {
                                "year": 2016,
                                "month": 6,
                                "housingcost": 155487
                            },
                            {
                                "year": 2016,
                                "month": 7,
                                "housingcost": 156122
                            },
                            {
                                "year": 2016,
                                "month": 8,
                                "housingcost": 156625
                            },
                            {
                                "year": 2016,
                                "month": 9,
                                "housingcost": 157234
                            },
                            {
                                "year": 2016,
                                "month": 10,
                                "housingcost": 158285
                            },
                            {
                                "year": 2016,
                                "month": 11,
                                "housingcost": 159349
                            },
                            {
                                "year": 2016,
                                "month": 12,
                                "housingcost": 160094
                            },
                            {
                                "year": 2017,
                                "month": 1,
                                "housingcost": 160247
                            },
                            {
                                "year": 2017,
                                "month": 2,
                                "housingcost": 161000
                            },
                            {
                                "year": 2017,
                                "month": 3,
                                "housingcost": 161840
                            },
                            {
                                "year": 2017,
                                "month": 4,
                                "housingcost": 162787
                            },
                            {
                                "year": 2017,
                                "month": 5,
                                "housingcost": 163625
                            },
                            {
                                "year": 2017,
                                "month": 6,
                                "housingcost": 164341
                            },
                            {
                                "year": 2017,
                                "month": 7,
                                "housingcost": 165053
                            },
                            {
                                "year": 2017,
                                "month": 8,
                                "housingcost": 165487
                            },
                            {
                                "year": 2017,
                                "month": 9,
                                "housingcost": 166145
                            },
                            {
                                "year": 2017,
                                "month": 10,
                                "housingcost": 167144
                            },
                            {
                                "year": 2017,
                                "month": 11,
                                "housingcost": 168072
                            },
                            {
                                "year": 2017,
                                "month": 12,
                                "housingcost": 169024
                            },
                            {
                                "year": 2018,
                                "month": 1,
                                "housingcost": 169940
                            },
                            {
                                "year": 2018,
                                "month": 2,
                                "housingcost": 170684
                            },
                            {
                                "year": 2018,
                                "month": 3,
                                "housingcost": 171584
                            },
                            {
                                "year": 2018,
                                "month": 4,
                                "housingcost": 172821
                            },
                            {
                                "year": 2018,
                                "month": 5,
                                "housingcost": 173932
                            },
                            {
                                "year": 2018,
                                "month": 6,
                                "housingcost": 175171
                            },
                            {
                                "year": 2018,
                                "month": 7,
                                "housingcost": 176128
                            },
                            {
                                "year": 2018,
                                "month": 8,
                                "housingcost": 177578
                            },
                            {
                                "year": 2018,
                                "month": 9,
                                "housingcost": 178985
                            },
                            {
                                "year": 2018,
                                "month": 10,
                                "housingcost": 180209
                            },
                            {
                                "year": 2018,
                                "month": 11,
                                "housingcost": 181811
                            },
                            {
                                "year": 2018,
                                "month": 12,
                                "housingcost": 183392
                            },
                            {
                                "year": 2019,
                                "month": 1,
                                "housingcost": 184981
                            },
                            {
                                "year": 2019,
                                "month": 2,
                                "housingcost": 186258
                            },
                            {
                                "year": 2019,
                                "month": 3,
                                "housingcost": 187295
                            },
                            {
                                "year": 2019,
                                "month": 4,
                                "housingcost": 188188
                            },
                            {
                                "year": 2019,
                                "month": 5,
                                "housingcost": 189595
                            },
                            {
                                "year": 2019,
                                "month": 6,
                                "housingcost": 191294
                            },
                            {
                                "year": 2019,
                                "month": 7,
                                "housingcost": 193299
                            },
                            {
                                "year": 2019,
                                "month": 8,
                                "housingcost": 194519
                            },
                            {
                                "year": 2019,
                                "month": 9,
                                "housingcost": 195551
                            },
                            {
                                "year": 2019,
                                "month": 10,
                                "housingcost": 196653
                            },
                            {
                                "year": 2019,
                                "month": 11,
                                "housingcost": 197751
                            },
                            {
                                "year": 2019,
                                "month": 12,
                                "housingcost": 198974
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "housingcost": 200412
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "housingcost": 202187
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "housingcost": 204150
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "housingcost": 206140
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "housingcost": 207866
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "housingcost": 209411
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "housingcost": 210972
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "housingcost": 213111
                            }
                        ],
                        "covid": [
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 22,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 23,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 24,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 25,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 26,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 27,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 28,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 29,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 30,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 1,
                                "day": 31,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 1,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 2,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 3,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 4,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 5,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 6,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 7,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 8,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 9,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 10,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 11,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 12,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 13,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 14,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 15,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 16,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 17,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 18,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 19,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 20,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 21,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 22,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 23,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 24,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 25,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 26,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 27,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 28,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 2,
                                "day": 29,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 1,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 2,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 3,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 4,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 5,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 6,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 7,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 8,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 9,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 10,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 11,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 12,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 13,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 14,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 15,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 16,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 17,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 18,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 19,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 20,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 21,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 22,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 23,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 24,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 25,
                                "cases": 0
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 26,
                                "cases": 2
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 27,
                                "cases": 4
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 28,
                                "cases": 5
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 29,
                                "cases": 6
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 30,
                                "cases": 7
                            },
                            {
                                "year": 2020,
                                "month": 3,
                                "day": 31,
                                "cases": 7
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 1,
                                "cases": 7
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 2,
                                "cases": 8
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 3,
                                "cases": 9
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 4,
                                "cases": 12
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 5,
                                "cases": 16
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 6,
                                "cases": 20
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 7,
                                "cases": 23
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 8,
                                "cases": 23
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 9,
                                "cases": 27
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 10,
                                "cases": 28
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 11,
                                "cases": 30
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 12,
                                "cases": 30
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 13,
                                "cases": 40
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 14,
                                "cases": 45
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 15,
                                "cases": 45
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 16,
                                "cases": 51
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 17,
                                "cases": 51
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 18,
                                "cases": 52
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 19,
                                "cases": 54
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 20,
                                "cases": 56
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 21,
                                "cases": 59
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 22,
                                "cases": 62
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 23,
                                "cases": 69
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 24,
                                "cases": 73
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 25,
                                "cases": 81
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 26,
                                "cases": 88
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 27,
                                "cases": 96
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 28,
                                "cases": 99
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 29,
                                "cases": 105
                            },
                            {
                                "year": 2020,
                                "month": 4,
                                "day": 30,
                                "cases": 117
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 1,
                                "cases": 122
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 2,
                                "cases": 127
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 3,
                                "cases": 135
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 4,
                                "cases": 141
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 5,
                                "cases": 147
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 6,
                                "cases": 150
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 7,
                                "cases": 158
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 8,
                                "cases": 171
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 9,
                                "cases": 178
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 10,
                                "cases": 193
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 11,
                                "cases": 198
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 12,
                                "cases": 207
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 13,
                                "cases": 213
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 14,
                                "cases": 220
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 15,
                                "cases": 242
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 16,
                                "cases": 250
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 17,
                                "cases": 250
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 18,
                                "cases": 251
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 19,
                                "cases": 262
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 20,
                                "cases": 267
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 21,
                                "cases": 277
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 22,
                                "cases": 288
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 23,
                                "cases": 303
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 24,
                                "cases": 304
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 25,
                                "cases": 319
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 26,
                                "cases": 329
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 27,
                                "cases": 339
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 28,
                                "cases": 350
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 29,
                                "cases": 369
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 30,
                                "cases": 383
                            },
                            {
                                "year": 2020,
                                "month": 5,
                                "day": 31,
                                "cases": 396
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 1,
                                "cases": 403
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 2,
                                "cases": 409
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 3,
                                "cases": 422
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 4,
                                "cases": 428
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 5,
                                "cases": 447
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 6,
                                "cases": 485
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 7,
                                "cases": 500
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 8,
                                "cases": 512
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 9,
                                "cases": 513
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 10,
                                "cases": 552
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 11,
                                "cases": 563
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 12,
                                "cases": 584
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 13,
                                "cases": 586
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 14,
                                "cases": 589
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 15,
                                "cases": 618
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 16,
                                "cases": 624
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 17,
                                "cases": 636
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 18,
                                "cases": 676
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 19,
                                "cases": 686
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 20,
                                "cases": 717
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 21,
                                "cases": 721
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 22,
                                "cases": 723
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 23,
                                "cases": 813
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 24,
                                "cases": 841
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 25,
                                "cases": 881
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 26,
                                "cases": 927
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 27,
                                "cases": 962
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 28,
                                "cases": 1004
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 29,
                                "cases": 1028
                            },
                            {
                                "year": 2020,
                                "month": 6,
                                "day": 30,
                                "cases": 1071
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 1,
                                "cases": 1142
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 2,
                                "cases": 1248
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 3,
                                "cases": 1342
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 4,
                                "cases": 1358
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 5,
                                "cases": 1384
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 6,
                                "cases": 1413
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 7,
                                "cases": 1448
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 8,
                                "cases": 1509
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 9,
                                "cases": 1595
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 10,
                                "cases": 1696
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 11,
                                "cases": 1759
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 12,
                                "cases": 1825
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 13,
                                "cases": 1831
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 14,
                                "cases": 1937
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 15,
                                "cases": 2045
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 16,
                                "cases": 2108
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 17,
                                "cases": 2195
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 18,
                                "cases": 2229
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 19,
                                "cases": 2269
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 20,
                                "cases": 2281
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 21,
                                "cases": 2403
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 22,
                                "cases": 2464
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 23,
                                "cases": 2525
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 24,
                                "cases": 2602
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 25,
                                "cases": 2681
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 26,
                                "cases": 2698
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 27,
                                "cases": 2725
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 28,
                                "cases": 2791
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 29,
                                "cases": 2828
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 30,
                                "cases": 2865
                            },
                            {
                                "year": 2020,
                                "month": 7,
                                "day": 31,
                                "cases": 2918
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 1,
                                "cases": 2990
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 2,
                                "cases": 3027
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 3,
                                "cases": 3040
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 4,
                                "cases": 3048
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 5,
                                "cases": 3073
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 6,
                                "cases": 3078
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 7,
                                "cases": 3147
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 8,
                                "cases": 3150
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 9,
                                "cases": 3186
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 10,
                                "cases": 3202
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 11,
                                "cases": 3226
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 12,
                                "cases": 3250
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 13,
                                "cases": 3285
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 14,
                                "cases": 3294
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 15,
                                "cases": 3348
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 16,
                                "cases": 3363
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 17,
                                "cases": 3368
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 18,
                                "cases": 3383
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 19,
                                "cases": 3411
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 20,
                                "cases": 3454
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 21,
                                "cases": 3468
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 22,
                                "cases": 3484
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 23,
                                "cases": 3489
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 24,
                                "cases": 3500
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 25,
                                "cases": 3534
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 26,
                                "cases": 3541
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 27,
                                "cases": 3566
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 28,
                                "cases": 3585
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 29,
                                "cases": 3597
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 30,
                                "cases": 3606
                            },
                            {
                                "year": 2020,
                                "month": 8,
                                "day": 31,
                                "cases": 3615
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 1,
                                "cases": 3639
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 2,
                                "cases": 3651
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 3,
                                "cases": 3675
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 4,
                                "cases": 3700
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 5,
                                "cases": 3747
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 6,
                                "cases": 3761
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 7,
                                "cases": 3762
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 8,
                                "cases": 3757
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 9,
                                "cases": 3769
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 10,
                                "cases": 3776
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 11,
                                "cases": 3781
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 12,
                                "cases": 3787
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 13,
                                "cases": 3790
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 14,
                                "cases": 3792
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 15,
                                "cases": 3798
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 16,
                                "cases": 3811
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 17,
                                "cases": 3817
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 18,
                                "cases": 3886
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 19,
                                "cases": 3895
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 20,
                                "cases": 3896
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 21,
                                "cases": 3895
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 22,
                                "cases": 3914
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 23,
                                "cases": 3930
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 24,
                                "cases": 3947
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 25,
                                "cases": 3957
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 26,
                                "cases": 3978
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 27,
                                "cases": 3977
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 28,
                                "cases": 3985
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 29,
                                "cases": 3997
                            },
                            {
                                "year": 2020,
                                "month": 9,
                                "day": 30,
                                "cases": 4004
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 1,
                                "cases": 4017
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 2,
                                "cases": 4033
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 3,
                                "cases": 4048
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 4,
                                "cases": 4050
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 5,
                                "cases": 4050
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 6,
                                "cases": 4068
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 7,
                                "cases": 4075
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 8,
                                "cases": 4079
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 9,
                                "cases": 4078
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 10,
                                "cases": 4090
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 11,
                                "cases": 4089
                            },
                            {
                                "year": 2020,
                                "month": 10,
                                "day": 12,
                                "cases": 4089
                            }
                        ],
                        "historicalweather": [
                            {
                                "month": "Sep",
                                "precipitation": 0.33,
                                "temperature": 87.2
                            },
                            {
                                "month": "Mar",
                                "precipitation": 0.39,
                                "temperature": 63.7
                            },
                            {
                                "month": "Nov",
                                "precipitation": 2.93,
                                "temperature": 63.5
                            },
                            {
                                "month": "Apr",
                                "precipitation": 0.49,
                                "temperature": 74.7
                            },
                            {
                                "month": "Dec",
                                "precipitation": 1.35,
                                "temperature": 52.8
                            },
                            {
                                "month": "Jan",
                                "precipitation": 1.67,
                                "temperature": 54.1
                            },
                            {
                                "month": "Jun",
                                "precipitation": 0.0,
                                "temperature": 89.6
                            },
                            {
                                "month": "Oct",
                                "precipitation": 0.0,
                                "temperature": 71.4
                            },
                            {
                                "month": "Jul",
                                "precipitation": 0.02,
                                "temperature": 96.1
                            },
                            {
                                "month": "May",
                                "precipitation": 0.13,
                                "temperature": 75.9
                            },
                            {
                                "month": "Feb",
                                "precipitation": 1.71,
                                "temperature": 51.5
                            },
                            {
                                "month": "Aug",
                                "precipitation": 0.13,
                                "temperature": 96.2
                            }
                        ]
                    }
                }
            ]
        },
        "city": {
            "cityid": 185362,
            "citynamestate": "Bullhead City, Arizona",
            "statecode": "AZ",
            "timezone": "UTC-7 Mountain",
            "latitude": 35.147777399999995,
            "logitude": -114.5682983,
            "fpis": "04-0822",
            "gnis": null,
            "wikiimgurl": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Bullhead_City_Arizona_4.jpg/500px-Bullhead_City_Arizona_4.jpg",
            "website": "http://www.bullheadcity.com/",
            "population": 40252.0,
            "densitymisq": 688.6,
            "densitykmsq": 265.87,
            "averageage": 53.0,
            "householdincome": 40566.0,
            "individualincome": 24404.0,
            "averagehouse": 135165.0,
            "rent": 740.0,
            "costoflivingindex": 87.6,
            "acastatus": "Adopted",
            "averagetemp": 73.05833333333334,
            "averageperc": 0.7625000000000001,
            "avgnewcovidcases": 1359.354716981132,
            "zipcodes": [],
            "counties": [
                {
                    "name": "Mohave"
                }
            ],
            "populationhist": [
                {
                    "year": 2010,
                    "pop": 39540.0
                },
                {
                    "year": 2011,
                    "pop": 39710.0
                },
                {
                    "year": 2012,
                    "pop": 39645.0
                },
                {
                    "year": 2013,
                    "pop": 39568.0
                },
                {
                    "year": 2014,
                    "pop": 39580.0
                },
                {
                    "year": 2015,
                    "pop": 39796.0
                },
                {
                    "year": 2016,
                    "pop": 39970.0
                },
                {
                    "year": 2017,
                    "pop": 40233.0
                },
                {
                    "year": 2018,
                    "pop": 40369.0
                },
                {
                    "year": 2019,
                    "pop": 40884.0
                }
            ],
            "historicalincome": [
                {
                    "year": 2019,
                    "individualincome": 40198,
                    "householdincome": 62055
                },
                {
                    "year": 2018,
                    "individualincome": 38032,
                    "householdincome": 59246
                },
                {
                    "year": 2017,
                    "individualincome": 36607,
                    "householdincome": 56581
                },
                {
                    "year": 2016,
                    "individualincome": 34776,
                    "householdincome": 53558
                },
                {
                    "year": 2015,
                    "individualincome": 33452,
                    "householdincome": 51492
                },
                {
                    "year": 2014,
                    "individualincome": 31889,
                    "householdincome": 50068
                },
                {
                    "year": 2013,
                    "individualincome": 31504,
                    "householdincome": 48510
                },
                {
                    "year": 2012,
                    "individualincome": 31605,
                    "householdincome": 47826
                },
                {
                    "year": 2011,
                    "individualincome": 30542,
                    "householdincome": 46709
                },
                {
                    "year": 2010,
                    "individualincome": 31424,
                    "householdincome": 46789
                }
            ],
            "historicalaveragehouse": [
                {
                    "year": 2010,
                    "month": 1,
                    "housingcost": 140626
                },
                {
                    "year": 2010,
                    "month": 2,
                    "housingcost": 140158
                },
                {
                    "year": 2010,
                    "month": 3,
                    "housingcost": 139405
                },
                {
                    "year": 2010,
                    "month": 4,
                    "housingcost": 138878
                },
                {
                    "year": 2010,
                    "month": 5,
                    "housingcost": 136964
                },
                {
                    "year": 2010,
                    "month": 6,
                    "housingcost": 135833
                },
                {
                    "year": 2010,
                    "month": 7,
                    "housingcost": 134247
                },
                {
                    "year": 2010,
                    "month": 8,
                    "housingcost": 133325
                },
                {
                    "year": 2010,
                    "month": 9,
                    "housingcost": 132049
                },
                {
                    "year": 2010,
                    "month": 10,
                    "housingcost": 130368
                },
                {
                    "year": 2010,
                    "month": 11,
                    "housingcost": 128229
                },
                {
                    "year": 2010,
                    "month": 12,
                    "housingcost": 125843
                },
                {
                    "year": 2011,
                    "month": 1,
                    "housingcost": 123954
                },
                {
                    "year": 2011,
                    "month": 2,
                    "housingcost": 122199
                },
                {
                    "year": 2011,
                    "month": 3,
                    "housingcost": 121227
                },
                {
                    "year": 2011,
                    "month": 4,
                    "housingcost": 120669
                },
                {
                    "year": 2011,
                    "month": 5,
                    "housingcost": 120172
                },
                {
                    "year": 2011,
                    "month": 6,
                    "housingcost": 119112
                },
                {
                    "year": 2011,
                    "month": 7,
                    "housingcost": 117783
                },
                {
                    "year": 2011,
                    "month": 8,
                    "housingcost": 117409
                },
                {
                    "year": 2011,
                    "month": 9,
                    "housingcost": 117413
                },
                {
                    "year": 2011,
                    "month": 10,
                    "housingcost": 118091
                },
                {
                    "year": 2011,
                    "month": 11,
                    "housingcost": 118126
                },
                {
                    "year": 2011,
                    "month": 12,
                    "housingcost": 118282
                },
                {
                    "year": 2012,
                    "month": 1,
                    "housingcost": 118389
                },
                {
                    "year": 2012,
                    "month": 2,
                    "housingcost": 118297
                },
                {
                    "year": 2012,
                    "month": 3,
                    "housingcost": 117976
                },
                {
                    "year": 2012,
                    "month": 4,
                    "housingcost": 117160
                },
                {
                    "year": 2012,
                    "month": 5,
                    "housingcost": 117702
                },
                {
                    "year": 2012,
                    "month": 6,
                    "housingcost": 118313
                },
                {
                    "year": 2012,
                    "month": 7,
                    "housingcost": 120069
                },
                {
                    "year": 2012,
                    "month": 8,
                    "housingcost": 121119
                },
                {
                    "year": 2012,
                    "month": 9,
                    "housingcost": 122681
                },
                {
                    "year": 2012,
                    "month": 10,
                    "housingcost": 123372
                },
                {
                    "year": 2012,
                    "month": 11,
                    "housingcost": 124542
                },
                {
                    "year": 2012,
                    "month": 12,
                    "housingcost": 125474
                },
                {
                    "year": 2013,
                    "month": 1,
                    "housingcost": 126222
                },
                {
                    "year": 2013,
                    "month": 2,
                    "housingcost": 127283
                },
                {
                    "year": 2013,
                    "month": 3,
                    "housingcost": 128496
                },
                {
                    "year": 2013,
                    "month": 4,
                    "housingcost": 130639
                },
                {
                    "year": 2013,
                    "month": 5,
                    "housingcost": 131785
                },
                {
                    "year": 2013,
                    "month": 6,
                    "housingcost": 133271
                },
                {
                    "year": 2013,
                    "month": 7,
                    "housingcost": 134206
                },
                {
                    "year": 2013,
                    "month": 8,
                    "housingcost": 134590
                },
                {
                    "year": 2013,
                    "month": 9,
                    "housingcost": 133969
                },
                {
                    "year": 2013,
                    "month": 10,
                    "housingcost": 133546
                },
                {
                    "year": 2013,
                    "month": 11,
                    "housingcost": 134122
                },
                {
                    "year": 2013,
                    "month": 12,
                    "housingcost": 135605
                },
                {
                    "year": 2014,
                    "month": 1,
                    "housingcost": 137892
                },
                {
                    "year": 2014,
                    "month": 2,
                    "housingcost": 139939
                },
                {
                    "year": 2014,
                    "month": 3,
                    "housingcost": 141369
                },
                {
                    "year": 2014,
                    "month": 4,
                    "housingcost": 141303
                },
                {
                    "year": 2014,
                    "month": 5,
                    "housingcost": 141630
                },
                {
                    "year": 2014,
                    "month": 6,
                    "housingcost": 142196
                },
                {
                    "year": 2014,
                    "month": 7,
                    "housingcost": 142517
                },
                {
                    "year": 2014,
                    "month": 8,
                    "housingcost": 142946
                },
                {
                    "year": 2014,
                    "month": 9,
                    "housingcost": 144203
                },
                {
                    "year": 2014,
                    "month": 10,
                    "housingcost": 146107
                },
                {
                    "year": 2014,
                    "month": 11,
                    "housingcost": 147137
                },
                {
                    "year": 2014,
                    "month": 12,
                    "housingcost": 147198
                },
                {
                    "year": 2015,
                    "month": 1,
                    "housingcost": 146655
                },
                {
                    "year": 2015,
                    "month": 2,
                    "housingcost": 146683
                },
                {
                    "year": 2015,
                    "month": 3,
                    "housingcost": 147182
                },
                {
                    "year": 2015,
                    "month": 4,
                    "housingcost": 148727
                },
                {
                    "year": 2015,
                    "month": 5,
                    "housingcost": 149685
                },
                {
                    "year": 2015,
                    "month": 6,
                    "housingcost": 150184
                },
                {
                    "year": 2015,
                    "month": 7,
                    "housingcost": 150782
                },
                {
                    "year": 2015,
                    "month": 8,
                    "housingcost": 151912
                },
                {
                    "year": 2015,
                    "month": 9,
                    "housingcost": 152562
                },
                {
                    "year": 2015,
                    "month": 10,
                    "housingcost": 152454
                },
                {
                    "year": 2015,
                    "month": 11,
                    "housingcost": 152427
                },
                {
                    "year": 2015,
                    "month": 12,
                    "housingcost": 152947
                },
                {
                    "year": 2016,
                    "month": 1,
                    "housingcost": 153983
                },
                {
                    "year": 2016,
                    "month": 2,
                    "housingcost": 154162
                },
                {
                    "year": 2016,
                    "month": 3,
                    "housingcost": 154484
                },
                {
                    "year": 2016,
                    "month": 4,
                    "housingcost": 154380
                },
                {
                    "year": 2016,
                    "month": 5,
                    "housingcost": 154942
                },
                {
                    "year": 2016,
                    "month": 6,
                    "housingcost": 155487
                },
                {
                    "year": 2016,
                    "month": 7,
                    "housingcost": 156122
                },
                {
                    "year": 2016,
                    "month": 8,
                    "housingcost": 156625
                },
                {
                    "year": 2016,
                    "month": 9,
                    "housingcost": 157234
                },
                {
                    "year": 2016,
                    "month": 10,
                    "housingcost": 158285
                },
                {
                    "year": 2016,
                    "month": 11,
                    "housingcost": 159349
                },
                {
                    "year": 2016,
                    "month": 12,
                    "housingcost": 160094
                },
                {
                    "year": 2017,
                    "month": 1,
                    "housingcost": 160247
                },
                {
                    "year": 2017,
                    "month": 2,
                    "housingcost": 161000
                },
                {
                    "year": 2017,
                    "month": 3,
                    "housingcost": 161840
                },
                {
                    "year": 2017,
                    "month": 4,
                    "housingcost": 162787
                },
                {
                    "year": 2017,
                    "month": 5,
                    "housingcost": 163625
                },
                {
                    "year": 2017,
                    "month": 6,
                    "housingcost": 164341
                },
                {
                    "year": 2017,
                    "month": 7,
                    "housingcost": 165053
                },
                {
                    "year": 2017,
                    "month": 8,
                    "housingcost": 165487
                },
                {
                    "year": 2017,
                    "month": 9,
                    "housingcost": 166145
                },
                {
                    "year": 2017,
                    "month": 10,
                    "housingcost": 167144
                },
                {
                    "year": 2017,
                    "month": 11,
                    "housingcost": 168072
                },
                {
                    "year": 2017,
                    "month": 12,
                    "housingcost": 169024
                },
                {
                    "year": 2018,
                    "month": 1,
                    "housingcost": 169940
                },
                {
                    "year": 2018,
                    "month": 2,
                    "housingcost": 170684
                },
                {
                    "year": 2018,
                    "month": 3,
                    "housingcost": 171584
                },
                {
                    "year": 2018,
                    "month": 4,
                    "housingcost": 172821
                },
                {
                    "year": 2018,
                    "month": 5,
                    "housingcost": 173932
                },
                {
                    "year": 2018,
                    "month": 6,
                    "housingcost": 175171
                },
                {
                    "year": 2018,
                    "month": 7,
                    "housingcost": 176128
                },
                {
                    "year": 2018,
                    "month": 8,
                    "housingcost": 177578
                },
                {
                    "year": 2018,
                    "month": 9,
                    "housingcost": 178985
                },
                {
                    "year": 2018,
                    "month": 10,
                    "housingcost": 180209
                },
                {
                    "year": 2018,
                    "month": 11,
                    "housingcost": 181811
                },
                {
                    "year": 2018,
                    "month": 12,
                    "housingcost": 183392
                },
                {
                    "year": 2019,
                    "month": 1,
                    "housingcost": 184981
                },
                {
                    "year": 2019,
                    "month": 2,
                    "housingcost": 186258
                },
                {
                    "year": 2019,
                    "month": 3,
                    "housingcost": 187295
                },
                {
                    "year": 2019,
                    "month": 4,
                    "housingcost": 188188
                },
                {
                    "year": 2019,
                    "month": 5,
                    "housingcost": 189595
                },
                {
                    "year": 2019,
                    "month": 6,
                    "housingcost": 191294
                },
                {
                    "year": 2019,
                    "month": 7,
                    "housingcost": 193299
                },
                {
                    "year": 2019,
                    "month": 8,
                    "housingcost": 194519
                },
                {
                    "year": 2019,
                    "month": 9,
                    "housingcost": 195551
                },
                {
                    "year": 2019,
                    "month": 10,
                    "housingcost": 196653
                },
                {
                    "year": 2019,
                    "month": 11,
                    "housingcost": 197751
                },
                {
                    "year": 2019,
                    "month": 12,
                    "housingcost": 198974
                },
                {
                    "year": 2020,
                    "month": 1,
                    "housingcost": 200412
                },
                {
                    "year": 2020,
                    "month": 2,
                    "housingcost": 202187
                },
                {
                    "year": 2020,
                    "month": 3,
                    "housingcost": 204150
                },
                {
                    "year": 2020,
                    "month": 4,
                    "housingcost": 206140
                },
                {
                    "year": 2020,
                    "month": 5,
                    "housingcost": 207866
                },
                {
                    "year": 2020,
                    "month": 6,
                    "housingcost": 209411
                },
                {
                    "year": 2020,
                    "month": 7,
                    "housingcost": 210972
                },
                {
                    "year": 2020,
                    "month": 8,
                    "housingcost": 213111
                }
            ],
            "covid": [
                {
                    "year": 2020,
                    "month": 1,
                    "day": 22,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 23,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 24,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 25,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 26,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 27,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 28,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 29,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 30,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 1,
                    "day": 31,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 1,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 2,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 3,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 4,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 5,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 6,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 7,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 8,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 9,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 10,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 11,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 12,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 13,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 14,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 15,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 16,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 17,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 18,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 19,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 20,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 21,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 22,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 23,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 24,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 25,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 26,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 27,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 28,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 2,
                    "day": 29,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 1,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 2,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 3,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 4,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 5,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 6,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 7,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 8,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 9,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 10,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 11,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 12,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 13,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 14,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 15,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 16,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 17,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 18,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 19,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 20,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 21,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 22,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 23,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 24,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 25,
                    "cases": 0
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 26,
                    "cases": 2
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 27,
                    "cases": 4
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 28,
                    "cases": 5
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 29,
                    "cases": 6
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 30,
                    "cases": 7
                },
                {
                    "year": 2020,
                    "month": 3,
                    "day": 31,
                    "cases": 7
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 1,
                    "cases": 7
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 2,
                    "cases": 8
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 3,
                    "cases": 9
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 4,
                    "cases": 12
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 5,
                    "cases": 16
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 6,
                    "cases": 20
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 7,
                    "cases": 23
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 8,
                    "cases": 23
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 9,
                    "cases": 27
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 10,
                    "cases": 28
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 11,
                    "cases": 30
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 12,
                    "cases": 30
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 13,
                    "cases": 40
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 14,
                    "cases": 45
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 15,
                    "cases": 45
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 16,
                    "cases": 51
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 17,
                    "cases": 51
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 18,
                    "cases": 52
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 19,
                    "cases": 54
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 20,
                    "cases": 56
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 21,
                    "cases": 59
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 22,
                    "cases": 62
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 23,
                    "cases": 69
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 24,
                    "cases": 73
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 25,
                    "cases": 81
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 26,
                    "cases": 88
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 27,
                    "cases": 96
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 28,
                    "cases": 99
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 29,
                    "cases": 105
                },
                {
                    "year": 2020,
                    "month": 4,
                    "day": 30,
                    "cases": 117
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 1,
                    "cases": 122
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 2,
                    "cases": 127
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 3,
                    "cases": 135
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 4,
                    "cases": 141
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 5,
                    "cases": 147
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 6,
                    "cases": 150
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 7,
                    "cases": 158
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 8,
                    "cases": 171
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 9,
                    "cases": 178
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 10,
                    "cases": 193
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 11,
                    "cases": 198
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 12,
                    "cases": 207
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 13,
                    "cases": 213
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 14,
                    "cases": 220
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 15,
                    "cases": 242
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 16,
                    "cases": 250
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 17,
                    "cases": 250
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 18,
                    "cases": 251
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 19,
                    "cases": 262
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 20,
                    "cases": 267
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 21,
                    "cases": 277
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 22,
                    "cases": 288
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 23,
                    "cases": 303
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 24,
                    "cases": 304
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 25,
                    "cases": 319
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 26,
                    "cases": 329
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 27,
                    "cases": 339
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 28,
                    "cases": 350
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 29,
                    "cases": 369
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 30,
                    "cases": 383
                },
                {
                    "year": 2020,
                    "month": 5,
                    "day": 31,
                    "cases": 396
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 1,
                    "cases": 403
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 2,
                    "cases": 409
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 3,
                    "cases": 422
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 4,
                    "cases": 428
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 5,
                    "cases": 447
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 6,
                    "cases": 485
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 7,
                    "cases": 500
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 8,
                    "cases": 512
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 9,
                    "cases": 513
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 10,
                    "cases": 552
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 11,
                    "cases": 563
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 12,
                    "cases": 584
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 13,
                    "cases": 586
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 14,
                    "cases": 589
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 15,
                    "cases": 618
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 16,
                    "cases": 624
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 17,
                    "cases": 636
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 18,
                    "cases": 676
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 19,
                    "cases": 686
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 20,
                    "cases": 717
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 21,
                    "cases": 721
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 22,
                    "cases": 723
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 23,
                    "cases": 813
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 24,
                    "cases": 841
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 25,
                    "cases": 881
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 26,
                    "cases": 927
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 27,
                    "cases": 962
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 28,
                    "cases": 1004
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 29,
                    "cases": 1028
                },
                {
                    "year": 2020,
                    "month": 6,
                    "day": 30,
                    "cases": 1071
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 1,
                    "cases": 1142
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 2,
                    "cases": 1248
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 3,
                    "cases": 1342
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 4,
                    "cases": 1358
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 5,
                    "cases": 1384
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 6,
                    "cases": 1413
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 7,
                    "cases": 1448
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 8,
                    "cases": 1509
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 9,
                    "cases": 1595
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 10,
                    "cases": 1696
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 11,
                    "cases": 1759
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 12,
                    "cases": 1825
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 13,
                    "cases": 1831
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 14,
                    "cases": 1937
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 15,
                    "cases": 2045
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 16,
                    "cases": 2108
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 17,
                    "cases": 2195
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 18,
                    "cases": 2229
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 19,
                    "cases": 2269
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 20,
                    "cases": 2281
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 21,
                    "cases": 2403
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 22,
                    "cases": 2464
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 23,
                    "cases": 2525
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 24,
                    "cases": 2602
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 25,
                    "cases": 2681
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 26,
                    "cases": 2698
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 27,
                    "cases": 2725
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 28,
                    "cases": 2791
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 29,
                    "cases": 2828
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 30,
                    "cases": 2865
                },
                {
                    "year": 2020,
                    "month": 7,
                    "day": 31,
                    "cases": 2918
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 1,
                    "cases": 2990
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 2,
                    "cases": 3027
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 3,
                    "cases": 3040
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 4,
                    "cases": 3048
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 5,
                    "cases": 3073
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 6,
                    "cases": 3078
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 7,
                    "cases": 3147
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 8,
                    "cases": 3150
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 9,
                    "cases": 3186
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 10,
                    "cases": 3202
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 11,
                    "cases": 3226
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 12,
                    "cases": 3250
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 13,
                    "cases": 3285
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 14,
                    "cases": 3294
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 15,
                    "cases": 3348
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 16,
                    "cases": 3363
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 17,
                    "cases": 3368
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 18,
                    "cases": 3383
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 19,
                    "cases": 3411
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 20,
                    "cases": 3454
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 21,
                    "cases": 3468
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 22,
                    "cases": 3484
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 23,
                    "cases": 3489
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 24,
                    "cases": 3500
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 25,
                    "cases": 3534
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 26,
                    "cases": 3541
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 27,
                    "cases": 3566
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 28,
                    "cases": 3585
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 29,
                    "cases": 3597
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 30,
                    "cases": 3606
                },
                {
                    "year": 2020,
                    "month": 8,
                    "day": 31,
                    "cases": 3615
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 1,
                    "cases": 3639
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 2,
                    "cases": 3651
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 3,
                    "cases": 3675
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 4,
                    "cases": 3700
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 5,
                    "cases": 3747
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 6,
                    "cases": 3761
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 7,
                    "cases": 3762
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 8,
                    "cases": 3757
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 9,
                    "cases": 3769
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 10,
                    "cases": 3776
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 11,
                    "cases": 3781
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 12,
                    "cases": 3787
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 13,
                    "cases": 3790
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 14,
                    "cases": 3792
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 15,
                    "cases": 3798
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 16,
                    "cases": 3811
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 17,
                    "cases": 3817
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 18,
                    "cases": 3886
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 19,
                    "cases": 3895
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 20,
                    "cases": 3896
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 21,
                    "cases": 3895
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 22,
                    "cases": 3914
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 23,
                    "cases": 3930
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 24,
                    "cases": 3947
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 25,
                    "cases": 3957
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 26,
                    "cases": 3978
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 27,
                    "cases": 3977
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 28,
                    "cases": 3985
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 29,
                    "cases": 3997
                },
                {
                    "year": 2020,
                    "month": 9,
                    "day": 30,
                    "cases": 4004
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 1,
                    "cases": 4017
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 2,
                    "cases": 4033
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 3,
                    "cases": 4048
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 4,
                    "cases": 4050
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 5,
                    "cases": 4050
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 6,
                    "cases": 4068
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 7,
                    "cases": 4075
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 8,
                    "cases": 4079
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 9,
                    "cases": 4078
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 10,
                    "cases": 4090
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 11,
                    "cases": 4089
                },
                {
                    "year": 2020,
                    "month": 10,
                    "day": 12,
                    "cases": 4089
                }
            ],
            "historicalweather": [
                {
                    "month": "Sep",
                    "precipitation": 0.33,
                    "temperature": 87.2
                },
                {
                    "month": "Mar",
                    "precipitation": 0.39,
                    "temperature": 63.7
                },
                {
                    "month": "Nov",
                    "precipitation": 2.93,
                    "temperature": 63.5
                },
                {
                    "month": "Apr",
                    "precipitation": 0.49,
                    "temperature": 74.7
                },
                {
                    "month": "Dec",
                    "precipitation": 1.35,
                    "temperature": 52.8
                },
                {
                    "month": "Jan",
                    "precipitation": 1.67,
                    "temperature": 54.1
                },
                {
                    "month": "Jun",
                    "precipitation": 0.0,
                    "temperature": 89.6
                },
                {
                    "month": "Oct",
                    "precipitation": 0.0,
                    "temperature": 71.4
                },
                {
                    "month": "Jul",
                    "precipitation": 0.02,
                    "temperature": 96.1
                },
                {
                    "month": "May",
                    "precipitation": 0.13,
                    "temperature": 75.9
                },
                {
                    "month": "Feb",
                    "precipitation": 1.71,
                    "temperature": 51.5
                },
                {
                    "month": "Aug",
                    "precipitation": 0.13,
                    "temperature": 96.2
                }
            ]
        }
    }
]
```

</details>
