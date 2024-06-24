import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9], falseDwarf = new int[2];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dwarf[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : dwarf) {
            sum += i;
        }
        loop: for (int i = 0; i < dwarf.length - 1; i++) {
            for (int j = i; j < dwarf.length; j++) {
                if (dwarf[i] != dwarf[j] && sum - 100 == dwarf[i] + dwarf[j]) {
                    falseDwarf[0] = dwarf[i];
                    falseDwarf[1] = dwarf[j];
                    break loop;
                }
            }
        }

        Arrays.sort(dwarf);
        for (int i = 0; i < dwarf.length; i++) {
            if (dwarf[i] == falseDwarf[0] || dwarf[i] == falseDwarf[1]) {
                continue;
            }
            System.out.println(dwarf[i]);
        }

    }
}
