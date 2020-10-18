# Citrics - C Java Spring Boot BE

## Introduction

This is a basic database scheme with users, user cities, cities. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the application's data. User authentication is provided third party by Okta.

## Base URL
- https://labs27-c-citrics-api.herokuapp.com/

## Swagger Documentation
- https://labs27-c-citrics-api.herokuapp.com/swagger-ui.html#/

<details>
<summary>http://localhost:2019/cities/city/4</summary>

```JSON
{
    "cityid": 4,
    "cityname": "Chattonooga",
    "citystate": "Tennessee",
    "populationdensityrating": 6,
    "safteyratingscore": 2,
    "costoflivingscore": 77,
    "averageincome": 100245.0,
    "averagetemperature": 68,
    "lat": 35.0768,
    "lon": -85.3082,
    "averageage": 0.0,
    "averagehouseholdincome": 0.0,
    "averageindividualincome": 0.0,
    "averagehouseingcost": 0.0,
    "averagerentcost": 0.0,
    "costoflivingindex": 0.0,
    "users": []
}
```

</details>

<details>
<summary>http://localhost:2019/cities/avg</summary>

```JSON
{
    "cityid": 0,
    "citynamestate": "National Average, USA",
    "population": 147764.216,
    "populationdensityrating": 1,
    "safteyratingscore": 2,
    "costoflivingscore": 1,
    "averageincome": 3022.216,
    "averagetemperature": 2,
    "lat": 1.4499112,
    "lon": -3.5092895,
    "averageage": 38.95039999999999,
    "averagehouseholdincome": 77554.112,
    "averageindividualincome": 38764.272,
    "averagehouseingcost": 0.0,
    "averagerentcost": 1557.232,
    "costoflivingindex": 55.5,
    "users": []
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
<summary>http://localhost:2019/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 5,
                "useremail": "admin@email.local"
            },
            {
                "useremailid": 6,
                "useremail": "admin@mymail.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "DATA"
                }
            },
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
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
    },
    {
        "userid": 11,
        "username": "barnbarn",
        "primaryemail": "barnbarn@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 12,
                "useremail": "barnbarn@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 13,
        "username": "puttat",
        "primaryemail": "puttat@school.lambda",
        "useremails": [],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 14,
        "username": "misskitty",
        "primaryemail": "misskitty@school.lambda",
        "useremails": [
            {
                "useremailid": 15,
                "useremail": "favbun@hops.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
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
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "password" : "Coffee123",
    "useremails": [
        {
            "useremail": "mojo@mymail.local"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "roleid": 2
            }
        }
    ]
}
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
{
    "username": "cinabun",
    "primaryemail": "cinabun@lambdaschool.home",
    "useremails": [
    {
            "useremail": "cinnamon@mymail.home"
    },
    {
            "useremail": "hops@mymail.home"
    },
    {
            "useremail": "bunny@email.home"
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
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
No Body Data

Status OK
```

</details>
