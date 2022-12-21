package lab9.Prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("LAB # 9 --- PROBLEM # 8");

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> query1 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("QUERY # 1: " + query1);


        // Query 2: What are all the unique cities where the traders work?
        Set<String> query2 = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("QUERY # 2: " + query2);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> query3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("QUERY # 3: " + query3);

        // Query 4: Return a string of all traders names sorted alphabetically.
        String query4 = transactions.stream()
                .map(t -> t.getTrader().getName())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("QUERY # 4: " + query4);

        // Query 5: Are there any trader based in Milan?
        boolean query5 = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .filter(city -> city.equals("Milan"))
                .findFirst().isPresent();
        System.out.println("QUERY # 5: " + query5);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        List<Transaction> query6 = transactions.stream()
                .peek(t -> {
                    if (t.getTrader().getCity().equals("Milan"))
                        t.getTrader().setCity("Cambridge");
                }).collect(Collectors.toList());
        System.out.println("QUERY # 6: " + query6);

        // Query 7: What's the highest value in all the transactions?
        long query7 = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .get();
        System.out.println("QUERY # 7: " + query7);
    }
}
