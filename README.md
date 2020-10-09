# Citrics - C Java Spring Boot BE

## Introduction

This is a basic database scheme with users, user cities, cities. This Java Spring REST API application will provide endpoints for clients to read various data sets contained in the application's data. User authentication is provided third party by Okta.

## Base URL
- https://labs27-c-citrics-api.herokuapp.com/
<details>
<summary>http://localhost:2019/cities/all</summary>

```JSON
[
    {
        "cityid": 2,
        "cityname": "Tucson",
        "citystate": "Arizona",
        "populationdensityrating": 20,
        "safteyratingscore": 0,
        "costoflivingscore": 0,
        "averageincome": 0.0,
        "averagetemperature": 0,
        "lat": 0.0,
        "lon": 0.0,
        "averageage": 0.0,
        "averagehouseholdincome": 0.0,
        "averageindividualincome": 0.0,
        "averagehouseingcost": 0.0,
        "averagerentcost": 0.0,
        "costoflivingindex": 0.0,
        "users": []
    },
    {
        "cityid": 3,
        "cityname": "Dallas",
        "citystate": "Texas",
        "populationdensityrating": 43,
        "safteyratingscore": 86,
        "costoflivingscore": 12,
        "averageincome": 39477.0,
        "averagetemperature": 70,
        "lat": 32.7673,
        "lon": -96.7776,
        "averageage": 0.0,
        "averagehouseholdincome": 0.0,
        "averageindividualincome": 0.0,
        "averagehouseingcost": 0.0,
        "averagerentcost": 0.0,
        "costoflivingindex": 0.0,
        "users": []
    },
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
    },
    {
        "cityid": 5,
        "cityname": "Harrisburg",
        "citystate": "Pennsylvania",
        "populationdensityrating": 42,
        "safteyratingscore": 6,
        "costoflivingscore": 45,
        "averageincome": 40677.0,
        "averagetemperature": 65,
        "lat": 40.3086,
        "lon": -76.846,
        "averageage": 0.0,
        "averagehouseholdincome": 0.0,
        "averageindividualincome": 0.0,
        "averagehouseingcost": 0.0,
        "averagerentcost": 0.0,
        "costoflivingindex": 0.0,
        "users": []
    },
    {
        "cityid": 6,
        "cityname": "Springfield",
        "citystate": "Illinois",
        "populationdensityrating": 51,
        "safteyratingscore": 78,
        "costoflivingscore": 51,
        "averageincome": 87091.0,
        "averagetemperature": 57,
        "lat": 39.7495,
        "lon": -89.606,
        "averageage": 0.0,
        "averagehouseholdincome": 0.0,
        "averageindividualincome": 0.0,
        "averagehouseingcost": 0.0,
        "averagerentcost": 0.0,
        "costoflivingindex": 0.0,
        "users": []
    }
]    
```

</details>

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
