class Solution {
    public double myPow(double x, int n) {
        long nn = n;  // convert first
        
        if (nn < 0) {
            x = 1 / x;
            nn = -nn;  // safe now (because nn is long)
        }

        double ans = 1.0;

        while (nn > 0) {
            if ((nn & 1) == 1) { // faster than %
                ans *= x;
            }
            x *= x;
            nn >>= 1; // divide by 2
        }

        return ans;
    }
}