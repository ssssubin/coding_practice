function solution(lottos, win_nums) {
    let matchCount = 0;
    let zeroCount = 0;
    
    lottos.forEach((value)=>{
        matchCount += win_nums.includes(value) ? 1 : 0;
        zeroCount += value === 0 ? 1 : 0;
    });
    
    const countList = [];
    countList.push(matchCount);
    countList.push(matchCount + zeroCount);
    
    const rank = [];
    for(let i = 0; i < 2; i++){
        switch(countList[i]){
            case 6:
                rank.push(1);
                break;
            case 5:
                rank.push(2);
                break;
            case 4:
                rank.push(3);
                break;
            case 3:
                rank.push(4);
                break;
            case 2:
                rank.push(5);
                break;
            default:
                rank.push(6);
                break;
        }
    }
    return rank.sort();
}