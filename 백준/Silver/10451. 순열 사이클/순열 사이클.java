import java.io.*;
import java.util.*;

public class Main {
    static int[] graph;
    static boolean[] visited;

    public static void dfs(int index){
        visited[index] = true;
        if(visited[graph[index]] == false){
            dfs(graph[index]);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t< T; t++){
            int N = Integer.parseInt(br.readLine());
            int[] input = new int[N];
            StringTokenizer st= new StringTokenizer(br.readLine());
            graph = new int[N+1];
            visited = new boolean[N+1];

            for(int i=0; i<N; i++){
                input[i] = Integer.parseInt(st.nextToken());
                graph[i+1] = input[i];
            }

            int answer = 0;
            for (int i : input) {
                if(visited[i] == false){
                    dfs(i);
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
