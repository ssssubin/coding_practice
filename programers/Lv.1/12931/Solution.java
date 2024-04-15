public class Solution {
    public int solution(int n) {
        String[] a=(n+"").split("");
        int answer = 0;
        for(String s:a){
            answer+=Integer.parseInt(s);
        }
        return answer;
    }
}