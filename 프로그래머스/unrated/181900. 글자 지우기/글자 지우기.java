import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            arr.add(indices[i]);
        }
        for (int i = 0; i < my_string.length(); i++) {
            if (!arr.contains(i)) {
                answer += my_string.substring(i,i+1);
            }
        }
        return answer;
    }
}