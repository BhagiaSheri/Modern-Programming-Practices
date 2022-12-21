package lab9.Prob7.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Character, Integer, String> FILTERED_EMPLOYEES =
            (list, startWithChar, salaryCheck) -> list.stream()
                    .filter(emp -> emp.getLastName().charAt(0) > 'M')
                    .filter(emp -> emp.salary > 100000)
                    .map(Employee::getFullName)
                    .sorted()
                    .collect(Collectors.joining(", "));
}
