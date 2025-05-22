import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Dana", "Wyatt", 63));
        people.add(new Person("Zachary", "Westly", 31));
        people.add(new Person("Elisha", "Aslan", 14));
        people.add(new Person("Ian", "Auston", 16));
        people.add(new Person("Zephaniah", "Hughes", 9));
        people.add(new Person("Ezra", "Aiden", 17));
        people.add(new Person("Siddalee", "Jones", 45));
        people.add(new Person("Olivia", "Brown", 23));
        people.add(new Person("James", "Smith", 52));
        people.add(new Person("Liam", "Evans", 38));

        return people;
    }
}
