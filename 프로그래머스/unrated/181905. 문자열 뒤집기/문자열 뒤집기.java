import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] arr = my_string.split("");
        ArrayList<String> arrL = new ArrayList<>(Arrays.asList(arr));
        for (int i = s; i <= e; i++, e--) {
            String tmp = arrL.get(i);
            arrL.set(i, arrL.get(e));
            arrL.set(e, tmp);
        }
        for (String x : arrL) {
            answer += x;
        }
        return answer;
    }
}