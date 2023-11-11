

let temp = document.getElementById('temp');
let city = document.getElementById('city')
// let country = document.getElementById('country')
let input=document.querySelector('input');

let search=async()=>{
    if(input.value==""){
        alert("Please Enter City name before Search")
        // input.style.border="1px solid red"
    }
    else{
        let url =`https://api.openweathermap.org/data/2.5/weather?q=${input.value}&units=metric&appid=1cb6532aea3c298a830a71380eace21e`
        let respose = await fetch(url);
        let data = await respose.json();
        // console.log(data);
        temp.textContent=`${data.main.temp}°C`;
        city.textContent=`${data.name},${data.sys.country}`;    
        // country.textContent=data.sys.country;
        



    }
}
