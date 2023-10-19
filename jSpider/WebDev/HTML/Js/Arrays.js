


let a = [12,23,4,556,78];
console.log(a);


// Arrays

//push and pop

//  let arr1 = [12,23,4,556,78];

 //Includes()   >>> it will check wherate eleemnt present inside the array or not and it will produce result in boolean 

//  let res = arr1.includes(245);
//  console.log(res);


 //splice
// arr1.splice(0,2);  // this iwll delete th eelement from 0th index upto 2 index  
// console.log(arr1);
// arr1.splice(0 , arr1.length);  
// console.log(arr1);


// arr1.push(10000);
// arr1.pop();
// console.log(arr1);

// let arr2 = ["kamlesh", 'raushan','ajay','ajay08','sukhit', 'silpi'];
// arr2.push(4253535);
// arr2.pop();
// console.log(arr2);


//shift and unshift

// arr2.unshift(1000000, 200000000);  //to add the elements in first positions
// console.log(arr2);

// arr2.shift();
// console.log(arr2);



//write a code whih revesre a array


//first logic 
let arr3 = [12,24,40,6,8];
//delete even number froms the array 
//first logic 
// for(let i=0; i<arr3.length; i++){
//     if(arr3[i]%2==0){
//        arr3.splice(i,1);
//        i--;
//     }
// }
//  console.log(arr3);

//second logic

// for (let i = 0; i < array.length; i++) {
//     arr3[i].pu
    
// }

//sort the array

for(let i=0; i<arr3.length; i++){
    for(let j=i+1; j<arr3.length; j++){
        if(arr3[i]>arr3[j]){
            let temp = arr3[i];
            arr3[i]=arr3[j]
            arr3[j]=temp;
        }
    }
}
console.log(arr3);




// let arr4=[];
// for(let i =0; i<arr3.length; i++){
//     arr4.unshift(arr3[i])
// }
// console.log(arr4);


//second logic 


// for(let i=arr3.length-1; i>=0; i--){
//         arr4.push(arr3[i]);
// }
// console.log(arr4);