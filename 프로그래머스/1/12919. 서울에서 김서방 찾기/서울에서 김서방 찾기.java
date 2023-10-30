class Solution {
    public String solution(String[] seoul) {
               
        int count = 0;

        for(int i = 0; i < seoul.length; i++) {
            if("Kim".equals(seoul[i])) {
                count = i;
            }
        }
        
        return "김서방은 " + count + "에 있다";
    }
}