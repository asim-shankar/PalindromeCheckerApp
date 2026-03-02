
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome5(String str, int start, int end) {

        // Base Condition: If start crosses end, string is palindrome
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome5(str, start + 1, end - 1);
    }
    interface PalindromeStrategy {
        boolean checkPalindrome(String input);
    }
    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean checkPalindrome(String input) {

            Stack<Character> stack = new Stack<>();

            // Push all characters to stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Compare with original string
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }
    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean checkPalindrome(String input) {

            Deque<Character> deque = new LinkedList<>();

            // Add characters to deque
            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));
            }

            // Compare front and rear
            while (deque.size() > 1) {
                char front = deque.removeFirst();
                char rear = deque.removeLast();

                if (front != rear) {
                    return false;
                }
            }

            return true;
        }
    }
    static class PalindromeService {

        private PalindromeStrategy strategy;

        // Inject strategy via constructor
        public PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.checkPalindrome(input);
        }
    }




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
        String input4 = "level";

        // Convert string to singly linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < input4.length(); i++) {
            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 1: Find middle using Fast & Slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half (in-place)
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome4 = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome4 = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Print result
        System.out.println("Input String : " + input4);

        if (isPalindrome4) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        String input5 = "madam";

        boolean result = isPalindrome5(input, 0, input.length() - 1);

        System.out.println("Input String : " + input5);

        if (result) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        String input6 = "A man a plan a canal Panama";

        // Step 1: Normalize string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply palindrome logic (two-pointer approach)
        int start1 = 0;
        int end1 = normalized.length() - 1;

        boolean isPalindrome6 = true;

        while (start1 < end1) {
            if (normalized.charAt(start1) != normalized.charAt(end1)) {
                isPalindrome6 = false;
                break;
            }
            start1++;
            end1--;
        }

        // Display results
        System.out.println("Original String   : " + input6);
        System.out.println("Normalized String : " + normalized);

        if (isPalindrome6) {
            System.out.println("Result : The given string is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }
        System.out.println("==========================================");
        System.out.println("   UC12: Strategy Pattern Palindrome App ");
        System.out.println("==========================================");

        String input7 = "madam";

        // Choose Strategy at Runtime
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeService service1 = new PalindromeService(stackStrategy);

        boolean result1 = service1.execute(input);

        System.out.println("Using Stack Strategy:");
        System.out.println("Input String : " + input7);
        System.out.println("Result : " + (result1 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("------------------------------------------");

        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeService service2 = new PalindromeService(dequeStrategy);

        boolean result2 = service2.execute(input);

        System.out.println("Using Deque Strategy:");
        System.out.println("Input String : " + input7);
        System.out.println("Result : " + (result2 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("==========================================");
        System.out.println("Application Finished Successfully.");
        String input9 = "AmanaplanacanalPanama";
        input = input9.toLowerCase();

        System.out.println("Input String : " + input9);
        System.out.println("--------------------------------------");

        // 1️⃣ Two-Pointer Approach
        long start2 = System.nanoTime();
        boolean result4 = twoPointerCheck(input);
        long end2 = System.nanoTime();

        // 2️⃣ Stack Approach
        long start3 = System.nanoTime();
        boolean result5 = stackCheck(input);
        long end3 = System.nanoTime();

        // 3️⃣ Deque Approach
        long start4 = System.nanoTime();
        boolean result6 = dequeCheck(input);
        long end4 = System.nanoTime();

        // Display Results
        System.out.println("Two-Pointer Result : " + result4);
        System.out.println("Execution Time     : " + (end2 - start2) + " ns");
        System.out.println();

        System.out.println("Stack Result       : " + result5);
        System.out.println("Execution Time     : " + (end3 - start3) + " ns");
        System.out.println();

        System.out.println("Deque Result       : " + result6);
        System.out.println("Execution Time     : " + (end4 - start4) + " ns");
        System.out.println();

        System.out.println("Program executed successfully.");
    }

    // Two-Pointer Method
    public static boolean twoPointerCheck(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Stack Method
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
    }

