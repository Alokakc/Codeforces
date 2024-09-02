import java.util.Scanner;
public class A_Park_Lighting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int numberOflights = (n/2)*m;
            if(n%2!=0) {
                if(m%2==0) {
                    numberOflights += m/2;
                }
                else {
                    numberOflights += m/2 +  1;
                }
            }
            System.out.println(numberOflights);
        }
    }
}