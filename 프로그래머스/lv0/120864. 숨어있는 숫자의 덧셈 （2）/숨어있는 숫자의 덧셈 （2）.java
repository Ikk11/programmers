class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("");
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        int answer = 0;
        String ans = "0";
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0;flag && j < 10; j++) {
                if (arr[i].equals(num[j])) {
                    flag = false;
                }
            }
            if (!flag) {
                ans += arr[i];
            } else {
                answer += Integer.parseInt(ans);
                ans = "0";
            }
        }
        if (!ans.equals("0")) {
            answer += Integer.parseInt(ans);
        }
        return answer;
    }
}