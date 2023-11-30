import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,4,5,6,6,7,8,9,10};

        System.out.println("Duplicate elements in the array: ");
        printDuplicateElements(arr);
    }

    public static void printDuplicateElements(Integer[] arr) {
        ArrayList<Integer> duplicateElements = new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i].equals(arr[j])) {
                    if (!duplicateElements.contains(arr[i])) {
                        duplicateElements.add(arr[i]);
                    }
                }
            }
        }

        for (Integer duplicateElement : duplicateElements) {
            System.out.println(duplicateElement);
        }
    }
}