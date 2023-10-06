import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (ans.size() == 0) {
                ans.add(arr[i]);
            } else if (ans.size() >= 0 && ans.get(ans.size()-1) == arr[i]) {
                ans.remove(ans.size()-1);
            } else {
                ans.add(arr[i]);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        int[] empty = {-1};
        if (answer.length == 0)
            return empty;
        return answer;
    }
}