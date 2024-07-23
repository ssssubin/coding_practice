import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] card = new int[N];
        for(int i=0; i<N; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] sang = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            sang[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);
        for(int i=0; i<M; i++){
            sb.append(max(card, sang[i])-min(card, sang[i]));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    
    static int min(int[] arr, int value){
        int start =0, end = arr.length;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] < value){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    static int max(int[] arr, int value){
        int start = 0, end = arr.length;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]<=value){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
