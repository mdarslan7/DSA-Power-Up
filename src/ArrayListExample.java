import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("arslan");

        // Accessing elements in the ArrayList
        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing an element from the ArrayList
        names.remove("Bob");

        // Checking if an element exists in the ArrayList
        if (names.contains("Charlie")) {
            System.out.println("Charlie is present in the ArrayList.");
        } else {
            System.out.println("Charlie is not present in the ArrayList.");
        }
    }
}
