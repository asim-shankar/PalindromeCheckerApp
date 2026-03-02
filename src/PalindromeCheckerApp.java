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
    }
}