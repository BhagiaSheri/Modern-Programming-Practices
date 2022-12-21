package lab9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Prob5 {

    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        // Implement the code
        return stream.limit(n + 1).skip(m);
    }

    public static void main(String[] args) {
        // Make three calls for the streamSection() method with different inputs
        // use nextStream() method to supply the Stream input as a first argument in streamSection() method
        System.out.println("LAB # 9 --- PROBLEM # 5");

        System.out.println("Call # 1: " + streamSection(nextStream(), 0, 3).toList());
        System.out.println("Call # 2: " + streamSection(nextStream(), 2, 5).toList());
        System.out.println("Call # 3: " + streamSection(nextStream(), 5, 7).toList());
    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
}
