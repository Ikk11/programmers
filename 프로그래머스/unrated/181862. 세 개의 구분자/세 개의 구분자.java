class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a|b|c", " ");
        String[] answer = myStr.trim().split("\\s+");
        String[] empty = {"EMPTY"};
        if (answer[0].equals("")) return empty;
        return answer;
    }
}