import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        // 명령어와 데이터 담는 배열
       String[] oper=new String[2];
       // 데이터 담는 리스트
		ArrayList<Integer> list=new ArrayList<>();
		int[] answer= new int[2];
		for(int i=0; i<operations.length; i++) {
			oper=operations[i].split(" ");
			if(oper[0].equals("I")) {
				list.add(Integer.parseInt(oper[1]));
				
			}else {
                // list 오름차순 정렬
				list.sort(Comparator.naturalOrder());
                // list가 비어있지 않을 때
				if(list.size()!=0) {
					if(oper[1].equals("-1")) list.remove(0);
					else list.remove(list.size()-1);
				}
				
			}
		}
        if(list.size()==0) return answer;
        else {
            list.sort(Comparator.naturalOrder());
            answer[0]=list.get(list.size()-1);
            answer[1]=list.get(0);
            return answer;
        }
    }
}