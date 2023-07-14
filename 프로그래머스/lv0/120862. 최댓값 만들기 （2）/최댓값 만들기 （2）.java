import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int numA = numbers[1] * numbers[0];
        int numB = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if(numA < numB){
            return numB;
        }else{
            return numA;
        }

    }
}