import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[computers + 1];

        for (int i = 0; i <= computers; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int cnt = virus(1) - 1;

        System.out.println(cnt);
    }

    static int virus(int computer) {
        visited[computer] = true;
        int cnt = 1;

        for (int neighbor : graph.get(computer)) {
            if (!visited[neighbor]) {
                cnt += virus(neighbor);
            }
        }

        return cnt;
    }
}