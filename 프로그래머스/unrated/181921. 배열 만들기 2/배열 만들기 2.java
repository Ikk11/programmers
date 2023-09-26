import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<String> arr = new ArrayList<>();
        int[] answer1 = {-1};
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).contains("1") || String.valueOf(i).contains("2") || String.valueOf(i).contains("3") || String.valueOf(i).contains("4") || String.valueOf(i).contains("6") || String.valueOf(i).contains("7") || String.valueOf(i).contains("8") || String.valueOf(i).contains("9")) {
            } else {
                arr.add(String.valueOf(i));
            }
        }
        
        if (arr.size() == 0) {
            return answer1;
        } else {
            int[] answer = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                answer[i] = Integer.parseInt(arr.get(i));
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}