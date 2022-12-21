package lab8.prob4;

import java.util.Arrays;
import java.util.List;

public class prob4 {

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 4");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

        System.out.println("\n***** PART # A - Using Lambda Expression *****");
        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println("\n***** PART # B - Using Method Reference *****");
        fruits.forEach(System.out::println);
    }
}
