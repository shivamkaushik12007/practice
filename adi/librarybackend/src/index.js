const express = require('express');
const bodyParser=require("body-parser");
require('./dbConnection')
var app = express();
var users=require('./routes/users')
// app.<METHODNAME>('path',handler()=>{})
var books=[
    {
        "id":1,
        "name":"r1"
    }
];

app.use(bodyParser.json());

app.use("*",(req,res,next)=>{
    console.log("middleware is called");
    res.setHeader('Access-Control-Allow-Origin',"*");
    next();
})

app.use('/users',users);

app.get("/",function(req,res){
    console.log(req);
    res.send("library portal");
})

app.get("/bookList",(req,res)=>{
    res.setHeader('Access-Control-Allow-Origin',"*");
    res.send(books);
})

app.post("/addBook",(req,res)=>{
    let book=req.body;
    books.push(book);
    console.log("Add book methos is called",book);
    res.send("addbook is called");
})

app.delete("deleteBook:id",(req,res)=>{
    let bookId=req.params.id;
    let newBookList=[];
    books.forEach(book=>{
        if(book.Id!=book.id){
            books=book;
        }
    })
    console.log('deleted bookk is ${req.params.id}');
})

app.listen(5050,()=>{
    console.log('server started at port 5050');
})