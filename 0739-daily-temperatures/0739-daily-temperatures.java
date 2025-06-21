class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];
        int n = temp.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                count++;
                if (temp[j] > temp[i]) {
                    result[i] = count;
                    found = true;
                    break;
                }
            }
            if (!found) result[i] = 0;
        }

        return result;
    }
}
