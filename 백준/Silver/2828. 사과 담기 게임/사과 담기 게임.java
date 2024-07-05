import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine()), location = 1, distance = 0;
        int[] apple = new int[j];
        for(int i=0; i<j; i++){
            apple[i] = Integer.parseInt(br.readLine());
        }

        if(apple[0]>M){
            distance = (apple[0]-M);
            location = distance+1;
        }

        for (int i=1; i<j; i++){
            int[] basket = {location, location+(M-1)};

            if(!(basket[0] <= apple[i] && apple[i]<=basket[1])){
                if(apple[i]>basket[1]){
                    distance+=apple[i]-basket[1];
                    location += (apple[i]-basket[1]);
                    location=(location>=N)?N:location;
                }
                else if(apple[i]<basket[0]){
                    distance+=(basket[0]-apple[i]);
                    location=apple[i];
                    location=(location<=1)?1:location;
                }
            }
        }
        System.out.println(distance);
    }
}