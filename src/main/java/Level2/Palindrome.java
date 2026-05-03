package Level2;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("abba"));  // true
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
