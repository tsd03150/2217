import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, arr[i] * (n-i));
        }

        System.out.println(answer);
    }
}
