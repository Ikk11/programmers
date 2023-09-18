class Solution {
    public int solution(int n) {
        int answer = 0;
        int y = 0;
        
        while (true) {
            answer++;
            y++;
            while (answer%3==0 || (answer+"").contains("3")) {
                answer++;
            }
            if (y == n) {
                break;
            }
        }
        
        return answer;
    }
}