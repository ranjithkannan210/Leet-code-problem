class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 8; c += 2) {

                    boolean x = false, y = false, z = false;

                    for (int d : digits) {
                        if (d == a && !x) x = true;
                        else if (d == b && !y) y = true;
                        else if (d == c && !z) z = true;
                    }

                    if (x && y && z)
                        count++;
                }
            }
        }

        return count;
    }
}