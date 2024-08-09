class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health, count=0, index=0;
        for(int i=0; i<attacks[attacks.length-1][0]; i++){
            if(attacks[index][0] == (i+1)){
                answer -= attacks[index][1];
                count=0;
                index++;
            }else{
                answer+=bandage[1];
                count+=1;
                if(count == bandage[0]){
                    answer+=bandage[2];
                    count=0;
                }
            }

            if(answer >= health) answer = health;
            else if(answer<= 0) {
                return -1;
            }
        }
        return answer;
    }
}