public class Solution14 {

    public String solution(String my_String) {

        StringBuilder sb = new StringBuilder(my_String);

        // 스트링빌더를 사용한 이유는 스레드 환경을 고려할 필요가없어서 사용 스레드환경을 고려할때는 스트링버퍼를 사용
        // 리버스 메서드는 해당 문자 전체를 뒤집음 투스트링 메서드는 해당 문자를 스트링으로 변환함
        return sb.reverse().toString();
    }
}
