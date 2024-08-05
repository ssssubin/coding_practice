import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int[][] apple = new int[score.length/m][m];
        Arrays.sort(score);
        for(int i=0; i<apple.length; i++){
            for(int j=0; j<m; j++){
                apple[i][j] = score[score.length-(i*m)-j-1];
            }
        }
        int answer=0;
        for(int i=0; i<apple.length; i++){
            answer+=(apple[i][m-1]*m);
        }
        return answer;
    }
}