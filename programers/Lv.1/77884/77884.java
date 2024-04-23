class Solution {
    public int solution(int left, int right) {
        int answer=0;
		for(int i=left; i<=right; i++) {
			int cnt=0; // 약수의 개수
			for(int j=1; j<=i; j++) {
				if(i%j==0) cnt++;
			}
            // cnt가 짝수이면 +값 더하고 홀수이면 -값 더함
			answer+=(cnt%2==0)?i:-i;
		}
        return answer;
    }
}