import java.util.Scanner;

public class TriArea {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int height = in.nextInt();
        System.out.printf("The area of a triangle with a base %d and height %d: % d", base, height, base*height / 2);
        in.close();
    }
}