import java.util.Arrays;

public class Solution30 {
    public int solution(int[] numbers) {
        // 배열을 정렬하여 코딩했다.
        Arrays.sort(numbers);

        int answer = numbers[numbers.length -1] * numbers[numbers.length -2];

        return answer;
    }
}