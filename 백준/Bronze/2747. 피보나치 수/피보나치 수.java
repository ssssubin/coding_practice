import java.io.*;

public class Main {
    static int[] answer = new int[46];
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        answer[1] = 1;
        answer[2] = 1;
        for(int i=3; i<=45; i++){
            answer[i] = answer[i-1]+answer[i-2];
        }
        System.out.println(answer[n]);
    }
}