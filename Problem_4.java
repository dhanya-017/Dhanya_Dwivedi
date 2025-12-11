import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String line = sc.nextLine().trim();

        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int d = 1; d <= 9; d++) {
            int count = 0;
            for (int num : arr) {
                if (num % d == 0) {
                    count++;
                }
            }
            result.put(d, count);
        }

        System.out.print("{");
        int index = 1;

        for (int key : result.keySet()) {
            System.out.print(key + ": " + result.get(key));
            if (index < result.size()) {
                System.out.print(", ");
            }
            index++;
        }
        System.out.println("}");
    }
}
