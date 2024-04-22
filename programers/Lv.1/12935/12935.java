import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
		if(arr.length==1){ 
            arr[0]=-1;
            return arr;
        }
		else {
            ArrayList<Integer> b=new ArrayList<>();
            int min=arr[0];
			for(int i=1; i<arr.length; i++) {
                // arr[i]가 min보다 작으면 min을 arr[i]로 바꿔줌
				min=arr[i]<min?arr[i]:min;
			}
            // 모든 값을 돌아야 하기 때문에 foreach 문 사용
			for(int i:arr) {
				if(i!=min) b.add(i);
			}
            return b.stream().mapToInt(Integer::intValue).toArray();
		}
    }
}