package lab10;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class SecondSmallestNumGeneric {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        T smallestNum = list.get(0);
        for (T i : list) {
            if (i.compareTo(smallestNum) < 0) {
                smallestNum = i;
            }
        }

        T secondSmallestNum = list.get(0);
        for (T i : list) {
            if (!i.equals(smallestNum) && i.compareTo(secondSmallestNum) < 0) {
                secondSmallestNum = i;
            }
        }

        return secondSmallestNum;
    }

    public static void main(String[] args) {
        System.out.println("LAB # 10 --- PROBLEM # 2");

        List<Integer> integerList = List.of(9, 4, 5, 7, 10, 3);
        System.out.println("Min Value For Integer List: " + secondSmallest(integerList));

        List<Double> doubleList = List.of(1.3, 3.5, 5.9, 7.1, 1.0, 3.0);
        System.out.println("Min Value For Double List: " + secondSmallest(doubleList));

        List<Instant> instantList = List.of(Instant.now(), Instant.now().minus(1, ChronoUnit.DAYS), Instant.now().plus(2, ChronoUnit.DAYS));
        System.out.println("Min Value For Instant List: " + secondSmallest(instantList));

        List<LocalDate> localDateList = List.of(LocalDate.now(), LocalDate.now().minus(1, ChronoUnit.DAYS), LocalDate.now().plus(2, ChronoUnit.DAYS));
        System.out.println("Min Value For LocalDate List: " + secondSmallest(localDateList));
    }
}

