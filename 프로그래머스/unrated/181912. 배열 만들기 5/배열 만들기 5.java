import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            Long a = Long.parseLong(intStrs[i].substring(s, s+l));
            if (a > k) {
                arr.add(a);
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
}