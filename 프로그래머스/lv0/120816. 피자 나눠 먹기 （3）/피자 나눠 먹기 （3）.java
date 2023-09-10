class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int x = slice;
        while (slice < n) {
            slice += x;
            answer++;
        }
        return answer;
    }
}