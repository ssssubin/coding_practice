import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        // 서로 다른 인덱스에 있는 두 개의 수를 더해야 하기 때문에
        // i는 0부터 마지막 인덱스-1까지
        // j는 i+1부터 마지막 인덱스까지로 설정
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // list 안에 더한 값이 없으면 add 해줌
                if (!list.contains(numbers[i] + numbers[j]))
                    list.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(list);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
