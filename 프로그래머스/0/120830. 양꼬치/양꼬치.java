class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int f1 = 12000 * n; 
        int freeDrinks = n / 10; 
        int f2 = 2000 * (k - freeDrinks); 
        answer = f1 + f2;
        return answer;
    }
}