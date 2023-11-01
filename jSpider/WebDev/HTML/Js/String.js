//Strings

// let str = "string"


// console.log(str[0]);  // s
// console.log(str[8]);  // undefined
// // find the length of strings
// console.log(str.length);


//.......................................................................................................
//charAt()
// console.log(str.charAt(2)); // r
// console.log(str.charAt(8)); // emptyString

//.....................................................................................................
//indexOf()
// console.log(str.indexOf("i")); // 3
// if we give multiple char

// let b = "java"
//  console.log(b.indexOf("a"));  //1
// console.log(b.indexOf('a', 2));

// let st = "dasara"

//.................................................................................................
 // lastIndexOf()
//  console.log(b.lastIndexOf("a")); // 3
//..........................................................................................................
// substring()
// let res = st.substring(0,3)
// console.log(res);// das

//..................................................................................................................
// let res = st.replace('a', 'e')
// console.log(res); // desara

// // if you want replace all char
// let re = st.replaceAll('a', 'e')
// console.log(re);// desere

//..............................................................................................................
//toUpperCase and toLowerCase

// let st = "dasara"
// console.log(st.toUpperCase()); // DASARA

// console.log(st.toLowerCase()); // dasara

//..............................................................................................................................

// count the special char
// let st = "AJAY KUMAR"
// let res = st.toLowerCase()
// let c = 0
// for(let i =0; i<res.length; i++){
//     if(res[i]=='a'){
//         c++
//     }
// }
// console.log(c);





//.............................................................................................................................................
// let str = "java"
// let res = ""
// for(let i =0; i<str.length; i++){
//     res += str[i] + str[i]
// }
// console.log(res);

//,.......................................................................................................................


//reverse
// let str = "ava"
// let res = ""
// for(let i = str.length-1; i>=0; i--){
//     res += str[i]
// }
// console.log(res); //avaj
// if (str==res) {
//     console.log('palidrome');
    
// }else{
//     console.log('Not palidrome');
// }



let a = 0.2/0.2
let b = 1
console.log(a===b);