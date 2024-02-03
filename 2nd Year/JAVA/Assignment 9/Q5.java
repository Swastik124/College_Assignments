public class Q5 {
    public static void main(String[] args) {
        String str1 = "0000123569";
        String str2 = "000012356090";

        System.out.println(removeLeadingZeros(str1)); // Output: 123569
        System.out.println(removeLeadingZeros(str2)); // Output: 12356090
    }

    public static String removeLeadingZeros(String str) {
        int index = 0;
        while (index < str.length() && str.charAt(index) == '0') {
            index++;
        }
        return str.substring(index);
    }
}