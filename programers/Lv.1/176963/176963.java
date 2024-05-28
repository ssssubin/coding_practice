import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // name과 yearning을 {key:value} 형식으로 서로 매치시키고
        // photo 값이 name에 있다면 해당 yearning 값을 가져와 더하고
        // 없다면 0을 더함

        int[] result = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                result[i] += (map.containsKey(photo[i][j]) ? map.get(photo[i][j]) : 0);
            }
        }
        return result;
    }
}