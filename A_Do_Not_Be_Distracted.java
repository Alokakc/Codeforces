import java.util.HashSet;
import java.util.Scanner;

public class A_Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            String s = input.next();
            HashSet<Character> set = new HashSet<>();
            boolean flag = false;
            for(int i=1; i<n; i++) {
                if(s.charAt(i-1) != s.charAt(i)) {
                    if(set.contains(s.charAt(i))) {
                        flag = true;
                        break;
                    }
                    set.add(s.charAt(i-1));
                }
            }
            if(flag) {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}