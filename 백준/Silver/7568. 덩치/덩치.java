import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] body = new int[N][N];
        int[] cnt = new int[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            body[i][0] = Integer.parseInt(st.nextToken());
            body[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N-1; i++){
            for(int j=i;j<N-1; j++){
                if(body[i][0] > body[j+1][0] && body[i][1]>body[j+1][1]){
                    cnt[j+1]+=1;
                }else if(body[i][0] < body[j+1][0] && body[i][1]<body[j+1][1]){
                    cnt[i]+=1;
                }
            }
        }
        String answer ="";
        for (int i : cnt) {
            answer+=((i+1)+" ");
        }
        System.out.println(answer.trim());
    }
}