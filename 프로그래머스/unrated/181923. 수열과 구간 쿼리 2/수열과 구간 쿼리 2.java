class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = 1000000;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                if (queries[j][0] <= i && i <= queries[j][1]) {
                    if (queries[j][2] < arr[i]) {
                        if (arr[i] < answer[j])
                            answer[j] = arr[i];
                    }

                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 1000000 ) {
                answer[i] = -1;
            } 
        }

        return answer;
    }
}