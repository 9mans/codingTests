import java.util.Arrays;

public class Solution25 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int k = 0;

        for (int i = num1; i < num2; i++) {

            answer[k++] = numbers[i];
        }

        return answer;
    }
}

// 이런 직관적인 방법 말고도 Arrays.copyOfRange() 메서드를 사용하여 해결할 수도 있다. (1, 2, 3)안에 1 = 복사할 배열, 2 = 복사를 시작할 인덱스 위치, 3 = 복사되는 마지막 인덱스 위치