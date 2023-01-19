package final_exam_practice;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ComputeSum_FinalExamQuestion {

    public static <T> Double computeSum1(Collection<? extends Number> list) {

        Double sum = 0.0;

        // working solution
        for (Number i : list) {
            sum += Double.parseDouble(i.toString());
        }

        // pooja solution - evaluation (working)
        for (int i = 0; i < list.size(); i++) {
            sum += Double.parseDouble(list.stream().iterator().next() + "");
        }

        // pooja solution (Not Working)
//        for (int i = 0; i < list.size(); i++) {
//            sum += Double.parseDouble(list.get(i) + "");
//        }
        return sum;
    }

    public static <T> Double computeSum2(Collection/*s mistake in Bhagia's Solution*/<T> list) {

        Double sum = 0.0;

        // working solution
        for (T i : list) {
            sum += Double.valueOf(i + "");
        }

        // Bhagia Sheri (Not Working)
//        for (T i : list) {
//            sum += Double.valueOf(i);
//        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 3, 5, 5, 6, 9);
        Set<Double> doubleSet = Set.of(2.0, 3.0, 4.0);

        System.out.println(computeSum1(integerList));
        System.out.println(computeSum1(doubleSet));

        System.out.println(computeSum2(integerList));
        System.out.println(computeSum2(doubleSet));
    }
}
