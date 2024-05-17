class Solution {
    public String solution(int[] food) {
        StringBuilder result = new StringBuilder();
        int cnt = 0; // n번째 음식을 넣을 위치

        for (int i = 1; i < food.length; i++) {
            // 음식의 양이 같아야 하기 때문에 2로 나눔
            // 대칭 형태이기 때문에 n번째 음식을 넣을 위치에 음식의 종류를 각 선수가 먹어야 하는 음식 양 *2번 반복해서 문자열 삽입
            result.insert(cnt, Integer.toString(i).repeat((food[i] / 2) * 2));
            cnt += food[i] / 2;
        }
        // 중앙에 물을 배치하기 위한 코드
        result.insert(result.length() / 2, "0");
        return result.toString();
    }
}