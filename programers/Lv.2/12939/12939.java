class Solution {
    public String solution(String s) {
        String[] a=s.split(" ");
		String min, max;
        min=max=a[0];
		for(int i=0; i<a.length; i++) {
			if(Integer.parseInt(a[i])<Integer.parseInt(min)) {
				min=a[i];
			}
			if (Integer.parseInt(a[i])>Integer.parseInt(max)) {
				max=a[i];
			}
		}
        return min+" "+max;
    }
}