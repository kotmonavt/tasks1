import java.util.Scanner;

public class Operation {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(action(N, a, b));
        in.close();
    }
    public static String action (int N, int a, int b) {
        if (a + b == N) {
            return "added";
        } else if (a - b == N) {
            return "subtracted";
        } else if (a*b == N) {
            return "multiply";
        } else if (a / b == N) {
            return "divide";
        } else {
            return "none";
        }
    }
}
