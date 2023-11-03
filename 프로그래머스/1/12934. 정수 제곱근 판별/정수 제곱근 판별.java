class Solution {
    public long solution(long n) {
        long target = (long) Math.sqrt(n);

        if (target*target==n){
            return (target+1)*(target+1);
        }
        return -1;
    }
}