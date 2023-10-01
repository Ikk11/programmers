class Solution {
    public int solution(String myString, String pat) {
        String x = myString.toUpperCase();
        String y = pat.toUpperCase();
        int answer = x.indexOf(y) == -1? 0:1;
        return answer;
    }
}