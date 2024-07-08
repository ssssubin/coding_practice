import java.io.*;
import java.util.*;
public class Main  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int[] A = new int[N], B = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                A[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j= 0; j<M; j++){
                B[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(B);
            int count=0;
            for (int i1 : A) {
                count+=(counting(B,i1));
            }
            System.out.println(count);
        }
    }
    static int counting(int[] arr, int value){
        int start = 0, end=arr.length, cnt=0;
        while(start<end){
            if(arr[start]<value){
                cnt++;
                start++;
            }
            else{
                start=end;
            }
        }
        return cnt;
    }
}