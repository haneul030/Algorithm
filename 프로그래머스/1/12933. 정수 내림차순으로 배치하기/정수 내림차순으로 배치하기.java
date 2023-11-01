import java.util.*;
class Solution {
    public long solution(long n) {
        Integer[] nList = new Integer[(int) (Math.log10(n) + 1)];
        int count = 0;
        long result = 0;

        while (n > 0) {
            nList[count] = (int) (n % 10);
            n /= 10;
            count++;
        }
        Arrays.sort(nList, Collections.reverseOrder());
        for (int i = 0; i < nList.length; i++) {
            result += nList[i];
            result *= 10;
        }
        
        return result/10;
    }
}