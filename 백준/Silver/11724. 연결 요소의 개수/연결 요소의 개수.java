import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[][] visited;
    static int N, M;
    static void dfs(int x, int y){
        visited[x][y]= true;
        for(int i=1; i<=N; i++){
            if(graph[y][i]==true && visited[y][i]==false){
                dfs(y, i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] input = new int[M][2];
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1][N+1];
        int[] node= new int[N];
        for(int i=0; i<N; i++){
            node[i]=i+1;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
            node[input[i][0]-1] =0;
            node[input[i][1]-1] = 0;
            graph[input[i][0]][input[i][1]] = true;
            graph[input[i][1]][input[i][0]]=true;
        }
        int answer = 0;

        for(int i=0; i<M; i++){
            if(visited[input[i][0]][input[i][1]]==false){
                dfs(input[i][0], input[i][1]);
                answer++;
            }
        }
        for (int i : node) {
            if(i != 0) answer++;
        }
        System.out.println(answer);
    }
}