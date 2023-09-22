import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && b == c && c == d && a == c && a == d && b == d) {
            answer += 1111*a;
            
        } else if (a != b && b != c && c != d && a != c && a != d && b != d) {
            int[] y = {a,b,c,d};
            Arrays.sort(y);
            answer += y[0];
            
        } else if (a == b && c == d) {
            answer += (a + c) * Math.abs(a - c);
        } else if (a == c && b == d) {
            answer += (a + b) * Math.abs(a - b);
        } else if (a == d && b == c) {
            answer += (a + b) * Math.abs(a - b);
            
        } else if (a == b && b == c) {
            answer += (10 * a + d)*(10 * a + d);
        } else if (a == c && c == d) {
            answer += (10 * a + b)*(10 * a + b);
        } else if (b == c && c == d) {
            answer += (10 * b + a)*(10 * b + a);
        } else if (a == b && b == d) {
            answer += (10 * a + c)*(10 * a + c);
            
        } else if (a == b) {
            answer += c * d;
        } else if (b == c) {
            answer += a * d;
        } else if (c == d) {
            answer += a * b;
        } else if (b == d) {
            answer += a * c;
        } else if (a == d) {
            answer += b * c;
        } else if (a == c) {
            answer += b * d;
        }
        
        return answer;
    }
}