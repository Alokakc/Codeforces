import java.util.Scanner;

public class B_Pipeline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        long ans = 0;
        if(k>=n) {
            System.out.println(1);
        }
        else {
            for(long i=k; i>=2; i--) {
                if(n==0) break;
                ans += 1;
                n -= k-1;
            }
            if(n==0) System.out.println(ans);
            else System.out.println(-1);
        }
    }
}