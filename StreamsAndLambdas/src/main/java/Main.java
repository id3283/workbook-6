import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> states = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut");
        String letter = "C";
        List<String> matchingStates = states.stream()
                .filter(state -> state.startsWith(letter))
                .collect(Collectors.toList());

        System.out.println(matchingStates);
    }

    private static Comparator<String> getStringComparator() {
        return (a, b) -> b.compareTo(a);
    }
}
