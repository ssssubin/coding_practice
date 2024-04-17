class Solution {
    public int solution(int n) {
        int answer=2;
        while(answer<n){
            if((n-1)%answer==0) return answer;
            answer++;
        }
        return answer;
    }
}