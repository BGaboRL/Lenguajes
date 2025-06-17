from fastapi import FastAPI
from routers import products, users
from fastapi.staticfiles import StaticFiles

app = FastAPI()
app.include_router(products.router)
app.include_router(users.router)
app.mount("/static", StaticFiles(directory= "static"), name= "static")  #url local/static/images/yoda.jpg

#url local: http://127.0.0.1:8000

@app.get("/")
async def root():
    return "Hola FastAPI!"

@app.get("/url")
async def url():
    return {"url_google" : "https://www.google.com"}