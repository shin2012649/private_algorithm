import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num, Collections.reverseOrder());
        String result = String.join("", num);
        return Long.parseLong(result);
    }
}
