import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10; // 마지막 자릿수를 더함
            n /= 10; // 마지막 자릿수를 제거
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(123)); // 6
        System.out.println(sol.solution(987)); // 24
    }
}
