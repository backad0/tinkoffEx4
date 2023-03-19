import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String aa = in.nextLine();
        String input = in.nextLine();
        String[] arr = input.split(" ");
        Map<String, Integer> amountMap = new HashMap<>();
        Map<Integer, String> positionMap = new HashMap<>();
        for (int i = 0; i<size; i++){
            if (!amountMap.containsKey(arr[i])){
                amountMap.put(arr[i], 1);
            } else {
                amountMap.put(arr[i], amountMap.get(arr[i])+1);
            }
        }
        for (int i = 0; i< size ; i++){
            positionMap.put(i, arr[i]);
        }
        for (int i = 0; i<size; i++){

        }


    }
}
