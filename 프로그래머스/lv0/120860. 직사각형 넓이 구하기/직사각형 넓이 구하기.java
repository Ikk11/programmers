class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            if (dots[0][0] != dots[1][0]) {
                x = Math.abs(dots[0][0] - dots[1][0]);
            } else {
                x = Math.abs(dots[0][0] - dots[2][0]);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (dots[0][1] != dots[1][1]) {
                y = Math.abs(dots[0][1] - dots[1][1]);
            } else {
                y = Math.abs(dots[0][1] - dots[2][1]);
            }
        }
        
        int answer = x*y;
        return answer;
    }
}