import java.util.ArrayList;
import java.util.Collections;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("Without Reverse ArrayList: "+list);
        // Reverse elements of the array list
        Collections.reverse(list);

        // Print the reversed array list
        System.out.println("Reversed ArrayList: " + list);
    }
}