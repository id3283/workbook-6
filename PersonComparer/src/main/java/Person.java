public class Person implements Comparable<Person> {
    String firstName;
    String lasName;
    int age;

    public Person(String firstName, String lasName, int age) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public int getAge() {
        return age;

    }

//    @Override
//    public int hashCode() {
//        return (this.getLasName() + this.getFirstName()).hashCode() ;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Person))
//            return false;
//        else
//            return this.compareTo((Person)obj) == 0;
//    }

    @Override
    public int compareTo(Person o) {
        return (this.getLasName() + this.getFirstName()).compareTo(o.getLasName() + o.getFirstName());
    }
}
