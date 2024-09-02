import java.util.Scanner;

public class A_QAQ {

    public static int QAQ(int i, int prev, String s, int n) {
        if(i==n) return 0;
        if(s.charAt(i)=='Q' && prev!=-1) return 1;
        int take=0, nontake=0;
        nontake = QAQ(i+1, prev, s, n);
        if(s.charAt(i)=='Q') {
            if(prev==-1 || s.charAt(prev)=='A') take = QAQ(i+1, i, s, n);
        }
        else if(s.charAt(i)=='A'){
            if(prev!=-1 && s.charAt(prev)=='Q') take = QAQ(i+1, i, s, n);
        }
        return take+nontake;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = s.length();
        int ans = QAQ(0, -1, s, n);
        System.out.println(ans);
    }
}