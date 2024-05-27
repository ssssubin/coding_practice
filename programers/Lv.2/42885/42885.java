import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        // 투포인터 알고리즘 사용
        // 배열 오름차순 정렬하여 몸무게 적은 순서대로
        // 제일 적게 나가는 몸무게와 제일 많이 나가는 몸무게 더해서 limit보다 크면
        // 몸무게 많이 나가는 사람만 보냄
        // 그렇지 않다면 둘 다 보냄
        int answer = 0, min=0, max=people.length-1;
        Arrays.sort(people);
       while(min<max) {
            if (people[min] + people[max] <= limit) {
                min+=1;
                max-=1;
                answer += 1;
            } else {
                max-=1;
                answer += 1;
            }
        }
        if(min==max) answer++; // 1명만 남았다는 의미이기 때문에 1 더해줌
        return answer;
    }
}