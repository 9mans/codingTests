
public class Solution27 {
    public int[] solution(int[] num_list) {

        //코드의 가독성이 좋지않다....
        // 적절히 변수를 선언하는것도 가독성을 높이는 것을 알았다
        // 삼항 연산자를 사용하면 더 괜찮은 코드가 될 것이다
        // 삼항연산자 조건문 ? 1 : 2; 참이면 1번 거짓이면 2번을 반환
        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int a = num_list[num_list.length -2];
        int b = num_list[num_list.length -1];
        answer[answer.length -1] = b > a ? b-a : b * 2;

//        if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
//            answer[answer.length -1] = num_list[num_list.length -1] - num_list[num_list.length -2];
//        } else {
//            answer[answer.length -1] = num_list[num_list.length -1] * 2;
//        }
        return answer;
    }
}