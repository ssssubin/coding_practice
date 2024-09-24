import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0, sum = 0;
        HashMap<Integer, Integer> obj = new HashMap<>();
        for(int i : tangerine){
            obj.put(i, obj.getOrDefault(i, 0)+1);
        }
        
        List<Integer> keySet = new ArrayList<>(obj.keySet());
        keySet.sort((a, b)->obj.get(b)-obj.get(a));
        for(Integer integer : keySet){
            answer++;
            sum += obj.get(integer);
            if(sum>=k) break;
        }
        return answer;
    }
}