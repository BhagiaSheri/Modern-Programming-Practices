package quiz_practice;

public interface MyInterface1 {

    String const1 = "Bhagia";

    default void print() {
        System.out.println("MyInterface1 print");
    }

//    void print();

    void test();

    static void display() {
        System.out.println("MyInterface1 display");
    }
}
