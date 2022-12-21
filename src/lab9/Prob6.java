package lab9;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Collections.emptySet;

public class Prob6 {

    public Set<String> union(List<Set<String>> sets) {
        //using reduce operator
        return sets.stream().reduce(emptySet(), (s1, s2) -> {
            Set<String> result = new HashSet<>(s1);
            result.addAll(s2);
            return result;
        });
    }

    public Set<String> unionUsingFlatMap(List<Set<String>> sets) {
        //using flatMap
        return sets.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println("LAB # 9 --- PROBLEM # 6");
        Prob6 prob6 = new Prob6();
        List<Set<String>> input = List.of(Set.of("A", "B"), Set.of("D"), Set.of("1", "2", "3", "4"));

        System.out.println("*** Using Reduce Operator ***");
        System.out.println(prob6.union(input));

        System.out.println("*** Using FlatMap ***");
        System.out.println(prob6.unionUsingFlatMap(input));
    }
}
