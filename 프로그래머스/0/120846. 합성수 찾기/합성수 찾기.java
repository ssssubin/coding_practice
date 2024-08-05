class Solution {
    public int solution(int n) {
        int answer=0;
        if(n == 1) return 0;
        else{
            for(int i=1; i<= n; i++){
                int cnt=0;
                for(int j=1; j<=n; j++){
                    if(i%j == 0){
                        cnt++;
                    }
                    if(cnt>=3) break;
                }
                if(cnt>=3) answer++;
            }
            return answer;
        }
    }
}