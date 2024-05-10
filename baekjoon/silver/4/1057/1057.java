import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// N: 참가자, num1 : 김지민, num2 : 임한수
        int N= Integer.parseInt(st.nextToken()),num1=Integer.parseInt(st.nextToken()), num2=Integer.parseInt(st.nextToken());
		// cnt: 라운드
        int cnt=0;
		while(N>1) {
            // 지민이가 한수보다 번호가 작을 때
			if(num1<num2) {
                // 한수가 짝수이고 한수 번호 -1이 지민이 번호와 동일할 경우 반복문 빠져나감
				if(num2%2==0 && (num2-1)==num1) {
					cnt++;
					break;
				}
			}
            // 지민이가 한수보다 번호가 클 때
			else {
                // 위의 조건문과 동일
				if(num1%2==0 && (num1-1)==num2) {
					cnt++;
					break;
				}
			}
			cnt++;
            // 참가자가 홀수명이면 마지막 번호 참가자는 자동으로 다음 라운드로 진출하기 때문에 2로 나눈 후 1 더해줌
			N=(N%2==0)?N/2:N/2+1;
            // 라운드를 진출할 때마다 번호를 부여 받을 때 이전 라운드의 번호 / 2 한 후 올림 했을 경우와 같음
			num1=(int)(Math.ceil(num1/2.0));
            num2=(int)(Math.ceil(num2/2.0));
		}
        // 라운드가 0이면 지민이와 한수가 대결을 안 한 것이기 때문에 -1 출력
        // 라운드가 0이 아니면 지민이와 한수가 대결을 한 번이라도 한 것이기 때문에 해당 cnt 값을 출력
		System.out.println((cnt!=0)?cnt:-1);
		
	}

}