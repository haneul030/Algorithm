class Solution {
    public int[] solution(long n) {
        
        String number = Long.toString(n);       // long형 n 을 String으로 변경
        int[] answer = new int[number.length()];

        // result 배열에 String형 number을 한 글자씩 자르기
        String result[] = new String[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[i] = number.substring(i, i + 1);
        }
        
        // result2 배열에 result 배열에 존재하는 데이터 거꾸로 넣기
        String result2[] = new String[number.length()];
        String number2 = "";
        for (int i = 0; i < number.length(); i++) {
            result2[i] = result[number.length() - i - 1];
            number2 += result2[i];
        }
        
        // String형 number2을 int형 배열 answer에 넣기
        for (int i = 0; i < number.length(); i++) {
            answer[i] = number2.charAt(i) - '0';           
        }   
        
        return answer;
    }
}