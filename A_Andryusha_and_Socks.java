import java.util.HashSet;
import java.util.Scanner;

public class A_Andryusha_and_Socks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[2*n];
        for(int i=0; i<2*n; i++) {
            nums[i] = input.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for (int i = 0; i < 2*n; i++) {
            ans = Math.max(ans, set.size());
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
            else set.add(nums[i]);
        }
        System.out.println(ans);
    }
}