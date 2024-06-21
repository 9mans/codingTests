public class Solution18 {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {

            // Character.is, to UpperCase, LowerCase 해당 문자가 is 대문자인지 to 대문자로 바꾼다
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}