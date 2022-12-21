package lab8.prob3;

import java.util.function.Predicate;

public class MyClass {
    int x;
    String y;

    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // testing method to check the equality
    public void myMethod(MyClass myClass) {
        Predicate<MyClass> comparator = this::equals;
        boolean result = comparator.test(myClass);
        System.out.println("Objects Equal (T/F)? " + result);
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (ob.getClass() != getClass()) return false;
        MyClass mc = (MyClass) ob;
        return mc.x == x && mc.y.equals(y);
    }

    public static void main(String[] args) {
        System.out.println("LAB # 8 ------- Problem # 3");
        MyClass myClass = new MyClass(1, "A");
        MyClass myClass1 = new MyClass(1, "B");
        myClass.myMethod(myClass);
        myClass.myMethod(myClass1);
    }

}
