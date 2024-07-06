import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        int M = Integer.parseInt(br.readLine());
        int[] m = new int[M];
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            m[i]= Integer.parseInt(st.nextToken());
        }

        for (int i : m) {
            System.out.println(Arrays.binarySearch(input, i) >= 0 ? 1 : 0);
        }
    }
}