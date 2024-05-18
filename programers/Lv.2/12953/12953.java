import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        // 제일 큰 수의 배수가 나머지 수들의 배수가 되는지 확인하도록 코드 작성
        int i = 1, big = arr[arr.length - 1];
        while (true) {
            int cnt = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                // 제일 큰 수의 배수가 나머지 수들의 배수가 되면 counting
                if (big % arr[j] == 0)
                    cnt++;
            }
            // counting한 수가 나머지 숫자들의 개수와 동일하면 반복문 빠져나옴
            if (cnt == (arr.length - 1))
                break;
            i++;
            big = arr[arr.length - 1] * i;
        }
        return big;
    }
}