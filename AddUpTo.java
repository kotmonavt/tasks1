import java.util.Scanner;

public class AddUpTo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int namber = in.nextInt();
        System.out.println(summUpTo(namber));
        in.close();
    }
    public static int summUpTo(int n) {
        int summ = 0;
        for (int i = 0; i <= n; i++) {
            summ += i;
        }
        return summ;
    }
}