class Solution {
    public String solution(String s) {
        // 모든 문자열 소문자로 바꿔주고 배열로 바꿈
      String[] b=s.toLowerCase().split("");
		String answer="";
        //첫 문자는 무조건 대문자이기 때문에 toUpperCase() 적용
		answer+=b[0].toUpperCase();
		
		for(int i=0; i<b.length-1; i++) {
            // i번째 문자열이 공백일 경우 다음 문자열은 대문자로 변환
			if(b[i].equals(" ")) answer+=b[i+1].toUpperCase();
            //그렇지 않으면 그대로 더해줌
			else answer+=b[i+1];
		}
        return answer;
    }
}