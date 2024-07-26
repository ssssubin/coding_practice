import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10001];
        int i=1;
        for(int j=0; j<=10000; j++){
            numbers[j]=j;
        }
        while(true){
            ArrayList<Integer> num = new ArrayList<>();
            num.add(i);
            if(i<10){
                num.add(i);
            }
            else if(i>=10 && i<100){
                num.add(i/10);
                num.add(i%10);
            }else if(i>=100 && i<1000){
                num.add(i/100);
                num.add((i%100)/10);
                num.add((i%100)%10);
            }else if(i >= 1000 && i<10000){
                num.add(i/1000);
                num.add((i%1000)/100);
                num.add(((i%1000)%100)/10);
                num.add(((i%1000)%100)%10);
            }
            int result = 0;
            for (Integer integer : num) {
                result+=integer;
            }
            if(i>10000){
                break;
            }
            if(result <= 10000 && numbers[result] == result){
                numbers[result]=0;
            }
            i++;
        }
        for (Integer number : numbers) {
            if(number!=0){
                System.out.println(number);
            }
        }
    }
}
