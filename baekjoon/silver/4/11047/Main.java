import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int[] a = new int[N];
		int answer=0;

		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		
		// 큰 숫자랑 먼저 비교
		for(int i=N-1; i>=0; i--) {
			if(a[i]<=K) {
				answer+=K/a[i];
				K%=a[i];
			}
			if(K==0) break;
		}
		System.out.print(answer);
	}
}