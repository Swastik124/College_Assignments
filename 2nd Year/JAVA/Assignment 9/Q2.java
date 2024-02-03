// import java.util.Scanner;
// public class Q2{
//     public static void main(String[] args) {
//         StringBuffer s1=new StringBuffer("Mahesh");
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Original string : "+s1);
//         System.out.println("Enter the index of swapping pair of characters:\n1: Enter the 1st index no: ");
//         int x=sc.nextInt();
//         System.out.println("2: Enter the second index no: ");
//         int y=sc.nextInt();
//         for(int i=0;i<s1.length();i++)
//         {
//             for(int j=0;j<s1.length();j++)
//             {
//                 if(s1.charAt(j)==s1.charAt(i))
//                 {
//                     s1.append(s1.charAt(i));
//                 }
//             }
//         }
//         System.out.println(s1);
//     }
// }
public class Q2 {

    public static void main(String[] args) {

        String input = "hello world";
        String result = swapCharacters(input);

        System.out.println("Original String: " + input);
        System.out.println("Result: " + result);
    }

    public static String swapCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
                result.append(str.charAt(i));
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}