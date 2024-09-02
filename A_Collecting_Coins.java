import java.util.Scanner;

public class A_Collecting_Coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int n = input.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int req = (max-a) + (max-b) + (max-c);
            if(req > n) System.out.println("NO");
            else {
                n -= req;
                if(n%3 == 0) {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}