# About the project

This is a simulation of an enterprise project, I'm trying to get used to the following technologies in this project:
* Sprints
* Kanban

## Sprint 1
### Create a feature to manage recipes:
#### * Endpoint to register one recipe (POST "/recipes")

##### Request body:

{
"name": "Strawberry shake",
"duration": "15",
"category": "DRINKS",
"ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
"instructions": "Mix everything on the mixer, add ice and enjoy !."
}

##### Response body:

{
    "id": 1,
    "name": "Strawberry shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
}

#### * Endpoint to update a recipe (PUT "/recipes") 

##### Request body:

{
    "id": 1,
    "name": "Strawberry shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
}

##### Response body:

{
    "id": 1,
    "name": "Strawberry shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
}

#### * Endpoint to delete a recipe (DELETE "/recipes/{id}")
Response: 200 ok

#### * Endpoint to list all recipes, also filter by recipe category (GET "/recipes" or "/recipes?category=drinks")

##### Response body:

[

{
    "id": 1,
    "name": "Strawberry shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
},

{
    "id": 2,
    "name": "Avocado shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["1 small avocado", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
}

]

#### * Endpoint to find one or more recipes by name or part of a name (GET "/recipes/{name}")

##### Response body: 

[
{
    "id": 1,
    "name": "Strawberry shake",
    "duration": 15,
    "category": "DRINKS",
    "ingredients": ["5 Strawberries", "1 cup of milk", "1 tablespoon of sugar"],
    "instructions": "Mix everything on the mixer, add ice and enjoy !."
}
]

## Sprint 2
### 
#### * To be defined