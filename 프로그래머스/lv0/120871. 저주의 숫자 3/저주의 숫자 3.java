class Solution {
    public int solution(int n) {
        int x = 0;
        int y = 0;
        while (true) {
            x++;
            y++;
            while (x%3==0 || (x+"").contains("3")) {
                x++;
            }
            if (y == n) {
                break;
            }
        }
        int answer = x;
        return answer;
    }
}