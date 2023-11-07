class Solution {
    public int solution(long num) {
        int answer = 0;
              
        // num 이 1이 될 때까지 반복(while)
        while(num != 1) {
            if (num % 2 == 0) {		// num이 짝수이면
                num /= 2;			// 2 나누기
                answer++;

                if (num == 1) {		// 이때 num이 1이 되면 break
                    break;
                }
            }    

            if (num % 2 != 0) {		// num이 홀수이면
                num = num * 3 + 1;		// 3 곱하고 1 더하기
                answer++;

                if (num == 1) {		// 이때 num이 1이 되면 break
                    break;
                }
            } 

            if (answer > 500) {		// 500 번 반복(answer 값)보다 많아지면 -1
                answer = -1;
                break;
                
            } 
        }
        return answer;
    }
}