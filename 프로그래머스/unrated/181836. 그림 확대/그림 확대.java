class Solution {
    public String[] solution(String[] picture, int k) {
        int h = picture.length; 
        int w = picture[0].length(); 
        
        int H = h * k; 
        int W = w * k; 
        
        String[] Picture2 = new String[H]; 
        
        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();
            String row = picture[i];
            
            for (int j = 0; j < w; j++) {
                char pixel = row.charAt(j);
                
                for (int m = 0; m < k; m++) {
                    sb.append(pixel);
                }
            }
            
            for (int n = 0; n < k; n++) {
                Picture2[i * k + n] = sb.toString();
            }
        }
        
        return Picture2;
    }
}
