import java.util.Scanner;

public class A_Array_with_Odd_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            int odd = 0;
            for(int i=0; i<n; i++) {
                int temp = input.nextInt();
                if(temp%2!=0) odd++;
            }
            if((n-odd>=1 && odd > 0) || (n-odd==0 && odd%2!=0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}