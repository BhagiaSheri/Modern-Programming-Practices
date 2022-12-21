package lab8.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob1 {

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 1");
        List<Double> list = new ArrayList<>();
        BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };
        System.out.println("RESULT: " + biFunction.apply(2.0, 3.0));
    }

}
