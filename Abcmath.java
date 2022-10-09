import java.util.Scanner;

public class Abcmath {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(summAB(a, b, c));
        in.close();
    }
    public static boolean summAB (int a, int b, int c) {
        int summ = a;
        for (int i = 1; i <= b; i++) {
            summ += summ;
        }
        if (summ % c == 0) {
            return true;
        } else {
            return false;
        }
    }
}