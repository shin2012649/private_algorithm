class Solution {
    public int[] solution(int[] array) {
        int max = array[0]; // 가장 큰 수를 저장할 변수
        int Max_i = 0; // 가장 큰 수의 인덱스를 저장할 변수

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                Max_i = i;
            }
        }

        int[] answer = {max, Max_i};

        return answer;
    }
}
