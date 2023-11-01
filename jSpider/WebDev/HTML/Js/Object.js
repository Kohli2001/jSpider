// let user = {
//     name: "John",
//     id: 10,
//     role: "QA", 
//     experience: 5   
// };

//..............................................

// let user = new Object();
// user.name = "sukhit"
// user.age = 24
// user.role = "Students"
// console.table(user);
//........................................................................

// console.log(user); //{ name: 'John', id: 10, role: 'QA', experience: 5 }
// console.table(user); // output is table formate


// console.log(user["name"]); //John
//or
// console.log(user.name); //John

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
//re-initialize
// user.experience = 6

// console.table(user);

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,


// added new values.

// user.skills = "html"  // will be added to the object

// console.table(user)

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,


// nested object
// let user = {
//     name: "John",
//     id: 10,
//     role: "QA", 
//     experience: 5 ,
//     skills : ["js", "html"],
//     address:{
//         number: 100,
//         street :10,
//         locality: "jp nagar",
//         city:"Delhi",
//         pincode: 848205
//     }
// };

// console.table(user["address"]["number"]); // 100
// console.table(user);

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

// remove a data
// delete user.id;

// console.table(user);

//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,



//===============================Inbuilt Objects==========================================================================

//Math
// console.log(Math.PI); //3.141592653589793

// console.log(Math.random()*100); // it is provide different values.

// console.log(Math.trunc(Math.random()*10000));

//----------otp---------------

// let value = Math.random()*10000
// let otp = Math.trunc(value)
// if(value>999){
//     console.log(otp);
// }else{
//     console.log(otp + 1000);
// }


//..............................

// console.log(Math.round(-11.7));  //-12

// console.log(Math.floor(-1.7)); // -2
// console.log(Math.ceil(1.0002));
// console.log(Math.abs(-32784));
// console.log(Math.max(1,2,42,1,));
// console.log(Math.min(1,2,3,2));
// console.log(Math.pow(2,5));
// console.log(Math.cbrt(27));
// console.log(Math.log(1));
// console.log(Math.sin(0));
// console.log(Math.cos(0));
// console.log(Math.tan(0));
// let num = 225;
// // console.log(num**(1/2));
// console.log(1/nu);


// console.log(Math.sqrt(num));

//--------------------------Date---------------------------------

// let x = new  Date(); //time, date
// console.log(x.getHours());
// console.log(x.getMinutes());
// console.log(x.getSeconds());
// console.log(x.getDay());
// console.log(x.getTime());
// console.log(x.getDate());
// console.log(x.getFullYear());
// console.log(x.getMonth());


//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// let num = Math.random()*76;
// console.log(Math.trunc(num));
console.log(Math.round(-1.4));
