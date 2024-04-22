public class Solution8 {
    public int[] solution(int n) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i += 2) {
             a++;
        }

        int[] answer = new int[a];


        if (b < answer.length){
            for (int c = 1; c <= n; c += 2) {

                answer[b++] = c;
            }
        }
        return answer;
    }
}

