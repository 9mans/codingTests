import java.util.Arrays;

public class Solution26 {
    public int solution(int n, String control) {
        int answer = n;

        // 스위치 문을 사용하면 더 간결하게 코드를 표현할 수 있다
        // 스위치 문을 잘 사용하지 않다보니 어떤 식으로 코딩해야하는지 정확히 알지못해 이런 코드를 작성했다
        // 스위치 문의 문법을 한번 더 확인해보는 시간이 필요하다.
        for (int i = 0; i < control.length(); i++) {

            char a = control.charAt(i);

            if (a == 'w') {
                answer += 1;
            } else if (a == 's') {
                answer -= 1;
            } else if (a == 'd') {
                answer += 10;
            } else {
                answer -= 10;
            }
        }

        return answer;
    }

}