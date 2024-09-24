function solution(arr) {
    var answer = arr.reduce((prev, curr) => prev + curr) / arr.length;;
    return answer;
}