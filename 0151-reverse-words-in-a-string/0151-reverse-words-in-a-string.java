public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Step 1: Reverse entire string
        reverse(chars, 0, n - 1);

        // Step 2: Reverse each word
        int start = 0;
        while (start < n) {
            // Skip spaces
            if (chars[start] == ' ') {
                start++;
                continue;
            }

            int end = start;
            while (end < n && chars[end] != ' ') end++;

            reverse(chars, start, end - 1);
            start = end;
        }

        // Step 3: Remove extra spaces
        return cleanSpaces(chars, n);
    }

    // Reverses a portion of the char array
    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Removes leading, trailing, and multiple spaces
    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            // Skip leading spaces
            while (j < n && a[j] == ' ') j++;

            // Copy word
            while (j < n && a[j] != ' ') a[i++] = a[j++];

            // Skip spaces between words
            while (j < n && a[j] == ' ') j++;

            // Add single space if not end
            if (j < n) a[i++] = ' ';
        }

        return new String(a, 0, i);
    }
}
