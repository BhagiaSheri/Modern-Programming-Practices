package quiz_practice;

public interface MyInterface3 extends MyInterface2, MyInterface1 {
    void print();

    @Override
    default void test() {
       MyInterface1.super.test();
    }

}
