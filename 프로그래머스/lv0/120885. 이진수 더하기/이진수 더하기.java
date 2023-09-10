class Solution {
    public long power2(int x) {
        long ans = 1;
        for (int i = 0; i < x; i++) {
            ans *= 2;
        }
        return ans;
    }
    
    public long power10(int x) {
        long ans = 1;
        for (int i = 0; i < x; i++) {
            ans *= 10;
        }
        return ans;
    }
    
    
    public String solution(String bin1, String bin2) {
        long bin01 = Long.parseLong(bin1);
        long bin02 = Long.parseLong(bin2);
        
        int tmp1 = 0;
        int bin11 = 0;
        while (bin01 > 0) {
            bin11 += bin01%10*power2(tmp1++);
            bin01 /= 10;
        }
        int tmp2 = 0;
        int bin22 = 0;
        while (bin02 > 0) {
            bin22 += bin02%10*power2(tmp2++);
            bin02 /= 10;
        }
        
        int bin = bin11 + bin22;
        
        long answer = 0;
        for (int i = 12; i > 0; i--) {
            if (power2(i-1) <= bin && bin < power2(i)) {
                answer += power10(i-1);
                bin -= power2(i-1);
            }
        }
        String ans = String.valueOf(answer);
        return ans;
    }
}