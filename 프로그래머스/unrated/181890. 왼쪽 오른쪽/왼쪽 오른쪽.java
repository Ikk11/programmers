import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> ans = new ArrayList<>();
        String[] empty = new String[0];
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str_list));
        int x = 0;
        if (arr.indexOf("l") == -1 && arr.indexOf("r") == -1) {
            return empty;
        } else if (arr.indexOf("r") == -1) {
            for (int i = 0; i < arr.indexOf("l"); i++) {
                ans.add(i, arr.get(i));
            }
        } else if (arr.indexOf("l") == -1) {
            for (int i = arr.indexOf("r") + 1; i < arr.size(); i++) {
                ans.add(x++, arr.get(i));
            }
        } else if (arr.indexOf("r") > arr.indexOf("l")) {
            for (int i = 0; i < arr.indexOf("l"); i++) {
                ans.add(i, arr.get(i));
            }
        } else {
            for (int i = arr.indexOf("r") + 1; i < arr.size(); i++) {
                ans.add(x++, arr.get(i));
            }
        }
        String[] answer = ans.toArray(new String[ans.size()]);
        return answer;
    }
}