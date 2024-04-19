class Solution {
    public String solution(String phone_number) {
		String answer="";
        // 문자열 길이와 charAt() 사용
		for(int i=0; i<phone_number.length(); i++){
            //뒤의 네 자리를 제외한 길이만큼 answer에 * 더해줌
            if(i<phone_number.length()-4) answer+="*";
            // 뒤의 네자리는 answer에 그대로 더해줌
            else answer+=phone_number.charAt(i);
        }
        return answer;
    }
}