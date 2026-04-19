class Solution {
    public double myPow(double x, int n) {
        long nn = n;

        if (nn < 0) {
            x = 1 / x;   // important
            nn = -nn;    // safe because nn is long
        }

        double ans = 1.0;

        while (nn > 0) {   // use nn, not n
            if (nn % 2 == 0) {
                x = x * x;
                nn = nn / 2;
            } else {
                nn = nn - 1;
                ans = x * ans;
            }
        }

        return ans;
    }
}