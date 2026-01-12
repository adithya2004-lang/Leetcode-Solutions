import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        s = s.toLowerCase();   // convert to lowercase

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // compare characters
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("Valid Palindrome");
    }
}
//up