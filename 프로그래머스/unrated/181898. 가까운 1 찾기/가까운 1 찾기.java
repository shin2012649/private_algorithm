class Solution {
    public int solution(int[] arr, int idx) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && i >= idx ) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        return result;
    }
}



