import java.util.*;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.LinkedList;

public class Q1 {

    public static void main(String[] args) {
        // Create ArrayList object and insert elements
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("ArrayList: " + arrayList);

        // Create LinkedList object and insert elements
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("LinkedList: " + linkedList);

        // Create HashSet object and insert elements
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("HashSet: " + hashSet);
    }
}