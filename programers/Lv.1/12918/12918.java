class Solution {
    public boolean solution(String s) {
       if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
                // 숫자인지 판별하는 Character.isDigit() 함수 사용
                // for문 돌다가 숫자가 아니면 false 반환
				if(!Character.isDigit(s.charAt(i))) {
					return false;
				}
			}
           // s가 숫자로 구성되면 true 반환
           return true;
			
		}else {
			return false;
		}
    }
}