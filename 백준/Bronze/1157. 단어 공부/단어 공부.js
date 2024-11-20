const readline = require("readline");
const rl = readline.createInterface({ input: process.stdin });
let string = "";

rl.on("line", (input) => {
   string += input.toLocaleUpperCase();
   rl.close();
});

rl.on("close", () => {
   const word = string.split("");
   const map = new Map();
   word.map((alphabet) => {
      if (map.get(alphabet) === undefined) {
         map.set(alphabet, 0);
      }
      let count = map.get(alphabet);
      map.set(alphabet, ++count);
   });

   const mapToArr = Array.from(map);
   const answer = mapToArr.sort((a, b) => b[1] - a[1]);
   console.log(answer.length === 1 || answer[0][1] > answer[1][1] ? answer[0][0] : "?");
   process.exit();
});