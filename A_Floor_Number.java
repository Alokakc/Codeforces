import java.util.Scanner;

public class A_Floor_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            int x = input.nextInt();
            if(n <= 2) System.out.println(1);
            else {
                n -= 2;
                int ans = n/x+1;
                if(n%x != 0) ans++;
                System.out.println(ans);
            }
        }
    }
}