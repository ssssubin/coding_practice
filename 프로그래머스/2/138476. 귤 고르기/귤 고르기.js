function solution(k, tangerine) {
    let answer = 0, sum = 0, obj ={};
    tangerine.forEach((value) => (obj[value] = 0));
    for(let i=0; i<tangerine.length; i++){
        obj[tangerine[i]] +=1;
    }
    obj = Object.values(obj).sort((a, b) => b - a);
    for(let i=0; i<obj.length; i++){
        answer++;
        sum+=obj[i];
        if(sum>=k){
            return answer;
        }
    }
}