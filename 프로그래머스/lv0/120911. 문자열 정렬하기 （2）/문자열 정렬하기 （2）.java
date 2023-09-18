import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        String[] ans = answer.split("");
        answer = "";
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            answer += ans[i];
        }
        return answer;
    }
}