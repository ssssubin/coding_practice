import java.util.ArrayList;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> list= new ArrayList<>();
		StringBuffer[] barr1=new StringBuffer[n], barr2=new StringBuffer[n];

		for(int i=0; i<n; i++) {
            // 2진수로 변환한 문자열을 StringBuffer로 변환
			barr1[i]=new StringBuffer(Integer.toBinaryString(arr1[i]));
			barr2[i]=new StringBuffer(Integer.toBinaryString(arr2[i]));

			// 2진수로 변환한 문자열의 길이가 n이 아니면 부족한만큼 "0"을 맨 앞에 추가
            if(barr1[i].length()!=n) {
				barr1[i].insert(0, "0".repeat(n-barr1[i].length()));
			}
			if(barr2[i].length()!=n) {
				barr2[i].insert(0, "0".repeat(n-barr2[i].length()));
			}
			//str은 각 행의 #과 공백 담는 문자열
			String str ="";
			for(int j=0; j<n; j++) {
                String a1=barr1[i].substring(j, j+1);
				String a2=barr2[i].substring(j, j+1);
                // 자른 문자열 a1, a2가 둘 다 0이면 공백을 하나라도 0이 아니면 "#"을 더해줌
				str+=(a1.equals("0")&&a2.equals("0"))?" ":"#";
			}
			list.add(str);
		}
        // ArrayList를 String 배열로 변환
        return list.toArray(new String[list.size()]);
    }
}