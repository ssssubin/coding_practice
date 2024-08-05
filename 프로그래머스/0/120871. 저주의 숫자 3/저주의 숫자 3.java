class Solution {
    public int solution(int n) {
        int[] number = new int[101];
        int cnt=1, i=1;
        while(cnt<=100){
            if(!Integer.toString(i).contains("3") && i%3 != 0){
                number[cnt] = i;
                cnt++;
            }
            i++;
        }
        return number[n];
    }
}