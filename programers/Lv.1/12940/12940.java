class Solution {
    public int[] solution(int n, int m) {
        int[] answer= new int[2];
		// 최대공약수
        for(int i=1; i<=m; i++) {
			if(n%i==0&&m%i==0) {
				answer[0]=i;
			}
		}
        // 최소공배수
		for(int i=m;i<=m*n; i++) {
			if(i%n==0&& i%m==0) {
				answer[1]=i;
                // 최소공배수를 구하기 위해 한 번 일치하면 바로 반복문 빠져나올 수 있도록
				break;
			}
		}
        return answer;
    }
}