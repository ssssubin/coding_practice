function solution(number, limit, power) {
    const num = [];
    let count = 0;
    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= Math.sqrt(i); j++) {
            if (i % j === 0){
                count+=2;
                if(j === i / j) count --;
            }
        }
        num.push(count <= limit ? count : power);
        count = 0;
    }
    const initialValue = 0;
    const weight = num.reduce((acc, value) => acc + value, initialValue);
    return weight;
}