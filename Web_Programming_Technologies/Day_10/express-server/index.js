/*

to handdle the routs we need the object of express app
const app = express();

127.0.0.1:3500 GET -----------> Welcome
127.0.0.1:3500/login GET -----> Welcome to login
127.0.0.1:3500/sum GET -------> performing addition

GET, POST, PUT, DELETE

GET -----> get()
POST ----> post()
PUT -----> put()
DELETE --> delete()


app.get(url1, (request, response) => {
    
    });

app.get(url2, (request, response) => {
    
    });

*/

// Age eligibility
// factorial



import express, { response } from "express";
import { request } from "http";

//  create an express application

const app = express();  // it will return object of newly created express app

app.get("/", (request, response) => {
    response.status(200).send("Welcome to home");
});

app.get("/login", (request, response) => {
    response.send("Welcome to login");
});

app.get("/sum", (request, response) => {
    var x = 3;                  // HardCoded Values
    var y = 10;
    var z = x + y;
    response.send(`Sum is ${z}`);
});



// we can pass data on url in this way
// http://127.0.0.1:3500/product/3/10
app.get("/product/:x/:y", (request, response) => {
    console.log(request.params.x);        //{x:3,y:10}
    var x = parseInt(request.params.x);
    var y = parseInt(request.params.y);
    var z = x * y;

    response.send(`Sum is ${z}`);
});






app.listen(3500, () => {
    console.log("Server is running.....");
});



