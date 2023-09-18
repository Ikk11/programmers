import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n%i == 0) {
                arr.add(i);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int a = 0;
            if (arr.get(i) == 2) {
                ans.add(arr.get(i));
                continue;
            }
            for (int j = 2; j < arr.get(i); j++) {
                if (arr.get(i)%j == 0) {
                    break;
                } else {
                    a++;
                    if (a == arr.get(i)-2) {
                        ans.add(arr.get(i));
                    }
                }
            }
        }
        
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}