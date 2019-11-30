const mongoose=require('mongoose');

const usersSchema=new mongoose.Schema({
    name: String,
    roll: Number,
    age: Number,
    isEnabled: Boolean
})

const UsersModel=mongoose.model("users",usersSchema);

// UsersModel.findUsers=function(){
//     UsersModel.find({},()=>{
//         if(error) console.log('error');
//         if(respoonse) console.log('response is: ',response);
//     });
// }

UsersModel.findUsers=function(req,callback){
    let id=req.query.id;
    let query={};
    if(id){
        query={_id:id}
    }
    UsersModel.find(query,callback);
}

UsersModel.addUsers=function(req,callback){
    let user=req.body;
    UsersModel.create(user,callback);
}

UsersModel.updateUsers=function(req,callback){
    let query={_id:req.body._id};
    let user=req.body;
    UsersModel.updateOne(user,callback);
}


module.exports=UsersModel;