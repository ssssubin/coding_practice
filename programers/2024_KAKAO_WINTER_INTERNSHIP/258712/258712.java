class Solution {
    public int solution(String[] friends, String[] gifts) {
        // 선물 기록 나눠담는 배열
        String[] b=new String[2];
        // 선물 주고 받는 배열
		int [][]presentTable = new int[friends.length][friends.length];
		// 선물 지수 배열
        int [][]presentNum=new int[friends.length][3];
        // 다음달에 받는 선물 배열
        int[] nextPresent = new int[friends.length];
		
		// 선물 주고 받은 2차원 배열
		for(int i=0; i<gifts.length; i++) {
			b=gifts[i].split(" "); // b[0]: 선물 준 사람, b[1]: 선물 받은 사람
			for(int j=0; j<friends.length; j++) {
				for(int k=0; k<friends.length; k++) {
                    // 선물 준 사람이 friends[j]이면서 선물 받은 사람이 friends[k]일 때,
                    // 선물 주고 받는 배열 [j][k]값 +1
					if(b[0].equals(friends[j])&&b[1].equals(friends[k])) {
						presentTable[j][k]+=1;
					}
				}
			}
		}
		// 선물 지수 배열
		for(int i=0; i<presentTable.length; i++) {
			for(int j=0; j<presentTable.length; j++) {
                // 선물 주고 받은 배열의 각 column이 타인에게 준 선물의 개수
				presentNum[i][0]+=presentTable[i][j];
                // 선물 주고 받은 배열을 90도 회전하면 타인에게 받은 선물의 개수
				presentNum[i][1]+=presentTable[presentTable.length-1-j][i];
			}
            // 선물 지수 계산
			presentNum[i][2]=presentNum[i][0]+presentNum[i][1]*(-1);
		}
		// 다음달에 받는 선물 배열 만드는 코드
		for(int i=0; i<friends.length; i++) {
			for(int j=0; j<friends.length; j++) {
                // i와 j가 동일하면 본인이기 때문에 pass
				if(i!=j) {
                    // 타인에게 준 선물 개수가 해당 인물에게 받은 개수보다 클 때
					if(presentTable[i][j]>presentTable[j][i]) {
						nextPresent[i]++;
					}
                    // 타인에게 준 선물 개수가 해당 인물에게 받은 개수와 동일할 때
					else if(presentTable[i][j]==presentTable[j][i]) {
                        // 본인 선물 지수가 타인의 선물 지수보다 클 때
						if(presentNum[i][2]>presentNum[j][2]) {
							nextPresent[i]++;
						}
					}
				}
				
			}
		}
        // 가장 선물을 많이 받은 사람의 선물 개수
		int maxPresent=nextPresent[0];
		for(int i=0; i<friends.length; i++) {
			if(maxPresent<nextPresent[i]) maxPresent=nextPresent[i];
		}
        return maxPresent;
    }
}