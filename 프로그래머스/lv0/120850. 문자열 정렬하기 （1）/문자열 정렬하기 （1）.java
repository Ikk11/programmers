import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (my_string.substring(i, i+1).equals(Integer.toString(j))) {
                    arr.add(j);
                    break;
                }
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}