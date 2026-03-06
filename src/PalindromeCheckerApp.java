import java.util.Scanner;

// Palindrome service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while(start < end) {

            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if(result) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

    }
}