import java.util.Arrays;


public class Solution7 {
    public int solution(int[] array) {
        int answer = 0;

        if (array.length % 2 != 0) {

            Arrays.sort(array);

            answer = array[array.length/2];

        }
        return answer;
    }
}
