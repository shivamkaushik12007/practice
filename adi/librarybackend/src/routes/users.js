var express=require('express');
const router=express.Router();
const UserModel=require('../models/users')
// router.get('',(req,res)=>{
//     res.send("user response from router");
// });

router.get('',(req,res)=>{
    UserModel.findUsers(req,(error,response)=>{
        if(error) console.log('error');
        if(response) {
            console.log('response: ',response);
            res.send(response);
        }
    })
})

router.post('/add',(req,res)=>{
    UserModel.addUsers(req,(error,response)=>{
        if(error) console.log('error');
        if(response) {
            console.log('response: ',response);
            res.send(response);
        }
    })
})

router.post('/update',(req,res)=>{
    UserModel.updateUsers(req,(error,response)=>{
        if(error) console.log('error');
        if(response) {
            console.log('response: ',response);
            res.send(response);
        }
    })
})

module.exports = router;
