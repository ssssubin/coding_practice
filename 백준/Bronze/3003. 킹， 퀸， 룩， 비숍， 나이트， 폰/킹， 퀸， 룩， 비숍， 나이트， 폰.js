const readline = require("readline");
const rl = readline.createInterface({ input: process.stdin });
const arr = [1, 1, 2, 2, 2, 8];
let inputInt = [];
rl.on("line", (input) => {
   inputInt = input.split(" ").map((value) => parseInt(value, 10));
   rl.close();
});

rl.on("close", () => {
   const result = arr.map((value, index) => value - inputInt[index]);
   const answer = result.join(" ");
   console.log(answer);
   process.exit();
});