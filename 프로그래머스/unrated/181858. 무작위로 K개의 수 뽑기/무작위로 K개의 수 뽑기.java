import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
        int x = ans.size();
        if (ans.size() > k) {
            for (int i = 0; i < x-k; i++) {
                ans.remove(ans.size()-1);
            }
        } else if (ans.size() < k) {
            for (int i = 0; i < k-x; i++) {
                ans.add(-1);
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}