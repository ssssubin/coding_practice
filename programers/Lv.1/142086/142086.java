class Solution {
    public int[] solution(String s) {
        //s 길이만큼 0으로 초기화
        int[] answer=new int[s.length()];
		answer[0]=-1;
		for(int i=1; i<s.length(); i++) {
            //0부터 i까지
			for(int j=0; j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					answer[i]=i-j;
				}
			}
			if(answer[i]==0) answer[i]=-1;
		}
        return answer;
    }
}
// 최대 실행 속도 : 99.23ms


// substring(),indexOf(), lastIndexOf(), 삼항 연산자 사용 -> 실행 속도 개선(최대 실행 속도 : 25.80ms)
// indexOf(String): 인자로 전달된 String의 index 리턴(인자로 전달된 String 못 찾으면 -1 반환)
// lastIndexOf(String) : 마지막 인덱스 -> 처음 인덱스 순으로 문자열 찾고 싶을 때 사용
// class Solution {
//     public int[] solution(String s) {
//         int[] answer=new int[s.length()];
// 		answer[0]=-1;
// 		for(int i=1; i<s.length(); i++) {
// 			String subStr=s.substring(0,i);
// 			if(subStr.indexOf(s.charAt(i))==-1) {
// 				answer[i]=-1;
// 			}
// 			else {
// 				answer[i]=i-subStr.lastIndexOf(s.charAt(i));
// 			}
// 		}
//         return answer;
//     }
// }
