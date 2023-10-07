class Solution {
    public int[] solution(int[] arr) {
        int tmp = 1;
        while (arr.length > tmp) {
            tmp*=2;
        }
        int[] answer = new int[tmp];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}