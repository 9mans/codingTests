

public class Solution11 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < num_list.length; i++) {

            if (i < n) {
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}