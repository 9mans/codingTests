public class Solution21 {
    public String solution(String my_string, int n) {

        // subString을 사용하면 해당 인덱스부터 시작하여 문자열을 출력한다
        // () 매개변수에 값을 두 개를 넣으면 a ~ b까지의 문자열이 출력되고 끝인덱스는 출력되지 않는다
        String answer = my_string.substring(my_string.length() -n);

//          참 이상하게 해결했다,,,,,
//        String answer = "";
//
//        StringBuffer bf = new StringBuffer(my_string);
//        String reverse = bf.reverse().toString();
//
//        for (int i = 0; i < n; i++) {
//
//            answer += reverse.charAt(i);
//        }
//
//        StringBuffer bff = new StringBuffer(answer);
//        String answer1 = bff.reverse().toString();
//
//        return answer1;
        return answer;
    }
}