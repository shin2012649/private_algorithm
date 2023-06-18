class Solution {
    public int[] solution(int[] num_list, int n) {
        n -=1;
        int length = num_list.length -n;
        
        int[]num_arr = new int[length];
        for(int i = n; i < num_list.length; i++)
            num_arr[i-n] = num_list[i];
        
        
        return num_arr;
    }
}