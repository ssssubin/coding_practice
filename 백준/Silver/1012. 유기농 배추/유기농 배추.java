import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[][];
    static boolean graph[][];
    static int[] xArr= {-1, 1, 0, 0}; // 상 하 좌 우 
    static int[] yArr = {0, 0, -1, 1}; // 상 하 좌 우
    static int M, N;
    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
                int newX = x + xArr[i];
                int newY = y + yArr[i];
                if(graph[newX][newY] == true && visited[newX][newY] == false){
                    dfs(newX, newY);
                }
            }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            graph= new boolean[M+2][N+2];
            visited = new boolean[M+2][N+2];
            for(int j = 0; j<K; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x+1][y+1] = true;
            }
            int answer=0;
            for(int j=1; j<=M; j++){
                for(int k=1; k<=N; k++){
                    if(graph[j][k]== true && visited[j][k]==false){
                        dfs(j, k);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
