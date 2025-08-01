let btn = document.querySelector('#mode');
let body = document.querySelector('body');
let curmode = 'dark';

btn.addEventListener("click",() =>{
    if (curmode === "dark") {
        curmode = "light";
        body.style.backgroundColor="white";
    }
    else{
        curmode = "dark";
        body.style.backgroundColor="black";
    }
});
