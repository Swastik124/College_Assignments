import java.util.LinkedList;
import java.util.ListIterator;

public class Q4 {
    public static void main(String[] args) {
        // Create a LinkedList object
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add integers from 1 to 10 to the LinkedList
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }

        // Create a ListIterator object for the LinkedList
        ListIterator<Integer> iterator = linkedList.listIterator();

        // Print all odd numbers in the LinkedList
        System.out.println("Odd numbers in the LinkedList:");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}