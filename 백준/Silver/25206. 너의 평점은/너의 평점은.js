const readline = require("readline");
const rl = readline.createInterface({ input: process.stdin });

let count = 0;
const input = [];
rl.on("line", function (line) {
    input.push(line);
    count += 1;
    if(count === 20) {
        rl.close();
    }
});

rl.on("close", ()=>{
   const subject =[];
   let score = 0;
   input.map((value) => {
      const array = value.split(" ");
      switch (array[2]) {
         case "A+":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 4.5);
            break;
         case "A0":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 4.0);
            break;
         case "B+":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 3.5);
            break;
         case "B0":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 3.0);
            break;
         case "C+":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 2.5);
            break;
         case "C0":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 2.0);
            break;
         case "D+":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 1.5);
            break;
         case "D0":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 1.0);
            break;
         case "F":
            score += parseFloat(array[1]);
            subject.push(parseFloat(array[1]) * 0.0);
            break;
         default:
            break;
      }
   });
   let sum = 0;
   subject.forEach((value) => (sum += value));
   console.log(sum / score);
});

