import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> groupNames = new ArrayList<>(Arrays.asList(names));
        List<String> result = new ArrayList<>();
        int groupSize = 5;
        
        while (!groupNames.isEmpty()) {
            result.add(groupNames.get(0));
            groupNames = groupNames.subList(Math.min(groupNames.size(), groupSize), groupNames.size());
        }
        
        return result.toArray(new String[0]);
    }
}

