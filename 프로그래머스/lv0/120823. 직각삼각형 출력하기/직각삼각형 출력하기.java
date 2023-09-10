import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(x);
            x += "*";
        }
    }
}