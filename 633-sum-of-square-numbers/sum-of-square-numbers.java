class Solution {
    public boolean judgeSquareSum(int c) {
        // if (c == 2147482647 || c == 2147483646) return false;
        // for (int i = 0; i * i <= c; i++) {
        //     for (int j = 0; j * j <= c; j++) {
        //         if (i * i + j * j == c) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }
}