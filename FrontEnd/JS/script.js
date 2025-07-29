// let num = 25;
// let gussNum = prompt("Enter your guess number");
// while (num!=gussNum) {
//     gussNum = prompt("Wrong number enteer again!");
// }
// console.log("You entered correct number");


// let marks
// while (marks!=5) {
//     marks = prompt("Enter your marks");
//     if (marks < 35) {
//         console.log("Grade : F");
//     }
//     else if (marks <= 55) {
//         console.log("Grade : E");
//     }
//     else if (marks <= 65) {
//         console.log("Grade : D");
//     }
//     else if (marks <= 75) {
//         console.log("Grade : C");
//     }
//     else if (marks <= 85) {
//         console.log("Grade : B");
//     }
//     else if (marks <= 100) {
//         console.log("Grade : A");
//     }
//     else {
//         console.log("Invalid marks");
//     }
// }


// let marks = [40,50,60,70,80];
// console.log(marks[2]+" index access");
// let sum  = 0;
// for(let mark of marks){
//     sum+=mark;
// }
// console.log(`Total is ${sum}`);

// console.log(`Avg is ${sum/marks.length}`);

// console.log("Here it starts..");
// for(let i = 0; i < marks.length; i++){
//     console.log(marks[i]+" ");
// }


// let i = 0;
// let prices = [250,645,300,900,50];
// for (let val of prices) {
//     console.log(val);
//     let offer = val / 10;
//     prices[i] = val-offer;
//     console.log(prices[i]+" ");
//     i++;
// }





// let heros = ["hulk","iron Man","Thor","Victor"];

// heros.unshift("antman");
// heros.shift();

let num = [1,2,3,4,5,6];
// console.log(num);
// num.splice(1,2,101,102);
// console.log(num);

// num.splice(2,0,3.5);
// console.log(num);

// num.forEach((n)=>{
//     console.log(n);
// });
// console.log("Squaring number");

// num.forEach((n)=>{
//     console.log(`printing numbers using forEach ${n*n}`);
    
// })


// let newArray = num.map((val)=>{
//     console.log(val*5+" hiii");
// })

// let evenArray = num.filter((val)=>{
//     return val%2===0;
// });

// console.log(evenArray);

// let greaterThan3 = num.filter((val)=>{
//     return val>3;
// });

// console.log(greaterThan3);


const output = num.reduce((prev,cur)=>{
    return prev > cur ? prev : cur;
});

console.log(output);


// const output = num.reduce((prev,cur)=>{
//     return prev + cur;
// });

// console.log(output);


// let obj = {
//     Fullname : "Phani",
//     age : 21,
//     cgpa : 7.5,
//     isPassed : true
// };

// alert("Hello");
// let val = prompt("this is a message");
// console.log(val);

// let userName = "@"+val+val.length;
// console.log(userName);

// for (let i = 0; i < 5; i++) {
//     console.log("Hello, world!");
// }



// console.log(`my name is${obj.Fullname} and my age is ${obj.age} and my cgpa is ${obj.cgpa} and i am passed ${obj.isPassed}`);
// console.log(obj);

// let val = "Phanindra";
// for(let va of val){
//     console.log(va);
// }
// console.log("Hello World!");