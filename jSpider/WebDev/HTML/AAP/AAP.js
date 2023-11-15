let MSD = () => {
    return `5 times champions...`
}

let Vk = () => {
    return new Promise((resolve , reject)=>{
        setTimeout(() => {
            resolve(`Ea sala cup namde`) ;
        }, 5000);
    })
   
}
let Maxi = () => {
    return `Mad Maxi`
}

let result = async () => {
    console.log(MSD());
    console.log(await Vk());
    console.log(Maxi());
}
result()