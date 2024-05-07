import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        //가로와 세로가 중요치 않기 때문에 가로 길이를 둘 중 작은 숫자로, 세로 길이를 둘 중 큰 숫자로 정렬
		for(int i=0; i<sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
         //가로, 세로 길이는 정렬된 숫자들 중 가장 큰 숫자로 지정
		int width=sizes[0][0], height=sizes[0][1];
		for(int i=0; i<sizes.length; i++) {
			if(width<sizes[i][0]) width=sizes[i][0];
			if(height<sizes[i][1]) height=sizes[i][1];
		}
        return width*height;
    }
}