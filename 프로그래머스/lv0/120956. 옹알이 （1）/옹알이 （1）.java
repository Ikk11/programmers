class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "_");
            babbling[i] = babbling[i].replaceAll("ye", "_");
            babbling[i] = babbling[i].replaceAll("woo", "_");
            babbling[i] = babbling[i].replaceAll("ma", "_");
            babbling[i] = babbling[i].replace("_", "");
            if (babbling[i].isEmpty()) {
                answer += 1;
            }
        }
        return answer;
    }
}