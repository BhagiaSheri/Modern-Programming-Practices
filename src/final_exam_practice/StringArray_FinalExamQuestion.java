package final_exam_practice;

import java.util.function.Function;

public class StringArray_FinalExamQuestion {

    public static void main(String[] args) {

        // Given condition to create a string with char[]
        char[] chars = {'c', 'a', 't'};
        String s = new String(chars);
        System.out.println("Given Condition: "+s);

        //Lambda Expression
        Function<char[], String> f1 = (cs) -> new String(cs);
        String s1 = f1.apply(chars);
        System.out.println("Lambda Expression: "+s1);

        //Method Reference
        Function<char[], String> f2 = String::new;
        String s2 = f2.apply(chars);
        System.out.println("Lambda Expression: "+s2);
    }
}
