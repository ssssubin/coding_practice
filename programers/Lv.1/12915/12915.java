import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        char[] chars = new char[strings.length];
        String[] answer = new String[strings.length];
        // 인덱스 n번째 문자가 같을 경우를 대비하여 미리 사전순으로 정렬
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].charAt(n);
        }
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                // 정렬된 문자와 인덱스 n번째 문자가 같다면
                if (chars[i] == strings[j].charAt(n)) {
                    // answer에 해당 문자열 넣음
                    answer[i] = strings[j];
                    // 같은 문자열 넣지 않도록 answer에 들어간 문자열 대문자로 바꿈
                    strings[j] = strings[j].toUpperCase();
                    break;
                }
            }
        }
        return answer;
    }
}