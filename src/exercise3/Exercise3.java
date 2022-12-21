package exercise3;

import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("PART # 1 --- Print all odd numbers (infinite)");
//        Stream.iterate(1, n-> n+2)
//                .forEach(System.out::println);

        System.out.println("PART # 2 --- Print 9, 11, 13, 15 in console");
        Stream.iterate(1, n -> n + 2)
                .skip(4)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("PART # 3 --- Print odd numbers limit first 5 and skip 2");
        Stream.iterate(1, n -> n + 2)
                .limit(5)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("PART # 4 --- Convert the characters into a string using lambda");
        char[] ch = {'b', 'h', 'a', 'g', 'i', 'a'};
        Function<char[], String> producer1 = (c) -> new String(c);
        System.out.println(producer1.apply(ch));

        System.out.println("PART # 5 --- Convert the characters into a string using method reference");
        Function<char[], String> producer2 = String::new;
        System.out.println(producer2.apply(ch));

    }
}
