class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++) {
            // i번째 다음 학생이기 때문에 j는 i+1부터 시작
			for(int j=i+1; j<number.length-1; j++) {
                // j번째 다음 학생이기 때문에 k는 j+1부터 시작
				for(int k=j+1; k<number.length;k++) {
					answer+=(number[i]+number[j]+number[k]==0)?1:0;
				}
			}
		}
        return answer;
    }
}