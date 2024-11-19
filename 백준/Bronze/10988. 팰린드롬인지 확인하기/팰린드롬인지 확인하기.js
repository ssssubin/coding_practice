const readline = require("readline");
const rl = readline.createInterface({ input: process.stdin });

let string = "";
rl.on("line", (input) => {
   string += input;
   rl.close();
});

rl.on("close", () => {
   const reverse = string.split("").reverse().join("");
   console.log(string === reverse ? 1 : 0);
   process.exit();
});