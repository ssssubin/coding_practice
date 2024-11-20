const readline = require("readline");
const rl = readline.createInterface({ input: process.stdin });
let string = "";

rl.on("line", (input) => {
   string += input;
   rl.close();
});

rl.on("close", () => {
   const alphabetList = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];

   alphabetList.map((alphabet) => {
      while (string.includes(alphabet)) {
         string = string.replace(alphabet, "a");
      }
   });
   console.log(string.length);
   process.exit();
});