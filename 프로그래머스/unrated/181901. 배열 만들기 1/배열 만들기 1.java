class Solution {
    public int[] solution(int n, int k) {
        int x = n/k;
        int[] answer = new int[x];
        for (int i = 0; i < x; i++)
            answer[i] = (i+1)*k;
        return answer;
    }
}