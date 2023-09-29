class Solution {
    public String[] solution(String[] names) {
        int N = (names.length%5 == 0)? names.length/5 : names.length/5+1;
        int n = 0;
        String[] answer = new String[N];
        for (int i = 0; i < names.length; i+=5) {
            answer[n++] = names[i];
        }
        return answer;
    }
}