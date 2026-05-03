package Level1;

public class Bai1RemoveVowels {

    private static final String VOWELS = "aeiouAEIOU";

    public static void main(String[] args) {
        System.out.println(removeVowels("Cybersoft"));
        System.out.println(removeVowels("hello"));
    }

    public static String removeVowels(String input) {
        if (input == null) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (VOWELS.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}