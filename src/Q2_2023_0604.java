import java.util.*;
public class Q2_2023_0604 {

    /*
    문자열 내림차순으로 배치하기

    문제 설명
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

            제한 사항
    str은 길이 1 이상인 문자열입니다.

    입출력 예
    s	        return
    "Zbcdefg"	"gfedcbZ"

    */
    public static void main(String[] args) {

        String s = "Zbcdefg";

        // char형 문자를 각각 배열에 담는다
        char[] str = s.toCharArray();

        // 오름차순으로 정렬한다.
        Arrays.sort(str);

        // 1. char형 str배열을 String형으로 변환
        // 2. 변환된 문자열을 reverse함수로 뒤집기
        // 3. toString으로 문자열 변환

        System.out.println(new StringBuilder(new String(str)).reverse().toString());


        // 결과
        // gfedcbZ


        return;
    }

}
