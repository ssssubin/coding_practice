import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] a=s.split("");
		String answer="";
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			answer+=a[a.length-1-i];
		}
        return answer;
    }
}