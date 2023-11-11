



let title = document.getElementById('msg')

let data =
    [
        { message: "You will have good day" },
        { message: "you need an umbrella today" },
        { message: "you will recieve an offer later today" },
        { message: "you will have class at 4:30 for 3 hr today" },
        { message: "you will meet love today" }

    ]

let num = random = () => {

    let guess = (Math.trunc(Math.random() *data.length))
    title.textContent=data[guess].message

    // switch (guess) {
    //     case 1:
    //         alert(data[guess].message)

    //         break;
    //     case 2:
    //         alert(data[guess].message)
    //         break;
    //     case 3:
    //         alert(data[guess].messagee)
    //         break;
    //     case 4:
    //         alert(data[guess].message)
    //         break;
    //     case 5:
    //         alert(data[guess].message)
    //         break;
    //     default:
    //         alert("Wait")
    //         break;
    }

