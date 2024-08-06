import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] personality = {"R", "T", "C", "F", "J", "M", "A", "N"};
        for (String s : personality) {
            map.put(s, 0);
        }
        for(int i=0; i<choices.length; i++){
            if(choices[i] >= 4){
                map.put(String.valueOf(survey[i].charAt(1)), (map.get(String.valueOf(survey[i].charAt(1)))+choices[i]-4));
            }else{
                map.put(String.valueOf(survey[i].charAt(0)), (map.get(String.valueOf(survey[i].charAt(0)))+4-choices[i]));
            }
        }
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<personality.length; i=i+2){
            answer.append((map.get(personality[i])>=map.get(personality[i+1])?personality[i]:personality[i+1]));
        }
        return answer.toString();
    }
}