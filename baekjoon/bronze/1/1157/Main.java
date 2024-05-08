import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		String[] alpha= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int[] alphabet=new int[26];
		
		for(int i=0; i<s.length(); i++) {
			// 97 : 소문자 a의 아스키코드 값
			alphabet[(s.charAt(i)-97)]++;
		}
		int max=0;
		for(int i:alphabet) {
			max=(i>max)?i:max;
		}
		int cnt=0, index=0;
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i]==max) {
				cnt++;
				index=i; // max일 때의 index 값
				if(cnt>1) break;
			}
		}
        System.out.println((cnt==1)?alpha[index]:"?");
    }
}