public class Labler {

    public static <T> void printWithLable(String label, T value) {
        System.out.println(label + " : " + value.toString());
        System.out.println("T is of type: " + value.getClass());
    }
}
