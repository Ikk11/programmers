import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String[] my = my_string.split("");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(my));
        String[] ans = {"a", "e", "i", "o", "u"};
        
        arr.removeAll(Arrays.asList(ans));
        
        String answer = "";
        for (int i = 0; i < arr.size(); i++) {
            answer += arr.get(i);
        }
        return answer;
    }
}