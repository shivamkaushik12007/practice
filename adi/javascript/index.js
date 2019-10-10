// console.log("hello");
// import{a,b} from "./external.js";
// console.log(a);
// console.log(b());

//"10/10/19"
// function getUserId(name){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve(20);
//         },2000);
//     });
// }
// function getBalance(id) {
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve(2000);
//         },2000);
//     })
//   }
  
//  let name="abc";
// // getUserId(name)
// // .then((id)=>{
// // return getBalance(id);
// // })
// // .then((balance)=>{
// // console.log(balance);
// // })

// async function init(){
//     let id=await getUserId(name);
//     let balance=await getBalance(id);
//     console.log(balance);
// }
// init();

//it is not possible to view the value of the symbol and symbol always generate new unique value
// let sym=Symbol("description");
//  let s1=Symbol("abc");
//  let s2=Symbol("abc");
// console.log(s1==s2);
// let sym=Symbol();
// let ob={
//     name:"abc",
//     [sym]:12
// }
// console.log(sym);
// console.log(ob);
// console.log(ob.sym);

// let s1=Symbol.for("age");//we can share symbol using for fucnction
// let s2=Symbol.for("age");
// // console.log(s1==s2);
// let obj={name:"abc"};
// function makeAge(obj){
//     let s3=Symbol.for("age");
//     obj[s3]=27;
// }
// makeAge(obj);
// console.log(obj[s1]);

// // console.log(Symbol.Iterator);
// let arr=[1,2,3];
// // console.log(typeof arr[Symbol.iterator])
// let it=arr[Symbol.iterator]();
// console.log(it.next());
// console.log(it.next());
// console.log(it.next());

// let obj={
//     arr:[1,2,3],
//     [Symbol.iterator]:function(){
//         let i=0;
//         let arr=this.arr;
//         return{
//             next:function(){
//                 let value=arr[i];
//                 i++;
//                 return{
//                     done:i>arr.length?true:false,
//                     value:value,
//                 }
//             }
//         }
//     }
// }
// for(let ele of obj){//forof loop
//     console.log(ele);
// }

// let obj={
//     [Symbol.iterator]:abc
// }
// function *abc(){//* represents generator and it atomatically use iterator
//     yield 1;
//     yield 2;
// }
// for(let ele of obj){//forof loop
//     console.log(ele);
// }
//Symbol.iterator:wellknown symbol