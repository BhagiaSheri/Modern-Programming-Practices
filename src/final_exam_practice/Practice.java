package final_exam_practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        Stream<Integer> stream2 =
                Stream.iterate(1, n -> n + 1);
        stream2.collect(Collectors.toList()).forEach(System.out::println);
    }
}
