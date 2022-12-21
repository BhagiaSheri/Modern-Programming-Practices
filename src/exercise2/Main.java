package exercise2;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.UnaryOperator;


public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson # 7 - Own Functional Interface - Class Exercise # 2");
        MyInterface2 myInterface2 = (m) -> 1.6 * m;
        System.out.println("Output from Functional Interface # 2: " + myInterface2.covert(2) + "KM");

        System.out.println("*************************************************************************");

        System.out.println("Lesson # 7 - Java Functional Interface - Class Exercise # 3");
        UnaryOperator<Double> converter = (m) -> 1.6 * m;
        System.out.println("Output from Java Functional Interface # 3: " + converter.apply(2.0) + "KM");

        System.out.println("*************************************************************************");

        System.out.println("Lesson # 7 - Java Functional Interface - Class Exercise # 4");
        Function<Integer, Boolean> identifier = (num) -> num % 2 == 0;
        System.out.println("Output from Java Functional Interface # 4: " + identifier.apply(3));

        System.out.println("*************************************************************************");

        System.out.println("Lesson # 7 - Java Functional Interface - Class Exercise # 5");
        IntPredicate identifier2 = (num2) -> num2 % 2 == 0;
        System.out.println("Output from Java Functional Interface # 5: " + identifier2.test(4));
    }

}
