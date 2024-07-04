public class Solution29 {
    // 순서쌍이라는 키워드 때문에 배열을 사용해야한다는 생각에 잠겨있었다.
    // 하지만 문제의 의도는 n값의 약수를 찾는 것이라는 것을 알게되어서 약수를 찾아내는 코딩을 햇다.
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}