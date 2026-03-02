
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Display Welcome Banner
        System.out.println("==========================================");
        System.out.println("     WELCOME TO PALINDROME CHECKER APP   ");
        System.out.println("==========================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version          : 1.0");
        System.out.println("Developer        : Console Based Java App");
        System.out.println("==========================================");

        // Application Flow Control Message
        System.out.println("Application started successfully.");
        System.out.println("Proceeding to next use case...");
        String word = "madam";
        String reversed = "";
        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        // Check Palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The given word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given word \"" + word + "\" is NOT a Palindrome.");
        }

        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed1 = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed1 = reversed1 + original.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed1);

        // Compare using equals() method
        if (original.equals(reversed1)) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        // Hardcoded String
        String input = "racecar";

        // Convert String to character array
        char[] characters = input.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        // Hardcoded String
        String input1 = "level";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input1.length(); i++) {
            stack.push(input1.charAt(i));
        }

        boolean isPalindrome1 = true;

        // Pop characters and compare
        for (int i = 0; i < input1.length(); i++) {
            char poppedChar = stack.pop();  // Pop operation

            if (input.charAt(i) != poppedChar) {
                isPalindrome1 = false;
                break;
            }
        }

        // Print result
        System.out.println("Input String : " + input1);

        if (isPalindrome1) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        String input2 = "madam";

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack1 = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input2.length(); i++) {
            char ch = input2.charAt(i);
            queue.add(ch);   // Enqueue
            stack1.push(ch);  // Push
        }

        boolean isPalindrome2 = true;

        // Compare Dequeue (FIFO) and Pop (LIFO)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack1.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome2 = false;
                break;
            }
        }

        // Display Result
        System.out.println("Input String : " + input2);

        if (isPalindrome2) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        // Hardcoded String
        String input3 = "radar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input3.length(); i++) {
            deque.addLast(input3.charAt(i));
        }

        boolean isPalindrome3 = true;

        // Remove from front and rear and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome3 = false;
                break;
            }
        }

        // Print result
        System.out.println("Input String : " + input3);

        if (isPalindrome3) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

    }
    }
