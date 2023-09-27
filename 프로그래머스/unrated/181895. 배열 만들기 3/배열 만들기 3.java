class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int a = intervals[0][1] - intervals[0][0] + 1;
        int b = intervals[1][1] - intervals[1][0] + 1;
        int x = intervals[0][0];
        int y = intervals[1][0];
        int[] answer1 = new int[a];
        int[] answer2 = new int[b];
        for (int i = 0; i < a; i++) {
            answer1[i] = arr[x];
            x++;
        }
        for (int i = 0; i < b; i++) {
            answer2[i] = arr[y];
            y++;
        }
        
        int z = answer1.length + answer2.length;
        int[] answer = new int[z];
        for (int i = 0; i < answer1.length; i++) {
            answer[i] = answer1[i];
        }
        int zz = 0;
        for (int i = answer1.length; i < z; i++) {
            answer[i] = answer2[zz];
            zz++;
        }
        return answer;
    }
}