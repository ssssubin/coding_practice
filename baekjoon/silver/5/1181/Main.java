import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> inputWords = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            inputWords.add(br.readLine());
        }
        // 중복 제거한 후 배열로 변환
        String[] words = inputWords.stream().distinct().toArray(String[]::new);

        for(int i=0; i<words.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<words.length; j++){
                if(words[j].length()<words[minIndex].length()){
                    minIndex =j;
                }else if(words[j].length() ==words[minIndex].length()){
                    minIndex = (words[j].compareTo(words[minIndex])<0) ? j: minIndex;
                }
            }
            swap(words, i,minIndex);
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
    static void swap(String[] arr, int index1, int index2){
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}