public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person that) {
        if(this.getAge() == that.getAge())
            return 0;
        else if(this.getAge() < that.getAge())
            return -1;
        else
            return 1;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", age " + age;
    }
}
