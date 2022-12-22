package lab10.prob3;

import lab10.prob3.test.Employee;

import java.util.List;

public class ContainsGenericImplementation {

    //given code
    public static boolean contains(List<String> list, String s) {
        for (String x : list) {
            if (x == null && s == null) return true;
            if (x == null || s == null) continue;
            if (x.equals(s)) return true;
        }
        return false;
    }

    public static <T> boolean containsGeneralization(List<T> list, T s) {
        for (T x : list) {
            if (x == null && s == null) return true;
            if (x == null || s == null) continue;
            if (x.equals(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("LAB # 10 --- PROBLEM # 3");

        // Test the specific implementation (given)
        List<String> list = List.of("Bob", "Tom", "Alice");
        boolean result = contains(list, "Tom");
        System.out.println("Result of contains method with List<String>: " + result);

        // Test the generic implementation with same values
        System.out.println("Result of containsGeneralization method with List<T> (same values): " + containsGeneralization(list, "Alice"));

        // Test the generic implementation with Employee Class (Employee exists case)
        List<Employee> employees = List.of(
                new Employee("Joe", 120000),
                new Employee("John", 110000),
                new Employee("Joe", 200000),
                new Employee("Andrew", 80000),
                new Employee("Joe", 760000),
                new Employee("Steven", 135000),
                new Employee("Thomas", 111000),
                new Employee("Alice", 101000),
                new Employee("Donald", 100000)
        );
        boolean result2 = containsGeneralization(employees, new Employee("John", 110000));
        System.out.println("Result of containsGeneralization method with List<T> (Employee Class - Exist): " + result2);

        // Test the generic implementation with Employee Class (Employee does not exist case)
        boolean result3 = containsGeneralization(employees, new Employee("New Temp Employee", 110000));
        System.out.println("Result of containsGeneralization method with List<T> (Employee Class - Do not Exist): " + result3);
    }
}
