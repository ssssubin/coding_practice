import java.util.ArrayList;
import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        ArrayList<Integer> list = new ArrayList<>();
		int answer=0;
		Arrays.sort(A);
		Arrays.sort(B);
        // 큰 값부터 list에 넣어주는 코드
		for(int i=0; i<B.length; i++) {
			list.add(B[B.length-1-i]);
		}
		int[] reserveB=list.stream().mapToInt(Integer::intValue).toArray();
		for(int i=0; i<A.length; i++) {
			answer+=(A[i]*reserveB[i]);
		}

        return answer;
    }
}