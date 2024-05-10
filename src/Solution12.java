public class Solution12 {

    public int solution(int n, int k) {
        int answer = n * 12000 + (k - (int)n/10) * 2000;

        return answer;
    }
}