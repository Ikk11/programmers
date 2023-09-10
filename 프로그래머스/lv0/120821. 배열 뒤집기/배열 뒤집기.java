class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int n = num_list.length-1;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n--];
        }
        return answer;
    }
}