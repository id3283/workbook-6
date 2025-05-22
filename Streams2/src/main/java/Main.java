import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Utils.getPeople();

        Collections.sort(people);
        for (Person p : people)
            System.out.println(p);
    }
}
