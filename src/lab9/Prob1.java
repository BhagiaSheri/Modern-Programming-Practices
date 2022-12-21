package lab9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob1 {
    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 1");
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
