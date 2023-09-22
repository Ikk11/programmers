import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for (int element : index_list) {
            arr.add(element);
        }
        for (int i = 0; i < arr.size(); i++) {
            answer += my_string.substring(arr.get(i),arr.get(i)+1);
        }
        return answer;
    }
}