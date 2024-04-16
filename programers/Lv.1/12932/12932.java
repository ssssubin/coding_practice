class Solution {
    public int[] solution(long n) {
        String[] a=(n+"").split("");
        int[] answer=new int[a.length];
        for(int i=0; i<a.length; i++){
            answer[a.length-1-i]=Integer.parseInt(a[i]);
        }
        
        return answer;
    }
}