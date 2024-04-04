import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public int solution(String[] arr, String[] arr1) {
        int answer = 0;

        for (int i = 0; i < arr.length;  i++) {

            for (int s = 0; s < arr1.length; s++) {

                if (arr[i].equals(arr1[s])) {
                    answer += 1;
                }
            }

        }

        return answer;
    }
}