class Solution {
    boolean solution(String s) {
        s=s.toLowerCase(); // 문자열 s 소문자로 변환
		int cnt=0;
        // 문자열에 "p" or "y" 들어있는지 판단
        if(s.contains("p")==true ||s.contains("y")==true){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='p') cnt++;
                else if(s.charAt(i)=='y') cnt--;
                else continue;
            }
            if(cnt==0) return true;
            else return false;
        }
        else{
            return true;
        }
    }
}