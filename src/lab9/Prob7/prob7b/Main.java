package lab9.Prob7.prob7b;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        System.out.println("LAB # 9 --- PROBLEM # 7 (Part # B)");
        String result = LambdaLibrary.FILTERED_EMPLOYEES.apply(list, 'M', 100000);
        System.out.println(result);
    }
}
