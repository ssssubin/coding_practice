class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<=t.length()-p.length(); i++) {
            // p.length()는 고정적인 숫자이기 때문에 인덱스가 바뀔 때마다 해당 인덱스만큼 더해줘야 함
            if(Long.parseLong(t.substring(i, p.length()+i))<=Long.parseLong(p)) answer++;
		}
        return answer;
    }
}