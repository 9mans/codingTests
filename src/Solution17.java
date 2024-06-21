public class Solution17 {

    public String solution(String cipher, int code) {
        String answer = "";

        // int i = code -1 인 이유는 index는 0부터 시작하기 때문에 code의 배수의 첫번째 수에 해당하는 index는 -1이다
        // charAt() 메서드는 인덱스에 해당하는 문자를 반환한다
        // for문을 풀어쓰면 code의 값에 해당하는 인덱스부터 문자열 cipher의 길이까지 코드의 배수에 해당하는 위치의 문자만 answer에 추가시킨다
        for (int i = code -1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}