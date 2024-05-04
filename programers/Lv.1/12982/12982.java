import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, sum=0;
        // 많은 부서에 지원해주기 위해서는 금액이 적은 순서대로 지원해줘야 한다고 생각해서
        // sort() 사용하여 오름차순으로 정렬시켜줌
        Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
			sum+=d[i];
			if(sum<=budget) answer++;
            // budget보다 클 경우에는 반복문 벗어나도록 하여 의미 없는 연산하지 않도록 해줌
			else break;
		}
        return answer;
    }
}