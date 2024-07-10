import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        long[] fn = new long[n+1];
        fn[1]=1;
        for(int i=2; i<=n; i++){
            fn[i]=fn[i-2]+fn[i-1];
        }
        System.out.println(fn[n]);
    }
}
