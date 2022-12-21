package exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //Use Comparator.comparing and thenComparing to sort
    //the list by balance and then by ownerName
    //Collect your stream into a list and print the sorted
    //result to the console
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<Account>() {
            {
                add(new Account("Bob", 5000, 1001));
                add(new Account("Jim", 10000, 1002));
                add(new Account("Bruce", 5300, 1003));
                add(new Account("Li", 12000, 1004));
                add(new Account("Sam", 9000, 1005));
                add(new Account("Rick", 11000, 1006));
            }
        };

        //sorting code here
        List<Account> sortedResult = accounts.stream()
                .sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName))
                .collect(Collectors.toList());

        System.out.println(sortedResult);

        //usage of reduce
        int balanceTotal = accounts.stream().map(Account::getBalance).reduce(0, Integer::sum);
        System.out.println(balanceTotal);

        //usage of parallel reduce
        List<Integer> integers = List.of(1, -3, 5, -4, 9, 3);
        // integers.parallelStream().reduce().

        // Usage of reduce to concat list of string
        List<String> strings = List.of("It's", "a", "good", "day", "today");
        String result = strings.stream().reduce("", (s1, s2) -> s1 + s2 + " ").trim();
        System.out.println(result);


        //NOTE: WHile Parallel stream we should use findAny() otherwise findOne()
    }

}
