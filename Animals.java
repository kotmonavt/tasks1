import java.util.Scanner;

public class Animals {
    public static void main (String[] args) {
        int chickensLegs = 2;
        int cowsLegs = 4;
        int pigsLegs = 4;
        Scanner in = new Scanner(System.in);
        int chicken = in.nextInt();
        int cows = in.nextInt();
        int pigs = in.nextInt();
        System.out.printf("Total number of legs: %d", chicken*chickensLegs + cows*cowsLegs + pigs*pigsLegs);
        in.close();
    }
}