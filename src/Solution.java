public class Solution {

    public int solution(int s, int n) {

        int answer = 0;

        if (n % s == 0) {
            answer = n / s;
        } else {
            answer = n / s + 1;
        }
        return answer;
    }
}
