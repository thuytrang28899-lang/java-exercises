package Level1;

public class Bai5FirstLetters {

    public static void main(String[] args) {
        System.out.println(getFirstLetters("Xin chào các bạn")); // X C C B
        System.out.println(getFirstLetters("Hello World"));      // H W
        System.out.println(getFirstLetters("  Hello   World  ")); // H W (test nâng cao)
    }

    public static String getFirstLetters(String str) {
        if (str == null || str.trim().isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        str = str.trim();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' &&
                    (i == 0 || str.charAt(i - 1) == ' ')) {

                // thêm dấu cách nếu không phải ký tự đầu tiên
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}