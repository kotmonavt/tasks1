import java.util.Scanner;

public class ProfitableGamble {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double prob = in.nextDouble();
        int prize = in.nextInt();
        int pay = in.nextInt();
        System.out.println(compraison(prob, prize, pay));
        in.close();
    }
    public static boolean compraison (double prob, int prize, int pay) {
        if (prob*prize > pay) {
            return true;
        }
        return false;
    }
}