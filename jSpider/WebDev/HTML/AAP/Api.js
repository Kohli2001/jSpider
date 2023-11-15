let url ='https://jsonplaceholder.typicode.com/todos'
// https://jsonplaceholder.typicode.com/users



let api =async()=>{
    let response = await fetch(url)
        let data = await response.json();
        // console.log(data.length);

        console.log(data);  // printing the all data 


        //accessing data from 
        // for(let i=0; i<data.length; i++){
        //     console.log(data[i].name);
        // }

        // data.map((name)=>{

        //     console.log(name.email);
        // })



}
api();