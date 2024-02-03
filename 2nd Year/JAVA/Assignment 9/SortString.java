import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String input = "sorting is an algorithm to sort data.";
        System.out.println("Input String: " + input);
        System.out.println("Sorted String: " + sortString(input));
    }

    public static String sortString(String input) {
        // convert the string into a char array
        char[] chars = input.toCharArray();

        // sort the char array
        Arrays.sort(chars);

        // convert the sorted char array back to a string
        return new String(chars);
    }
}
