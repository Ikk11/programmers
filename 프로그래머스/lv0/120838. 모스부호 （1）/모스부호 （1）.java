class Solution {
    public String solution(String letter) {
        String[][] morse = {{".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"},
                            {"..-.", "f"}, {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"},
                            {"-.-", "k"}, {".-..", "l"}, {"--", "m"}, {"-.", "n"}, {"---", "o"},
                            {".--.", "p"}, {"--.-", "q"}, {".-.", "r"}, {"...", "s"}, {"-", "t"},
                            {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"}, {"-.--", "y"},
                            {"--..", "z"}};
        
        String[] arr = letter.split(" ");
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (arr[i].equals(morse[j][0])) {
                    answer += morse[j][1];
                    break;
                }
            }
        }
        return answer;
    }
}