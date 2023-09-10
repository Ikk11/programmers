class Solution {
    public int solution(int[] array) {       
        int[] arr = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++; 
        }
        
        int tmp = 0;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
                answer = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (answer != i && arr[answer] == arr[i]) {
                return -1;
            }
        } 
        
        return answer;
    }
}