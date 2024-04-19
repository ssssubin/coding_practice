import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] a = new int[N], b=new int[N];
		int answer=0;
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			b[i]=sc.nextInt();
		}
        
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0; i<N; i++) {
			answer+=(a[i]*b[N-1-i]);
		}
		System.out.println(answer);
    }
}