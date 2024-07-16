import java.io.*;
import java.util.*;

class Graph{
    private int N;
    private LinkedList<Integer>[] graph;
    private boolean[] visited;
    private String dfsStr="";


    Graph(int N){
        this.N = N;
        graph = new LinkedList[N+1];
        visited = new boolean[N+1];
        for(int i=0; i<=N; i++){
            graph[i] = new LinkedList<>();
        }
    }

    void addEdge(int a, int b){
        graph[a].add(b);
        graph[b].add(a);
    }


    void dfs(int node){
        visited[node]=true;
        Collections.sort(graph[node]);
        dfsStr+=(node+" ");
        for (Integer i : graph[node]) {
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    void dfsPrint(){
        System.out.println(dfsStr.trim());
    }

    void bfs(int startNode){
        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = false;
        queue.add(startNode);
        String str="";
        while(!queue.isEmpty()){
            int node= queue.poll();
            Collections.sort(graph[node]);
            str+=(node+" ");
            for (Integer i : graph[node]) {
                if(visited[i]){
                    visited[i]=false;
                    queue.add(i);
                }
            }
        }
        System.out.println(str.trim());
    }

}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]), V = Integer.parseInt(input[2]);
        Graph graph = new Graph(N);

        for(int i=0; i<M; i++){
            String[] inputNode = br.readLine().split(" ");
            int a = Integer.parseInt(inputNode[0]);
            int b = Integer.parseInt(inputNode[1]);
            graph.addEdge(a, b);
        }
        graph.dfs(V);
        graph.dfsPrint();
        graph.bfs(V);
    }
}
