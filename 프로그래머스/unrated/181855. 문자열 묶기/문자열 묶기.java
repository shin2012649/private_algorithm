class Solution {
    public int solution(String[] strArr) {
        int[] groupCounts = new int[100];
        
        for (String str : strArr) {
            int length = str.length();
            groupCounts[length]++;
        }
        
        int maxGroup = 0;
        for (int count : groupCounts) {
            maxGroup = Math.max(maxGroup, count);
        }
        
        return maxGroup;
    }
}
