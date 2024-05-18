class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a개 미만이 될 때까지
        while (n >= a) {
            answer += ((n / a) * b);
            n = ((n / a) * b) + (n % a);
        }
        return answer;
    }
}