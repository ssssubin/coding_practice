import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] pre = new int[n], cur = new int[n];;
            int cnt=0;
            for (int j = 0; j < n; j++) {
                pre[j] = j + 1;
                cnt+=pre[j];
                cur[j]=cnt;
            }

            for(int K=1; K<k;K++){
                cnt=0;
                for(int j=0; j<n; j++){
                    pre[j]=cur[j];
                    cnt+=pre[j];
                    cur[j]=cnt;
                }
            }
            System.out.println(cur[n-1]);
        }
    }
}
