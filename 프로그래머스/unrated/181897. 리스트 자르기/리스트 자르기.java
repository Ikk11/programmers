import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            arr.add(num_list[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        switch (n) {
            case 1: 
                for (int i = 0; i <= slicer[1]; i++) {
                    ans.add(arr.get(i));
                }
                break;
            case 2:
                for (int i = slicer[0]; i <arr.size(); i++) {
                    ans.add(arr.get(i));
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    ans.add(arr.get(i));
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
                    ans.add(arr.get(i));
                }
                break;
        }   
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}