package quiz_practice;

public interface MyInterface2 {

    default void print() {
        System.out.println("MyInterface2 print");
    }

    void test();

    static void display() {
        System.out.println("MyInterface2 display");
    }
}
