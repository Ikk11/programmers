class Solution {
    public int solution(int[] numbers, int k) {
        if (k*2%numbers.length == 0) {
            return numbers[numbers.length-2];
        } else if (k*2%numbers.length == 1) {
            return numbers[numbers.length-1];
        } else {
            return numbers[k*2%numbers.length-2];
        }
    }
}