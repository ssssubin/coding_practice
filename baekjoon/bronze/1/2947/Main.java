import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] piece = new int[5];
        int i = 0;
        while (st.hasMoreTokens()) {
            piece[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        // 버블 정렬 알고리즘 사용
        // 1. 인접한 원소 2개를 쌍으로 지어 앞에 위치한 원소가 뒤의 원소보다 크다면 서로 교환
        // 2. 1회전 끝내게 되면 배열 내의 가장 큰 원소가 가장 마지막에 배치됨 (뒤에서부터 정렬 완료됨)
        // 3. 정렬되지 않은 원소가 1개가 될 때까지 1~2번의 과정 반복
        for (int j = 0; j < 4; j++) {
            for (int k = 1; k < 5 - j; k++) {
                if (piece[k - 1] > piece[k]) {
                    swap(piece, k - 1, k);
                    // 인접한 2개의 원소의 교환이 일어나는 경우 나무조각 순서 출력
                    for (int x = 0; x < 5; x++) {
                        if (x == 4) {
                            System.out.print(piece[x]);
                        } else {
                            System.out.print(piece[x] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }

    }

    // 2개의 원소 서로 교환
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}