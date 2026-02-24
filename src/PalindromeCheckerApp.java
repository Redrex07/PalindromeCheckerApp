public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("=================================");
        System.out.println("Version : 1.0.0");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("Program ready...");


        System.out.println("=== PALINDROME CHECKER APP ===");

        // UC2 — Hardcoded Palindrome
        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
    }
}