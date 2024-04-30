class Solution {
    public int solution(int n) {
        // n 자기 자신은 무조건 포함하기 때문에 1로 시작
        int cnt=1;
        // 절반 이상 넘어가면 다음 숫자와 더했을 때 n보다 커지기 때문에
        // i를 n/2까지로 설정
		for(int i=1; i<=n/2; i++) {
			int result=0;
			for(int j=i; j<n; j++) {
				result+=j;
                // n 보다 커지면 두 번째 for문 나가도록
				if(result>=n) break;
			}
			if(result==n) cnt+=1;
		}
        return cnt;
    }
}