import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N;
		N=sc.nextInt();
		ArrayList<Integer> number=new ArrayList<>();
		for(int i=0; i<N; i++) {
			number.add(sc.nextInt());
		}
		// Integer ArrayList -> int 배열로 변환
		int[] a=number.stream().mapToInt(Integer::intValue).toArray();
		// int 배열 오름차순으로 정렬
		Arrays.sort(a);
		int answer=a[0];
		for(int i=1; i<a.length; i++) {
			answer+=a[i];
			for(int j=0; j<i; j++) {
				// i번째 이전 사람들이 인출하는데 걸리는 시간을 다시 더해줌
				answer+=a[j];
			}
		}
		System.out.println(answer);
	}
}