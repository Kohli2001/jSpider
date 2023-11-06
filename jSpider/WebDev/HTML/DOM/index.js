// console.log(document.head);
// console.log(document.title);
// console.log(document.body);
// console.log(document.URL);
//console.log(document.h1);>>//we can't fetch h1 because inside our body tag there might be the n numbers of h1 present



//DOM Methods 

//id--> one element
// let element = document.getElementById('title')
// console.log(element);

// let image = document.getElementById('img')
// console.log(image);


//class--> multiple element , it shows hetrogenius nature 
// let element = document.getElementsByClassName('title');
// console.log(element); // to fetch all the element


// let element1= document.getElementsByClassName('title');
// console.log(element1[0]); // to fetch only one elemet or first elemet

// because here  document.getElementsByClassName saved the element in the array form so here element variable is a array

//Tag/element---> multiple same as class but the main difference is it shows homogenius nature 

// let elemnet2 = document.getElementsByTagName('h1');
// console.log(elemnet2);


//Query selectors  ---> it will fetch only one elements 

// let element = document.querySelector('#heading')
// console.log(element);

//QuerySelectorAll

let element = document.querySelectorAll('h1')
console.log(element);