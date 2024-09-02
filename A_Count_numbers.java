import java.util.HashMap;
import java.util.Scanner;

public class A_Count_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<q; i++) {
            int z = input.nextInt();
            int x = input.nextInt();
            if(z == 1) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            else {
                if(!map.containsKey(x)) System.out.println(0);
                else System.out.println(map.get(x));
            }
        }
    }
}