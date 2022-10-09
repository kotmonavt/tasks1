import java.util.Scanner;

public class NextEdge {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int firstSide = in.nextInt();
        int secondSide = in.nextInt();
        System.out.println(firstSide + secondSide - 1);
        in.close();
    }
}