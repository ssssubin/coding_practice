import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), sCnt=0, lCnt=0;
        String input = br.readLine();

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='S'){
                sCnt++;
            }else{
                lCnt++;
            }
        }
        int cupHolder = sCnt+(lCnt/2)+1;
        System.out.println((cupHolder>=N)?N:cupHolder);
    }
}