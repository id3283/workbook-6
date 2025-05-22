import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> titles = Arrays.asList("Halloween", "Ghost", "Halloween 2", "Friday the 13th", "Twister", "Halloween 3");

        titles.forEach(title -> System.out.println(title));

        int count = titles.stream()
                .filter(title -> title.toLowerCase().contains("halloween"))
                .toList()
                .size();

        List<String> states = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut");

        List<String> matchingStates = states.stream()
                .filter( s -> s.startsWith("C") )
                .toList();

        System.out.println(matchingStates);
    }

    private static Comparator<String> getStringComparator() {
        return (a, b) -> b.compareTo(a);
    }
}
