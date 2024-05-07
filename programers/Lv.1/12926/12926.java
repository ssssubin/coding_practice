class Solution {
    public String solution(String s, int n) {
        String answer="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int a = (int)'a', z= (int)'z', A=(int)'A', Z=(int)'Z';
			
			if(ch>='a'&& ch<='z') { 
                // n만큼 더했을 때 z의 아스키값보다 커지면 a로 돌아와서 다시 더할 수 있도록
				answer+=((int)ch+n>z)?(char)((int)ch+n-1-z+a):(char)((int)ch+n);
			}
			else if(ch>='A'&&ch<='Z') {
                // n만큼 더했을 때 Z의 아스키값보다 커지면 A로 돌아와서 다시 더할 수 있도록
				answer+=((int)ch+n>Z)?(char)((int)ch+n-1-Z+A):(char)((int)ch+n);
			}else {
                // 공백일 경우
				answer+=ch;
			}
		}
        return answer;
    }
}

// char 문자형은 숫자와 더하면 숫자로 출력되는 점 + 알파벳은 26개라는 점 이용
// class Solution {
//     public String solution(String s, int n) {
//         String answer="";
// 		for(int i=0; i<s.length(); i++) {
// 			char ch=s.charAt(i);
// 			if(ch>='a'&&ch<='z') {
// 				answer+=(char)('a'+(ch+n-'a')%26);
// 			}else if(ch>='A'&&ch<='Z') {
// 				answer+=(char)('A'+(ch+n-'A')%26);
// 			}else {
// 				answer+=ch;
// 			}
		
// 		}
//         return answer;
//     }
// }