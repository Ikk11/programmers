class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A","X").replace("B","A").replace("X","B");
        int answer = 0;
        answer = myString.indexOf(pat) == -1? 0:1;
        return answer;
    }
}