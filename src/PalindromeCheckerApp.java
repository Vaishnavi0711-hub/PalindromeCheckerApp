import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Stack based palindrome check
    public static boolean stackPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque based palindrome check
    public static boolean dequePalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = sc.nextLine();

        // Stack performance
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long endStack = System.nanoTime();

        // Deque performance
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        long endDeque = System.nanoTime();

        System.out.println("\nStack Result: " + stackResult);
        System.out.println("Stack Execution Time: " + (endStack - startStack) + " ns");

        System.out.println("\nDeque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + (endDeque - startDeque) + " ns");
    }
}