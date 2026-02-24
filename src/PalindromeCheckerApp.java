import java.util.*;

public class PalindromeCheckerApp {

    // ===== UC11 — Object-Oriented Palindrome Service =====
    static class PalindromeService {

        public boolean isPalindrome(String text) {

            // Remove spaces and convert to lowercase
            String cleanedText = text.replaceAll("\\s+", "").toLowerCase();

            int start = 0;
            int end = cleanedText.length() - 1;

            // Compare characters from both ends
            while (start < end) {
                if (cleanedText.charAt(start) != cleanedText.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

}