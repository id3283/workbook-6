import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Utils.getPeople();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to search for (first or last): ");
        String searchName = scanner.nextLine();

        LocalTime start = LocalTime.now();
        ArrayList<Person> matches = new ArrayList<>();

        double sumOfAges = 0;
        double maxAge = people.get(0).getAge();
        double minAge = people.get(0).getAge();

        for (Person p : people) {
            sumOfAges += p.getAge();

            if (p.getAge() > maxAge)
                maxAge = p.getAge();

            if (p.getAge() < minAge)
                minAge = p.getAge();

            if ( p.getFirstName().equalsIgnoreCase(searchName) ||
                    p.getLastName().equalsIgnoreCase(searchName) )
                matches.add(p);
        }

        double averageAge = sumOfAges / people.size();

        LocalTime end = LocalTime.now();
        System.out.println("Processing time: " + Duration.between(start, end));

        System.out.println("Average age: " + averageAge);
        System.out.println("Maximum age: " + maxAge);
        System.out.println("Minimum age: " + minAge);

        System.out.println("\nNames matching: " + searchName);
        for (Person p : matches) {
            System.out.println(p);
        }
    }
}
