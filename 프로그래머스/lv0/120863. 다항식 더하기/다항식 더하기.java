class Solution {
    public String solution(String polynomial) {
        polynomial = polynomial.replace("+", "");
        String[] arr = polynomial.split("  ");
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf("x") == 0) {
                x++;
            } else if (arr[i].indexOf("x") != -1) {
                x += Integer.parseInt(arr[i].substring(0,arr[i].indexOf("x")));
            } else {
                y += Integer.parseInt(arr[i]);
            }
        }
        
        if (x==0 && y==0) {
            return "0";
        } else if (x == 1 && y == 0) {
            return "x";
        } else if (x == 0) {
            return y + "";
        } else if (x == 1) {
            return "x + " + y;
        } else if (y == 0) {
            return x + "x";
        } else {
            return x + "x + " + y;
        }
    }
}