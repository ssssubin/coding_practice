import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cnt=0;

        if(N%5==0){
            cnt+=N/5;
        }else {
            for (int i = N / 5; i >= 0; i--) {
                int n = N - (5 * i);
                if (n % 2 == 0) {
                    cnt += (i + n / 2);
                    break;
                }
            }
        }
        System.out.println((cnt==0)?-1:cnt);
    }
}
