class Solution {
    boolean solution(String s) {
        int cnt=0;
        // 첫 번째 문자가 '(' 아니거나 마지막 문자가 ')' 아닐 때 false 반환
        if(s.charAt(0)!='('||s.charAt(s.length()-1)!=')') return false;
        else{
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='(') cnt+=1;
                else cnt-=1;
                
                // 중간에 cnt 음수 되면 괄호가 안 닫혔다는 의미이므로 break로 for문 탈출
                if(cnt<0) break;
            }
            return cnt==0?true:false;
        }
    }
}