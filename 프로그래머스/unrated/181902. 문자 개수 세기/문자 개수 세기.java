class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] c = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if (c[i] <= 90) {
                answer[c[i]-'A']++;
            } else {
                answer[c[i]-'a'+26]++;
            }
        }
        return answer;
    }
}