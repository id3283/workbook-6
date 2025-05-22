import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    private static final String[] FIRST_NAMES = {
            "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George", "Hannah", "Isaac", "Julia",
            "Kevin", "Laura", "Michael", "Nina", "Oscar", "Paula", "Quentin", "Rachel", "Simon", "Tina",
            "Umar", "Vera", "Will", "Xena", "Yasir", "Zara", "Amber", "Blake", "Carmen", "Derek",
            "Elena", "Frank", "Gina", "Harold", "Irene", "Jack", "Kara", "Liam", "Mona", "Nate",
            "Olive", "Peter", "Queenie", "Ralph", "Sasha", "Trent", "Una", "Violet", "Wade", "Yolanda"
    };

    private static final String[] LAST_NAMES = {
            "Anderson", "Brown", "Clark", "Davis", "Evans", "Foster", "Garcia", "Hill", "Irwin", "Jones",
            "Klein", "Lopez", "Moore", "Nelson", "Owens", "Perez", "Quinn", "Reed", "Stewart", "Turner",
            "Underwood", "Vasquez", "White", "Xu", "Young", "Zimmerman", "Baker", "Carter", "Diaz", "Ellis",
            "Fleming", "Grant", "Harris", "Iverson", "Jefferson", "King", "Lee", "Mitchell", "Nguyen", "Ortiz",
            "Price", "Quintana", "Roberts", "Sanchez", "Taylor", "Upton", "Vega", "Walker", "Yates", "Zuniga"
    };

    public static List<Person> getPeople(int n) {
        List<Person> people = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            int age = random.nextInt(99) + 1;
            people.add(new Person(firstName, lastName, age));
        }
        return people;
    }
}
