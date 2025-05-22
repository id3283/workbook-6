import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Utils.getPeople();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to search for (first or last): ");
        String searchName = scanner.nextLine();

        List<Person> matches = people.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(searchName) ||
                        p.getLastName().equalsIgnoreCase(searchName))
                .toList();

        double sumOfAges = people.stream()
                .map(p -> p.getAge())
                .reduce(0, (runningSum, age) -> runningSum + age);

        int maxAge = people.stream()
                .map(p -> p.getAge())
                .sorted()
                .toList()
                .get(people.size()-1);

        int minAge = people.stream()
                .map(p -> p.getAge())
                .sorted()
                .toList()
                .get(0);

        double averageAge = sumOfAges / people.size();
        System.out.println("Average age: " + averageAge);
        System.out.println("Maximum age: " + maxAge);
        System.out.println("Minimum age: " + minAge);

        System.out.println("\nNames matching: " + searchName);
        for (Person p : matches) {
            System.out.println(p);
        }
    }
}
