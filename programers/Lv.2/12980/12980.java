class Solution {
	public int solution(int N) {
		int buse = 0; // 건전지 사용량
		while (N > 0) {
			// N이 홀수이면 -1한 후 2로 나눔 0이 될 때까지 반복
			if (N % 2 != 0) {
				N = (N - 1) / 2;
				buse++;
			} else
				N /= 2;
		}
		return buse;
	}
}