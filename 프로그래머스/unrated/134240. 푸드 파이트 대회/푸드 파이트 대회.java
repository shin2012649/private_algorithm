class Solution {
    public static void main(String[] args) {

       
        int[] food = {1, 3, 4, 6};

        solution(food);

    }

   
    public static String solution(int[] food) {

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++) {
            int share = food[i] / 2;

            for(int j=0; j<share; j++) {
                sb.append(i);
            }
        }

        String answer = sb.toString() + "0" + sb.reverse().toString();
        System.out.println("정답 : " + answer);

        return answer;
    }
}