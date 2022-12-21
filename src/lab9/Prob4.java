package lab9;

import java.util.stream.Stream;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Prob4 {

    public static void printSquares(int num) {
        Stream.iterate(1, n -> (int) pow(sqrt(n) + 1, 2))
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 4");

        System.out.println("\nCalling printSquares with value 4:");
        printSquares(4);

        System.out.println("\nCalling printSquares with value 5:");
        printSquares(5);
    }
}
