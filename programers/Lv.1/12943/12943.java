class Solution {
    // 매개변수가 int라고 주어졌는데, 연산하는 과정에서 숫자가 매우 커지는 경우가 
    // 발생하기 때문에 long으로 형변환 해줌
    public int solution(long num) {
        int cnt=0; // 연산 작업 횟수
		if(num==1) {
			return 0;
		}
        // num이 1이 아닐 때 while문으로
		while(cnt<500) {
			if(num%2==0) {
				cnt++;
				num/=2;
			}
			else {
				cnt++;
				num=num*3+1;
			}
			
            // 중간에 num이 1이 되면 while문 빠져나가도록
			if(num==1) break;
		}
		if(cnt>=500) return -1;
		else return cnt;
    }
}