import java.util.Arrays;

public class Solution25 {
    // 이렇게 코드를 짜니 인덱스의 값에 따라 에러가 발생하기도 함...
//    public int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int[num2 - num1 + 1];
//        int k = 0;
//
//        for (int i = num1; i < num2; i++) {
//
//            answer[k++] = numbers[i];
//        }
//
//        return answer;
//    }
//}
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2);

        return answer;
    }
}
// 이런 직관적인 방법 말고도 Arrays.copyOfRange() 메서드를 사용하여 해결할 수도 있다. (1, 2, 3)안에 1 = 복사할 배열, 2 = 복사를 시작할 인덱스 위치, 3 = 복사되는 마지막 인덱스 위치
// 인덱스의 마지막값은 반환하지 않는다 마지막값 까지 반환하고자하면 +1을 해줘야한다