import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfCubes {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbers = in.nextLine().split(" ");
        Integer[] numbersInt = Stream.of(numbers).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        int summOfCubes = 0;
        for (int i = 0; i < numbers.length; i++) {
            summOfCubes += Math.pow(numbersInt[i], 3);
        }
        System.out.println(summOfCubes);
        in.close();
    }
}