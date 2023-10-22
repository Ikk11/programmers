import java.util.ArrayList;
class Solution {
    public int gsd(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return (gsd(b, a%b));
    }
    public int solution(int a, int b) {
        int gsd_b = b/gsd(a, b);
        while (gsd_b%2 == 0) {
            gsd_b /= 2;
        }
        while (gsd_b%5 == 0) {
            gsd_b /= 5;
        }
        if (gsd_b == 1) {
            return 1;
        } else {
            return 2;            
        }
    }
}