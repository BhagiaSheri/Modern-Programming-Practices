package lab9;

import java.util.List;

public class Prob3 {

    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(w -> w.contains("" + c))
                .filter(w -> !(w.contains("" + d)))
                .filter(w -> w.length() == len)
                .count();
    }

    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 3");
        List<String> words = List.of("cat", "cinder", "cartoon", "camel", "cylen", "yoda", "david", "banana", "baby");
        Prob3 prob3 = new Prob3();
        System.out.println("COUNT: " + prob3.countWords(words, 'c', 'd', 5));
    }
}
