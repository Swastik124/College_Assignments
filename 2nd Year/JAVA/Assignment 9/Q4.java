public class Q4 {

    public static void main(String[] args) {

        String originalString = "Hello, World!";
        char oldChar = 'o';
        char newChar = 'e';

        String newString = replaceCharAt(originalString, oldChar, newChar);

        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);
    }

    public static String replaceCharAt(String str, char oldChar, char newChar) {
        if (str == null || str.length() == 0) {
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
                break;
            }
        }

        return String.valueOf(chars);
    }
}