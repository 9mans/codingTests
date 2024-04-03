import java.util.Arrays;

class Solution1 {
    public int solution(int[] s) {
        int answer = 0;

        Arrays.sort(s);

        if (s[2] < s[0] + s[1]) {

            answer = 1;
        } else {

            answer = 2;
        }





        return answer;
    }
}