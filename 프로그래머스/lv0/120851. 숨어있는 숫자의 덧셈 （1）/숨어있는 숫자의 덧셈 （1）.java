class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = "" + i;
        }
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j < arr.length; j++) {
                if (my_string.substring(i, i+1).equals(arr[j])) {
                    answer += j;
                    break;
                }
            }
        }
        return answer;
    }
}