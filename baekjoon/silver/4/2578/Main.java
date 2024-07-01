import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] input = new int[5][5]; // 철수가 빙고판에 적은 수
        int[][] number = new int[5][5]; // 사회자가 부르는 수

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                number[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        loop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int x = 0; x < 5; x++) {
                        // 사회자가 부른 수와 빙고판의 수가 일치했을 경우
                        if (input[k][x] == number[i][j]) {
                            input[k][x] = 0;

                        }
                    }
                }
                rowCheck(input);
                columnCheck(input);
                crossCheck(input);
                // 빙고가 3개 이상 되는 경우
                if (cnt >= 3) {
                    System.out.println(i * 5 + (j + 1));
                    break loop;
                }
                // 빙고가 3개 미만이면 카운트 초기화
                cnt = 0;
            }

        }
    }

    // 한 행이 빙고가 됐는지 확인하는 함수
    static void rowCheck(int[][] arr) {
        int[] zero = { 0, 0, 0, 0, 0 };
        for (int i = 0; i < 5; i++) {
            if (Arrays.equals(arr[i], zero)) {
                cnt++;
                if (cnt == 3) {
                    return;
                }

            }
        }
    }

    // 한 열이 빙고가 됐는지 확인하는 함수
    static void columnCheck(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) {
                    count++;
                }
            }
            if (count == 5) {
                cnt++;
                if (cnt == 3) {
                    return;
                }

            }
        }
    }

    // 대각선이 빙고가 됐는지 확인하는 함수
    static void crossCheck(int[][] arr) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][i] == 0) {
                count++;
            }
        }
        if (count == 5) {
            cnt++;
            if (cnt == 3) {
                return;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i][4 - i] == 0) {
                count1++;
            }
        }
        if (count1 == 5) {
            cnt++;
        }

    }
}
