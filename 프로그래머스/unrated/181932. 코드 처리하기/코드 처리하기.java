class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if (i%2 == 0) answer += code.charAt(i);
                } else{
                    mode++;
                }
            } else {
                if (code.charAt(i) != '1') {
                     if (i%2 == 1) answer += code.charAt(i);
                } else{
                    mode--;
                }
            }
        }
        if (answer == "")
            answer = "EMPTY";
        return answer;
    }
}