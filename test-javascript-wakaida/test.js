"use strict"

// 問1
console.log("問1");
console.log("若井田康太");


// 問2
console.log("問2");
const firstName = "Kota";
const lastName = "Wakaida";
console.log(firstName + " " + lastName);


// 問3
console.log("問3");
let itemA = 200;
let itemB = 250;
const taxRate = 0.1;

console.log("小計");
const result1 = itemA * 3 + itemB * 4;
console.log(result1 + "円");

console.log("消費税");
const result2 = result1 * taxRate;
console.log(result2 + "円");

console.log("合計金額");
const result3 = result1 + result2;
console.log(result3 + "円");


// 問4
console.log("問4");
const testScore = 48;
if (0 <= testScore && testScore <= 79) {
    console.log("追試です");
} else if (80 <= testScore && testScore <= 100) {
    console.log("合格です");
} else {
    console.log("存在しない点数です");
}


// 問5
console.log("問5");
let result = 0;
for (let i = 1; i <= 100; i++) {
    result += i;
}
console.log(result);


// 問6
console.log("問6");
function add(num1, num2) {
    return num1 + num2;
}
function sub(num1, num2) {
    return num1 - num2;
}
function multi(num1, num2) {
    return num1 * num2;
}
function div(num1, num2) {
    return num1 / num2;
}

console.log("5 + 3 = " + add(5, 3));
console.log("5 - 3 = " + sub(5, 3));
console.log("5 * 3 = " + multi(5, 3));
console.log("5 / 3 = " + div(5, 3));
