package lab9.Prob10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"),
                new Human("Jane", 45, "Female"),
                new Human("John", 30, "Male")
        };

        System.out.println("LAB # 9 --- PROBLEM # 10");

        // Query 1  : Print only Female candidates names
        List<String> query1 = Arrays.stream(list)
                .filter(h -> h.gender.equals("Female"))
                .map(h -> h.name)
                .collect(Collectors.toList());
        System.out.println("QUERY # 1: " + query1);

        // Query 2 : Create an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status
        Function<String, Human> query2_partA = Human::new;
        System.out.println("QUERY # 2 - Part # A: " + query2_partA.apply("Bhagia Sheri"));

        BiFunction<String, Integer, Human> query2_partB = Human::new;
        System.out.println("QUERY # 2 - Part # B: " + query2_partB.apply("Bhagia Sheri", 24));

        TriFunction<String, Integer, String, Human> query2_partC = Human::new;
        System.out.println("QUERY # 2 - Part # C: " + query2_partC.apply("Bhagia Sheri", 24, "Female"));

        // Query 3 : Count the male candidates whose age is more than 30
        long query3 = Arrays.stream(list)
                .filter(h -> h.gender.equals("Male"))
                .filter(h -> h.age > 30)
                .count();
        System.out.println("QUERY # 3: " + query3);
    }


}
