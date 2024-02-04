import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        // Create two array lists
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        // Join the two array lists to form a new array list
        List<Integer> combinedArrayList = new ArrayList<>();
        combinedArrayList.addAll(arrayList1);
        combinedArrayList.addAll(arrayList2);

        // Print the resultant array list by iterating it
        for (Integer element : combinedArrayList) {
            System.out.print(element + " ");
        }
    }
}