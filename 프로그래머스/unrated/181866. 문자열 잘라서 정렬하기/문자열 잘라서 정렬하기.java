import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(answer));
        arr.removeAll(Arrays.asList(""));
        String[] answer1 = arr.toArray(new String[arr.size()]);
        Arrays.sort(answer1);
        return answer1;
    }
}