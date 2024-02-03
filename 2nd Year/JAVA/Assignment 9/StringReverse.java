import java.util.Stack;

public class StringReverse {

    public static void main(String[] args) {
        String input = "Hello World!";
        String output = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            stack.push(c);
        }

        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }
}