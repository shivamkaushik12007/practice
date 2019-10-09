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