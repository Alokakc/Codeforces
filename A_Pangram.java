import java.util.HashSet;
import java.util.Scanner;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);
            if (c<=65 && c>=90) {
                set.add(s.charAt(i));
            }
            else set.add(Character.toLowerCase(s.charAt(i)));
        }
        if (set.size() != 26) {
            System.out.println("NO");
        } else
            System.out.println("YES");
    }
}