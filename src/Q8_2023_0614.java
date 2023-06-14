public class Q8_2023_0614 {
    /*
    시저 암호

    문제 설명
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

    제한 조건
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.

    입출력 예
    s	    n	result
    "AB"	1	"BC"
    "z" 	1	"a"
    "a B z"	4	"e F d"

     */
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("bc", 50));
    }


    static class Solution {
        public String solution(String s, int n) {
            String answer = "";
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                // a~z 97~122
                // A~Z 65~90
                // "%26" 을 한 이유는 만약 "z"(123)를 넘었을 경우
                if(Character.isLowerCase(c)){ // 만약 소문자라면
                    c = (char)((c-97+n)%26 + 97);
                }else if(Character.isUpperCase(c)){// 대문자라면
                    c = (char)((c-65+n)%26 + 65);
                }
                sb.append(c);

            }


            return sb.toString();
        }
    } // class Solution
}
