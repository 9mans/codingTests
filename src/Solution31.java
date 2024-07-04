public class Solution31 {
    public String solution(String my_string) {

        //replaceAll을 사용해서 문제를 해결하였다.
        //replaceAll은 ("문자열에 해당하는 문자를", "해당 문자열로 교체하여 반환하는 스트링의 메서드이다")
        String answer = my_string;
        String[] a = {"a", "e", "i", "o", "u"};

        for (String v : a) {

            answer = answer.replaceAll("v", "");
        }

        return answer;
    }
}