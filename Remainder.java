import java.util.Scanner;

public class Remainder {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int divisible = in.nextInt();
        int divider = in.nextInt();
        System.out.printf("Division result %d by %d: %d", divisible, divider, divisible % divider);
        in.close();
    }
}
