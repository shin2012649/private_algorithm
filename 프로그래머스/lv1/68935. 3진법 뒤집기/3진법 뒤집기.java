import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Solution {
    // 10진법 -> 3진법으로 변환 후 list 삽입
    // 다시 10진법으로
 
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
 
        List<Integer> temp = new ArrayList<>();
        // 3진법으로 변환하여 list에 담기
        while (n > 0) {
            temp.add(n % 3);
            n /= 3;
        }
 
        for (int i = 0; i < temp.size(); i++) {
            answer += (Math.pow(3, temp.size()-i-1)*temp.get(i));
        }
 
        return answer;
    }
}