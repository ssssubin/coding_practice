import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine()), change = 1000 - price, cnt = 0;

        cnt += change / 500;
        change %= 500;

        cnt += change / 100;
        change %= 100;

        cnt += change / 50;
        change %= 50;

        cnt += change / 10;
        change %= 10;

        cnt += change / 5;
        change %= 5;

        cnt += change / 1;

        System.out.println(cnt);
    }
}