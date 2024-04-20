class Solution {
    public String solution(String s) {
        // a : 단어의 가운데 글자
        int a = s.length()/2;
        // 삼항 연산자 사용, substring으로 문자열 잘라냄
        return (s.length()%2==0)?s.substring(a-1, a+1):s.substring(a,a+1);
    }
}