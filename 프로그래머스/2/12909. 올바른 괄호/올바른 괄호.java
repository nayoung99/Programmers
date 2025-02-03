import java.util.*;

public class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        
        return count == 0;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("()()")); // true
        System.out.println(sol.solution("(())()")); // true
        System.out.println(sol.solution(")()(")); // false
        System.out.println(sol.solution("(()(")); // false
    }
}
