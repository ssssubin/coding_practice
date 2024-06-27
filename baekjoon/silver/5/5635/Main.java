import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class People {

    String name;
    int birth;

    People(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<People> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            // 월과 일은 2자리로 자릿수 채움
            inputArr[1] = String.format("%02d", Integer.parseInt(inputArr[1]));
            inputArr[2] = String.format("%02d", Integer.parseInt(inputArr[2]));
            // people class의 생성자를 통해 학생 정보 생성 후 ArrayList에 추가
            people.add(new People(inputArr[0], Integer.parseInt(inputArr[3] + inputArr[2] + inputArr[1])));
        }
        // 나이가 적은 순으로 정렬
        Collections.sort(people, (birth1, birth2) -> birth2.birth - birth1.birth);

        System.out.println(people.get(0).name);
        System.out.println(people.get(people.size() - 1).name);
    }
}