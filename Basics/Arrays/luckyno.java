import java.util.*;

public class luckyno {

    public Integer[] numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        Integer[] number = new Integer[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        return number;
    }

    public int[] lucky(Integer[] number) {
        // Convert array to a mutable list
        List<Integer> num = new ArrayList<>(Arrays.asList(number));

        while (num.size() > 6) {
            for (int i = 0; i < num.size(); i++) {
                if (i % 2 == 0) {
                    num.remove(i);
                }
            }

            if (num.size() > 6) {
                for (int i = 0; i < num.size(); i++) {
                    if (i % 2 != 0) {
                        num.remove(i);
                    }
                }
            }
        }

        // Convert the final list back to an int[]
        return num.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        luckyno no = new luckyno();
        Integer[] num = no.numbers();
        int[] ans = no.lucky(num);

        System.out.println("Lucky numbers: " + Arrays.toString(ans));
    }
}
