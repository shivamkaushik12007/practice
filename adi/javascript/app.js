// function hello(){
//     console.log('hello world');
// }
// hello();

// let a=25;
// if(true){
//     let a=35;
//     console.log(a);
// }
// console.log(a);
 
// const abc=[1,2,3,4];
// abc.push(10);
// console.log(abc[4]);
// const a=20;
// console.log(a);

//// function funcname(args){
////     body;
//// }
//// funcname(); //for calling 

// function abc(a,b,c=30){ //default arguments
//     console.log(a+" "+b+" "+c);
// }
// abc(10,20);

// function abc(...a){ //rest operator
//     console.log(a);
// }
// abc(10,20,'hh');

// var a=function(){ //anonymus function
//     console.log('hey');
// }
// a();

// var hello=(...a)=>{ //arrow functions in ES6
//     return('helloworld!'+" "+a);
// }
// console.log(hello(10,20,30,40));

// console.log(a);
// var a=10;
// var b=null;
// console.log(b);

// var a=[1,2,3,4,5,6];
// a.push(10);
// console.log(a[6]);
// a.pop();
// console.log(a[5]);
// a.shift();
// console.log(a[0]);
// a.unshift(1);
// console.log(a[0]);

// var a = function v(){
//     console.log('hey');
//     return 100;
// }
// // a();
// console.log(a());
// function b(c,temp){
//     console.log(c()+" "+temp);
// }
// b(a,10);

// var x=[1,2,3,4,5];
// function add(number){
//     return number+=1;
// }
// var y=x.map(add);
// console.log(y);
// console.log(x);

//  var x=[1,2,3,4,5];
 // function odd(num){
//     return num&1;
// }
// var y=x.filter(odd);
// console.log(y);

// x.forEach(function(i){console.log(i);})

//*****(IIFS)immidately invoked function expression
// (function (){
//     console.log("hello");
// })();

// var result=(function (){
//                 return "hello";
//             })();
// console.log(result);

//Objects
// let obj={};
// obj.name="abc";
// obj.age=12;
// console.log(obj);
// console.log(obj.name);
// console.log(obj.age);
// obj.name="xyz";
// console.log(obj.name);

// let obj1={//also know as json format
//     name:"abc",
//     age:18,
//     interest:['gaming','reading'],
//     greet:function(){console.log("function mein")},
//     address:{street:12,sector:25}
// }
// console.log(obj1.name);
// console.log(obj1.age);
// console.log(obj1.interest);
// for(let i=0;i<obj1.interest.length;i++){
//     console.log(obj1.interest[i]);
// }
// console.log(obj1.address.street);
// console.log(obj1.address.sector);
// obj1.greet();
// obj1.newprop="new";
// console.log(obj1.newprop);

// function Person(name){
//     this.name=name;
//     this.greet=function(){return "hello "+this.name};
// } 
// let obj1=new Person("cool");
// console.log(obj1.name);
// console.log(obj1.greet());
// let obj=new Person("abc");
// console.log(obj.name);
// console.log(obj.greet());

// class Person{
//     constructor(name){
//         this.name=name;
//     }
//     greet(){console.log("set");}
// }
// class Student extends Person{
//     constructor(name,grade){
//         super(name);
//         this.grade=grade;
//     }
//     getClass(){
//         return this.grade;
//     }
// }
// let obj=new Person("demo");
// console.log(obj.name);
// obj.greet();
// let sobj=new Student("name",99);
// console.log(sobj.getClass());
// console.log(sobj.name);

/*MODULES and PROMISES*/
//modules 
//ES5
// var xyz=require("./module.js");
// console.log(xyz);
//ES6
// import xyz from "./module.js";//have to install babel
// console.log(xyz);

    //problem in synchronous code
// console.log("before");
// console.log(func1());
// func();
// console.log("after");
// console.log(func1());
// function func1(){
//     setTimeout(()=>{return 1},2000);
// }
// function func(){
//     setTimeout(()=>{console.log(1)},2000);
// }

// console.log("before");  /it is kind of "callback hell"
// func((x)=>{console.log(x);console.log("after");});
// // console.log("after");
// function func(callback){
//     setTimeout(()=>{callback(1)},2000);
// }

// "9/10/19"
// let x=require("./module.js");
// console.log(x.a1);
// console.log(x.b1());
// console.log(x.c1);
// console.log(x.a);
// console.log(x.b());
// console.log(x.c);
// console.log(x());

// console.log('before')
// console.log(func())
// console.log('after')
// function func(){
//     setTimeout(()=>{return "hello"},2000)
// }


// fun1((x)=>{
//     fun2(x.id,(y)=>{
//         fun3(y[0],(z)=>{
//             console.log(z)
//         });
//     });
// });
// function fun1(callback){
//     setTimeout(()=>{callback({id:1,name:'abc'})},2000);
// }    
// function fun2(x,callback){
//     setTimeout((c)=>{console.log(x);
//         callback([4,5,6]);},2000);
// }
// function fun3(y,callback){
//     setTimeout(()=>{console.log(y);
//         console.log("done");},1000);
// }

// fun1(dfun2); ///toremove the heirarchy
// function dfun2(x){
//     fun2(x.id,dfun3);
// }
// function dfun3(y){
//     fun3(y[0],display);
// }
// function display(z){
//     console.log(z);
// }

//PROMISES
let p=new Promise((resolve,reject)=>{
    resolve("hello");
})
p.then((x)=>{console.log(x)});