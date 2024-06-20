public class Solution16 {
    public int solution(String my_string) {
        int answer = 0;

        // 빈 문자열을 선언한다
        String replace = "";

        // 빈문자열에 마이스트링의 값을 모두 소문자로 변경하고 모든 알파벳을 ""로 대체한다
        replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");

        // 스트링 배열에 ""를 기준으로 쪼개서 배열을 나눠 저장한다
        String[] arry = replace.split("");

        // 포문을 돌려서 배열의 인덱스에 있는 문자열을 정수로 변환하여 answer에 더해준다
        for (int i = 0; i < arry.length; i++) {
            answer += Integer.parseInt(arry[i]);
        }

        return answer;

    }
}
