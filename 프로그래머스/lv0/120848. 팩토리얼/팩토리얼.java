class Solution {
    public int solution(int n) {
        int answer = 2;
        int x = 1;
        while (x <= n) {
            x = x*answer;
            answer++;
        }
        return answer-2;
    }
}