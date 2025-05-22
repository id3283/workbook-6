package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");

        for (String s : letters) {
            System.out.println(s);
        }

        List<String> matches = letters.stream()
                .filter(s -> s.startsWith("c"))
                .toList();

        letters.forEach(l -> System.out.println(l));

        System.out.println("Matching: " + matches);
    }

    private static Predicate<String> getStringPredicate() {
        return p -> p.startsWith("c");
    }

    static int add(int i, int j) {
        return i + j;
    }
}
