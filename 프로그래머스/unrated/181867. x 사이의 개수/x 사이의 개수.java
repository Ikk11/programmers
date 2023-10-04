import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));
        if (myString.endsWith("x")) {
            arr1.add("");
        }
        int[] answer = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            answer[i] = arr1.get(i).length();
        }
        return answer;
    }
}