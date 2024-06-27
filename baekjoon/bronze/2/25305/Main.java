import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        int i=0;
        while(st.hasMoreTokens()){
            score[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(score);
        System.out.println(score[score.length-k]);

    }
}
