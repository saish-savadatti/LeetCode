public class Solution {
    public String largestGoodInteger(String num) {
        String best = "";
        for (int i = 0; i < num.length() - 2; i++) {
            char c = num.charAt(i);
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String triple = num.substring(i, i + 3);
                if (triple.compareTo(best) > 0) {
                    best = triple;
                }
            }
        }
        return best;
    }
}
