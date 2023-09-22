import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int[][] queries) {
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            arr.add(my_string.substring(i,i+1));
        }
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i][1]-queries[i][0]+1; j++) {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(0, arr.get(queries[i][1]));
                arr.remove(queries[i][1]);
                arr.add(queries[i][0]+j, tmp.get(0));
            }
        }
        String answer = "";
        for (String a1 : arr) {
            answer += a1;
        }
        return answer;
    }
}