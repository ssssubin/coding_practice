import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		int a, b; 
		int[] c = new int[M]; // 6줄 패키지 가격
		int[] d= new int[M]; // 1줄 가격
		for(int i=0; i<M; i++) {
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
        // 가장 작은 값 추출하기 위해 sort 사용
		Arrays.sort(c);
		Arrays.sort(d);
        
        // a: 6줄 패키지만 샀을 때와 낱개로 샀을 때의 가격 중 작은 값
		a=Math.min((N/6+1)*c[0], d[0]*N);

        // b: a값과 6줄 패키지 + 낱개로 구매했을 때의 가격 중 작은 값
		b=Math.min(a, (N/6*c[0])+(N%6)*d[0]);
		System.out.print(b);
    }
}