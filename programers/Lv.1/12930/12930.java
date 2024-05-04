class Solution {
    public String solution(String s) {
        String answer = "";
		int cnt=0;
		String[] a = s.split("");
		for(String str :a) {
			if(str.equals(" ")) {
				answer+=str;
				cnt=0;
			}else {
				answer+=(cnt%2==0)?str.toUpperCase():str.toLowerCase();
				cnt++;
			}
		}
        return answer;
    }
}