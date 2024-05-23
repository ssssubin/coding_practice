class Solution {
    public int solution(int n, int a, int b) {
        int cnt = 1; // 라운드 수
        while (cnt < n) {
            if (a < b) {
                if (a + 1 == b && b % 2 == 0)
                    break;
                else {
                    a = (int) (Math.ceil(a / 2.0));
                    b = (int) (Math.ceil(b / 2.0));
                    cnt++;
                }
            } else {
                if (b + 1 == a && a % 2 == 0)
                    break;
                else {
                    a = (int) (Math.ceil(a / 2.0));
                    b = (int) (Math.ceil(b / 2.0));
                    cnt++;
                }
            }
        }
        return cnt;
    }
}