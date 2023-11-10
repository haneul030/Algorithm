class Solution {
    public String solution(int num) {
        String answer = "";
        //나머지가 없으면 짝수!
        if(num%2 == 0) {
            answer = "Even";
        //나머지가 있으면 홀수
        }else{
            answer = "Odd";
        }
        return answer;
    }
}