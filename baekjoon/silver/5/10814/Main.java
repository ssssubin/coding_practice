import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<User> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = (br.readLine()).split(" ");
            list.add(new User(Integer.parseInt(input[0]), input[1]));
        }
        Collections.sort(list, (age1, age2) -> age1.age - age2.age);
        for (User user : list) {
            System.out.println(user.age + " " + user.name);
        }
    }
}