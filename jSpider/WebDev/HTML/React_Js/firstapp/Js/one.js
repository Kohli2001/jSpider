
let arr=[45,16,12,2001];

//destructing of the Array

let [a,b,c,d,] = arr;

console.log(a); //45



//destructing of  the Object 

let obj ={
    id: 1,
    name:"kmalesh",
    sal:450039,
    role:"SDE1"
}

let {id,name,sal,role}= obj;

console.log(id);
console.log(name);



//variable Hoisting 
console.log(var2); //Error 
let var1 = 100;

var var2 = 2000;

//function hoisting 


//normal function 
add();
function add(){
    console.log("kamlesh");
}
//









