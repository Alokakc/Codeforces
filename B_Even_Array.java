import java.util.Scanner;

public class B_Even_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            int[] nums = new int[n];
            for(int i=0; i<n; i++) {
                nums[i] = input.nextInt();
            }
            int oddIndexProblem = 0;
            int evenIndexProblem = 0;
            for(int i=0; i<n; i++) {
                if(i%2 == 0 && nums[i]%2 != 0) evenIndexProblem++;
                if(i%2 == 1 && nums[i]%2 != 1) oddIndexProblem++;
            }
            if(evenIndexProblem == oddIndexProblem) System.out.println(evenIndexProblem);
            else System.out.println(-1);
        }
    }
}