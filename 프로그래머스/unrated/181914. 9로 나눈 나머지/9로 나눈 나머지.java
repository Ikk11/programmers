class Solution {
    public int solution(String number) {
        int answer = 0;
        int x = 0;
        for (int i = 0; i < number.length(); i++) {
            x += number.charAt(i)-'0';
        }
        answer = x%9;
        return answer;
    }
}