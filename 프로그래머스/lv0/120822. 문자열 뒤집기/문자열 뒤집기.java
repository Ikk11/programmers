class Solution {
    public String solution(String my_string) {
        
        int n = my_string.length();
        String[] arr = my_string.split("");
        for (int i = 0; i < n; i++, n--) {
            String tmp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = tmp;
        }
        
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}