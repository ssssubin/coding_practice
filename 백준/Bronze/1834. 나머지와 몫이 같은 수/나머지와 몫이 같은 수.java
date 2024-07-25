import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine()), answer=0;
        for(long i=0; i<N; i++){
            answer+=(N*i+i);
        }
        System.out.println(answer);
    }
}