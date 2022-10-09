import java.util.Scanner;

public class Ctoa {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String symbol = in.next();
        int ascii = (int) symbol.charAt(0);
        System.out.println(ascii);
        in.close();
    }
}
