package quiz_practice;

public class Lesson7 implements MyInterface1, MyInterface2 {
//    @Override
//    public void print() {
//        MyInterface2.super.print();
//    }

    @Override
    public void print() {
        MyInterface2.super.print();
    }

    @Override
    public void test() {

    }


    static void display() {
        System.out.println("Main Class display");
    }

    public static void main(String[] args) {
        //   display();
        //   MyInterface1.display();
        MyInterface1 i1 = new Lesson7();
        String const11 = i1.const1;
        i1.print();
        MyInterface1.display();
        //  MyInterface2.display();

        MyInterface2 i2 = new Lesson7();
        i2.print();

        Lesson7 l7 = new Lesson7();
        l7.print();
        //  l7.display();

    }
}
