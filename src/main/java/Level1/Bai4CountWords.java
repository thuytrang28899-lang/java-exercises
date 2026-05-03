package Level1;

public class Bai4CountWords {

    public static void main(String[] args) {
        System.out.println(countWords("Xin chào các bạn")); // 4
        System.out.println(countWords("Hello World"));      // 2
        System.out.println(countWords("  Hello   World  ")); // 2
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;

        int count = 0;
        str = str.trim();

        for (int i = 0; i < str.length(); i++) {
            // nếu là chữ và đứng sau khoảng trắng → là từ mới
            if (str.charAt(i) != ' ' &&
                    (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }
}