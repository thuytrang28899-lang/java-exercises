package Level2;

public class RemoveDuplicate {

        public static void main(String[] args) {
            System.out.println(removeDuplicate("programming")); // progamin
            System.out.println(removeDuplicate("abca"));        // abc
        }

        public static String removeDuplicate(String str) {
            if (str == null) return "";

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // nếu chưa có trong result → thêm
                if (result.indexOf(String.valueOf(c)) == -1) {
                    result.append(c);
                }
            }

            return result.toString();
        }
    }