import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int cnt = 0;
            String[] input = br.readLine().split("");
            if(!input[0].equals("(") || !input[input.length-1].equals(")")){
                System.out.println("NO");
            }else{
                for (String s : input) {
                    // "(" 이면 +1, ")"이면 -1
                    cnt+=(s.equals("("))?1 : -1;
                    if(cnt<0) break;
                }
                if(cnt==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}