import java.util.Arrays;

class Solution {
    // 명예의 전당 배열 하나 따로 만들기 int[] jundang=new int[k]
    // min = score[0]이라고 하고 이후 들어오는 숫자들과 비교해서 min update(k-1까지는)
    // 명예의 전당 꽉차면 들어오는 숫자와 jundang 오름차순 정렬, jundang의 첫번째 수와 들어오는 숫자 비교
    // 들어온 숫자가 더 크면 jundang의 첫번째 숫자를 들어오는 숫자랑 바꾸고 정렬, 더 작으면 무시
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length], jundang = new int[k];
        int min = score[0];
        // score 길이가 k보다 크다면
        if (k < score.length) {
            // 0부터 k-1까지
            for (int i = 0; i < k; i++) {
                jundang[i] = score[i];
                if (score[i] < min) {
                    min = score[i];
                }
                answer[i] = min;
            }
            // k부터 끝까지
            for (int i = k; i < score.length; i++) {
                Arrays.sort(jundang);
                if (jundang[0] < score[i]) {
                    jundang[0] = score[i];
                    answer[i] = (jundang[0] > jundang[1] ? jundang[1] : jundang[0]);
                } else {
                    answer[i] = jundang[0];
                }
            }
        } else {
            // score 길이가 k보다 작다면
            // score 길이까지만 연산
            for (int i = 0; i < score.length; i++) {
                jundang[i] = score[i];
                if (score[i] < min) {
                    min = score[i];
                }
                answer[i] = min;
            }
        }
        return answer;
    }
}