class Solution {
    public int solution(int n) {
		int answer = 1;
		boolean loof = true;

		while(loof){
			if(n%answer != 1){
				answer++;    //  n % answer != 1일 때
			}else{
				loof = false; // n % answer == 1일 때
			}
		}
		return answer;
    }
}