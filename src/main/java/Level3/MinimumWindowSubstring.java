package Level3;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // BANC
    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] map = new int[128];

        // đếm ký tự cần
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            // nếu ký tự cần
            if (map[s.charAt(right)] > 0) {
                count--;
            }
            map[s.charAt(right)]--;

            // đủ ký tự → thu hẹp
            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                map[s.charAt(left)]++;

                if (map[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}