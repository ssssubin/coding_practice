import java.util.*;
class Solution {
    public String solution(int a, int b) {
        HashMap<Integer, Integer> calendar = new HashMap<>();
        HashMap<Integer, String> day = new HashMap<>();
        calendar.put(1, 31);
        calendar.put(2, 29);
        for(int i=3; i<=12; i++){
            if(i<=7){
                if(i%2!=0)calendar.put(i, 31);
                else calendar.put(i, 30);
            }else{
                if(i%2!=0) calendar.put(i, 30);
                else calendar.put(i, 31);
            }
        }
        day.put(0, "THU");
        day.put(1, "FRI");
        day.put(2, "SAT");
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");
        int date = 0;
        for(int i=1; i<a; i++){
            date+=calendar.get(i);
        }
        date+=b;
        return day.get(date%7);
    }
}