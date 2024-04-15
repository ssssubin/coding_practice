class Solution {
    public boolean solution(int x) {
        int answer=0;
        String[] a=Integer.toString(x).split("");
        for(String s:a){
            answer+=Integer.parseInt(s);
        }
        if(x%answer==0) return true;
        else return false;
    }
}
