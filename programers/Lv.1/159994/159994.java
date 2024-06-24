class Solution {
    // goal 값을 순서대로 cards1과 cards2의 값과 비교해서 일치하는 경우가 하나라도 있으면
    // 해당 card 값의 index +1 없으면 그대로 반복문 나옴
    // 마지막에 cards1과 cards2의 인덱스 값 더한 후 goal 배열의 길이와 일치하면 Yes를 불일치하면 No 반환
    // -> index 값은 0부터 시작하기 때문에 위의 방식대로 하면 index 값이 초과했다는 오류가 발생
    // => index가 cards1 or cards2의 길이와 같아지면 -1해주고, 대신 cnt 값 추가하여 오류 해결
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0, index2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1[index1])) {
                index1++;
                cnt1++;
                if (index1 == cards1.length)
                    index1 = cards1.length - 1;

            } else if (goal[i].equals(cards2[index2])) {
                index2++;
                cnt2++;
                if (index2 == cards2.length)
                    index2 = cards2.length - 1;

            } else
                break;
        }
        return (cnt1 + cnt2 == goal.length) ? "Yes" : "No";
    }
}