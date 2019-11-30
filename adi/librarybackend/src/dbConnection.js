const mongoose=require('mongoose');

mongoose.connect('mongodb://127.0.0.1:27017/uca3',{
    useNewUrlParser:true,
    useUnifiedTopology:true
});

var db=mongoose.connection;
db.on('error',function(){
    console.log("Error connecting to db")
})

db.once('open',function(){
    console.log('connected to db')
})