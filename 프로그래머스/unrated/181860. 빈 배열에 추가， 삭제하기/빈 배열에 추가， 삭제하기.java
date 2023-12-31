import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    ans.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    ans.remove(ans.size()-1);
                }
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}