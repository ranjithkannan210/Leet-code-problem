class Solution {
    public boolean checkPerfectNumber(long a) {
        if (a <= 1) {
            return false;
        }

        long sum = 1;

        for (long i = 2; i <= a / i; i++) {
            if (a % i == 0) {
                sum += i;

                if (i != a / i) {
                    sum += a / i;
                }
            }
        }

        return sum == a;
    }
}