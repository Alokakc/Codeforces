import java.util.HashMap;
import java.util.Scanner;

public class B_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            int c = s1.charAt(i);
            if((c>=97 && c<=122) || (c>=65 && c<=90)) {
                map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            }
        }
        boolean flag = false;
        for(int i=0; i<s2.length(); i++) {
            char c = s2.charAt(i);
            if(c != ' ') {
                if(map.containsKey(c) && map.get(c)>0) {
                    map.put(c, map.get(c)-1);
                }
                else {
                    flag = true;
                    break;
                }
            }
        }
        if(flag) System.out.println("NO");
        else System.out.println("YES");
    }
}