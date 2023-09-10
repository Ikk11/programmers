class Solution {
    public int solution(int n) {
        int pizza = 6;
        int answer = 1;

        while (pizza%n != 0) {
            pizza += 6;
            answer++;
        }
        
        return answer;
    }
}