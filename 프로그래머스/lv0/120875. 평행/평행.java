class Solution {
    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a%b);
    }
    
    public int solution(int[][] dots) {
        int x = gcd(dots[0][0] - dots[1][0], dots[0][1] - dots[1][1]);
        int y = gcd(dots[2][0] - dots[3][0], dots[2][1] - dots[3][1]);
        if ((dots[0][0] - dots[1][0])/x == (dots[2][0] - dots[3][0])/y) {
            if ((dots[0][1] - dots[1][1])/x == (dots[2][1] - dots[3][1])/y) {
                return 1;
            }
        }
        x = gcd(dots[0][0] - dots[2][0], dots[0][1] - dots[2][1]);
        y = gcd(dots[1][0] - dots[3][0], dots[1][1] - dots[3][1]);
        if ((dots[0][0] - dots[2][0])/x == (dots[1][0] - dots[3][0])/y) {
            if ((dots[0][1] - dots[2][1])/x == (dots[1][1] - dots[3][1])/y) {
                return 1;
            }
        }
        x = gcd(dots[0][0] - dots[3][0], dots[0][1] - dots[3][1]);
        y = gcd(dots[1][0] - dots[2][0], dots[1][1] - dots[2][1]);
        if ((dots[0][0] - dots[3][0])/x == (dots[1][0] - dots[2][0])/y) {
            if ((dots[0][1] - dots[3][1])/x == (dots[1][1] - dots[2][1])/y) {
                return 1;
            }
        }
        return 0;
    }
}