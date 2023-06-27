import java.util.*;
public class Q12_2023_0627 {
    /*
    정수 내림차순으로 배치하기

    문제 설명
    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.

    입출력 예
    n	    return
    118372	873211
    */

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(118372));
    }

    static class Solution {
        public long solution(long n) {
            long answer = 0;

            String str = Long.toString(n);
            String[] ary = str.split(""); // 배열 형식으로 자르기

            Arrays.sort(ary, Collections.reverseOrder());
            str = String.join("", ary);
            answer = Long.parseLong(str);

            return answer;
        }
    }
}
