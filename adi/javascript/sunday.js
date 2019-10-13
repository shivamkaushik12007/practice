/*
let arr1=[1,2,3,4,5]
arr1.forEach(item=>{
	console.log(item*2)
})

let arr2=new Array(1,2,3,4,5)
console.log(arr2)

Array.prototype.forEach2=function(cb){
	for(let i=0;i<this.length;i++){
		cb(this[i]);
    }
}
array.forEach2((item)=>{
	console.log(item);
})



let arr1=[1,2,3,4,5];
function callback(item){
	return item>50;
}
Array.prototype.map2=function(cb){
	var length=this.length;
	var newArr=[];
	for(let i=0;i<length;i++){
		newArr.push(cb(this[i]));
 	}
	return newArr;
}
arr1.map2(item=>item>50);
*/
/*
Array.prototype.forEach2=function(cb){
	for(let i=0;i<this.length;i++){
		cb(this[i]);
    }
}

array.forEach2((item)=>{
	console.log(item);
})
*/



//13/10/19
/*
var foo=function(name){
	this.name=name,
	this.methods=fooMethods	
}
var fooMethods={
	doSomething:function(){
		console.log('do something')
    },
	doMore:function(){
		console.log('domore')
    }
}
var obj1=new foo('some name');
obj1.methods.doSomething()
*/



/*
var str=[
  {
    name:"n1",
    marks:20
  },
  {
    name:"n2",
    marks:40
  },
  {
    name:"n3",
    marks:50
  },
  {
    name:"n4",
    marks:10
  },
  {
    name:"n5",
    marks:50
  }
]

for(let i=0;i<str.length;i++){
  if(str[i].marks>=40){
    console.log(str[i]);
  }
}
let v=str.filter((students)=>{
  return students.marks<40;
})
console.log(v);
*/



/*
class Student{
  constructor(name){
    this.name=name;
  }
  addProps(){
    this.value="random";
  }
  showProperties(){
    console.log(`the value are:
                ${this.name}`);
  }
}

var x=new Student("Some name");
*/