import java.util.Scanner;

public class B_Lecture_Sleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] theorems = new int[n];
        int[] behaviour = new int[n];
        for (int i = 0; i < n; i++) {
            theorems[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            behaviour[i] = input.nextInt();
        }
        input.close();

        int initialSum = 0;
        for (int i = 0; i < n; i++) {
            if (behaviour[i] == 1) {
                initialSum += theorems[i];
            }
        }

        int maxAdditionalSum = 0;
        int currentAdditionalSum = 0;

        for (int i = 0; i < k; i++) {
            if (behaviour[i] == 0) {
                currentAdditionalSum += theorems[i];
            }
        }
        maxAdditionalSum = currentAdditionalSum;

        for (int i = k; i < n; i++) {
            if (behaviour[i] == 0) {
                currentAdditionalSum += theorems[i];
            }
            if (behaviour[i - k] == 0) {
                currentAdditionalSum -= theorems[i - k];
            }
            maxAdditionalSum = Math.max(maxAdditionalSum, currentAdditionalSum);
        }

        System.out.println(initialSum + maxAdditionalSum);
    }
}
