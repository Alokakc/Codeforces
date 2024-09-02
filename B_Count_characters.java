import java.util.TreeMap;
import java.util.Scanner;

public class B_Count_characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}