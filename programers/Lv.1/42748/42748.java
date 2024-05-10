import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer= new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			int n= commands[i][1]-commands[i][0]+1;
            // i번째부터 j번째 숫자까지 자르고 정렬하는 배열
			int[] sortArr = new int[n];
			for(int j=0; j<n; j++) {
                // array의 i번째 숫자부터 j번째 숫자 담음
				sortArr[j]=array[commands[i][0]-1+j];
			}
            // 오름차순으로 정렬
			Arrays.sort(sortArr);
			answer[i]=sortArr[commands[i][2]-1];
		}
        return answer;
    }
}