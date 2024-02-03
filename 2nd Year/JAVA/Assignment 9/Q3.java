public class Q3 {

    public static void main(String[] args) {

        String str = "Hello World! I'm a Java Developer."; // The original string
        String[] substrings = str.split(" "); // Split the string into sub-strings

        // Print out each sub-string
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}