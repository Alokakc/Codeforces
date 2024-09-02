import java.util.Scanner;

public class A_LCM_Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int l = input.nextInt();
            int r = input.nextInt();
            if(r%l == 0) System.out.println(l+" "+r);
            else if(l*2 <= r) System.out.println(l+" "+l*2);
            else System.out.println("-1 -1");
        }
    }
}