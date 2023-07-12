import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        int max = numbers[n - 1] * numbers[n - 2];
        return max;
    }
}
