class Solution {
    public String solution(String letter) {
        String[] morseCode = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        StringBuilder answer = new StringBuilder();
        String[] words = letter.split(" ");
        for (String word : words) {
            for (int i = 0; i < morseCode.length; i++) {
                if (word.equals(morseCode[i])) {
                    answer.append((char) ('a' + i));
                    break;
                }
            }
        }
        
        return answer.toString();
    }
}
