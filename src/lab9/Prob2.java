package lab9;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Prob2 {
    public IntSummaryStatistics getSummary() {
        IntStream myIntStream = IntStream.of(10, 7, 9, 4, 20, 5, 12);
        return myIntStream.summaryStatistics();
    }

    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 2");
        Prob2 prob2 = new Prob2();
        System.out.println("Min Value: " + prob2.getSummary().getMin());
        System.out.println("Max Value: " + prob2.getSummary().getMax());
    }
}
