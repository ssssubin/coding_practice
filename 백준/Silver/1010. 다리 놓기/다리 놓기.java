import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String str = br.readLine();
            int[] input = new int[2];
            input[0] = Integer.parseInt(str.split(" ")[0]);
            input[1] = Integer.parseInt(str.split(" ")[1]);

            if(input[0]==input[1]){
                System.out.println(1);
            }
            else if(input[0]==1 && input[0]!=input[1]){
                System.out.println(input[1]);
            }
            else{
                double nume =1, deno =1;
                for(int j=1; j<=input[0]; j++){
                    nume *= input[1];
                    input[1]--;
                    deno *= j;
                }
                System.out.println(Math.round(nume/deno));
            }
        }
    }
}