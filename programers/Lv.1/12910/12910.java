import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i:arr){
            if(i%divisor==0) list.add(i);
        }
        if(list.size()==0) list.add(-1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
