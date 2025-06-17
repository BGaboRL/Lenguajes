from fastapi import APIRouter, HTTPException
from pydantic import BaseModel

router = APIRouter(prefix="/users", tags= ["users"])

#Forma manual
@router.get("/usersjson")
async def usersjson():
    return [{"name" : "Brayan", "lastname" : "Lopez", "url" : "https://www.google.com", "age" : 23},
            {"name" : "Gabriel", "lastname" : "Rodriguez", "url" : "https://www.google.com", "age" : 24},
            {"name" : "BraGa", "lastname" : "RoLo", "url" : "https://www.google.com", "age" : 25}]

#Con una clase (Mas recomendable)
class User(BaseModel):
    id: int
    name: str
    lastname: str
    url: str
    age: int

users_list = [User(id= 1, name= "Brayan", lastname= "Lopez", url= "https://www.google.com", age= 23),
              User(id= 2, name= "Gabriel", lastname= "Rodriguez", url= "https://www.google.com", age= 24),
              User(id= 3, name= "BraGa", lastname= "RoLo", url= "https://www.google.com", age= 25)]

@router.get("/")
async def users():
    return users_list


#Buscar un usuario usando un path //Cuando se busca algo fijo, parametros obligatorios
@router.get("/user/{id}")
async def users(id: int):
    return search_user(id)


#Usando query   //Para parametros que pueden no ser necesarios para hacer la peticion, es algo que puede ir o no ir, es variable
@router.get("/user")
async def users(id: int):
    return search_user(id)


#POST para colocar una usuario si no existe
@router.post("/user", response_model= User, status_code= 202)
async def user(user: User):
    if type(search_user(user.id)) == User:
        raise HTTPException(status_code= 404, detail= "El usuario ya existe")
    else:
        users_list.append(user)
        return user


@router.put("/user", response_model= User, status_code= 201)
async def user(user: User):
    found = False
    for index, saved_users in enumerate(users_list):
        if saved_users.id == user.id:
            users_list[index] = user
            found = True
            return user

    if not found:
        raise HTTPException(status_code= 404, detail= "No se ha encontrado el usuario")


@router.delete("/user/{id}")
async def user(id: int):
    found = False
    for index, saved_users in enumerate(users_list):
        if saved_users.id == id:
            del users_list[index]
            found = True
        return users_list

    if not found:
        raise HTTPException(status_code= 404, detail= "No se ha eliminado el usuario")


#Funcin que busca al usuario por su id
def search_user(id: int):
    users = filter(lambda x: x.id == id, users_list)
    try:
        return list(users)[0]
    except:
        raise HTTPException(status_code= 404, detail= "No se ha encontrado el usuario")