class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();

        int n = digits.length;

        for (int i = 0; i < n; i++) {

            // First digit cannot be 0
            if (digits[i] == 0) continue;

            for (int j = 0; j < n; j++) {

                if (i == j) continue;

                for (int k = 0; k < n; k++) {

                    if (i == k || j == k) continue;

                    // Last digit must be even
                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 +
                              digits[j] * 10 +
                              digits[k];

                    set.add(num);
                }
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}