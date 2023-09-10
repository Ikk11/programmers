
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i]++;
            for (int j = 0; j < score.length; j++) {
                if ((float)(score[i][0]+score[i][1])/2 < (float)(score[j][0]+score[j][1])/2) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}