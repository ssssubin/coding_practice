class Solution {
    public String solution(int n) {
        String s="";
		for(int i=1; i<=n; i++) {
            //홀수일 때는 빈 문자열에 "수" 더하고 짝수일 때는 "박"을 더함 
			s+=(i%2!=0)?"수":"박";
		}
        return s;
    }
}