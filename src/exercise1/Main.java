package exercise1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson # 7 - Functional Interface - Class Exercise # 1");
        Random random = new Random();
        int randNum = random.nextInt();
        MyInterface myInterface = () -> randNum;
        System.out.println("Output from Functional Interface # 1: " + myInterface.produce());
    }
}