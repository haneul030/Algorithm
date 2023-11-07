import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[]answer = new int[commands.length];
                
        int[] result;
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
                        
            result = new int[j - i + 1];
            int p = 0;
            for (int s = i; s <= j; s++) {
                result[p] = array[s - 1];
                p++;
            }
            
            // 정렬
            Arrays.sort(result);
    
            answer[n] = result[k - 1];
        }  
        return answer;
    }
}