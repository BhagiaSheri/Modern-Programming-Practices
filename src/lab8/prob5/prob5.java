package lab8.prob5;

import java.util.Arrays;

public class prob5 {

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 5");
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}
