public class Q16_2023_0710 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1,2,5,6,7,8,0};
        System.out.println(s.solution(arr));
    }

    static class Solution {
        public int solution(int[] numbers) {
            int answer = 45;

            for(int i=0; i<numbers.length; i++){
                answer -= numbers[i];
            }

            return answer;
        }
    }

}
