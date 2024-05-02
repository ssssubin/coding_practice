class Solution {
    public int solution(int n) {
        String answer="";
		while(n>=1) {
            // 문자열로 바꾼 후 빈 문자열에 더함
			answer+=Integer.toString(n%3);
			n/=3;
		}
        // 3진수를 10진수로 변환
        return Integer.parseInt(answer,3);
    }
}