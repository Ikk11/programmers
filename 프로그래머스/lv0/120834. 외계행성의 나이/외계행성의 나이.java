class Solution {
    public String solution(int age) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        String age1 = "" + age;
        String answer = "";
        for (int i = 0; i < age1.length(); i++) {
            answer += arr[Integer.parseInt(age1.substring(i,i+1))];
        }
        return answer;
    }
}