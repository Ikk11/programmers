import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> answer1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        if (arr1.indexOf(2) == -1) {
            answer1.add(-1);
        } else if (arr1.indexOf(2) == arr1.lastIndexOf(2)) {
            answer1.add(2);
        } else {
            for (int i = arr1.indexOf(2); i <= arr1.lastIndexOf(2); i++) {
                answer1.add(arr1.get(i));
            }
        }
        int[] answer = new int[answer1.size()];
        for (int i = 0; i < answer1.size(); i++) {
            answer[i] = answer1.get(i);
        }
        return answer;
    }
}