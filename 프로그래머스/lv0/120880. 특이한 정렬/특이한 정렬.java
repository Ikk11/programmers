class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] idx = new int[numlist.length];
        int[] answer = new int[numlist.length];
        
        for (int i = 0; i < idx.length; i++) {
            idx[i]++;
            for (int j = 0; j < idx.length; j++) {
                if (Math.abs(numlist[i]-n) > Math.abs(numlist[j]-n)) {
                    idx[i]++;
                } else if (Math.abs(numlist[i]-n) == Math.abs(numlist[j]-n)) {
                    if (numlist[i] < numlist[j]) {
                        idx[i]++;
                    }
                }
            }
        }
        
        for (int i = 0; i < idx.length; i++) {
            answer[idx[i]-1] = numlist[i];
        }
        
        return answer;
    }
}