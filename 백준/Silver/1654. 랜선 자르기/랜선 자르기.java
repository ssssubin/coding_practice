import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        long[] wire = new long[K];
        for(int i=0; i<K; i++){
            wire[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(wire);
        System.out.println(findMaxWire(wire, N));
    }
    static long findMaxWire(long[] arr, int N){
        long start =0, end = arr[arr.length-1];
        while(start <= end){
            long mid = (start+end)/2, maxWire=0;
            for (long i : arr) {
                if(mid == 0){
                    maxWire+=i;
                }else{
                    maxWire += (i / mid);
                }
            }
            if(maxWire<N){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}