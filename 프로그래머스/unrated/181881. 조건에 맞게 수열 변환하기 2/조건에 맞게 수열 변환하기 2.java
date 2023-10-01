import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] tmp = new int[arr.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i];
        }
        while (true) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 50 && arr[j]%2 == 0) {
                    arr[j]/=2;
                } else if (arr[j] < 50 && arr[j]%2 == 1) {
                    arr[j] =arr[j]*2+1;
                }
            }
            if (Arrays.equals(tmp, arr)) {
                break;
            } else {
                answer++;
                for (int j = 0; j < tmp.length; j++) {
                    tmp[j] = arr[j];
                }
            }
        }
        return answer;
    }
}