import java.util.*;

public class Q3 {
    public static void main (String[] args){
        // Create a vector object
        Vector<Integer> vector = new Vector<>();

        // Enter integers from 1 to 30
        for (int i = 1; i <= 15; i++) {
            vector.add(i);
        }

        // Print only the even numbers using an Enumeration object
        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("Even numbers: ");
        while (enumeration.hasMoreElements()) {
            int num = enumeration.nextElement();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}