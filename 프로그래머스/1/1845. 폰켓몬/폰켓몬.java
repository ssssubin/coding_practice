import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int[] number = Arrays.stream(nums).distinct().toArray();
        int mon = nums.length/2;
        if(number.length >= mon){
            return mon;
        }else{
            return number.length;
        }
    }
}