import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int x : arr) {
            arr1.add(x);
        }
        for (int i = 0; i < query.length; i++) {
            if (i%2 == 0) {
                while (query[i]+1-arr1.size() != 0) {
                    arr1.remove(query[i]+1);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    arr1.remove(0);
                }
            }
        }        
        int[] answer = new int[arr1.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr1.get(i);
        }
        
        return answer;
    }
}