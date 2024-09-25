class Solution {

    // https://leetcode.com/problems/find-the-count-of-numbers-which-are-not-special/
    
    public int nonSpecialCount(int l, int r) {
        int notSpecialCount = 0;
        
        for (int i = l; i <= r; i++) {
            if (!isSpecial(i)) {
                notSpecialCount++;  // if not special, then ++
            }
        }
        
        return notSpecialCount;
    }
    
    private boolean isSpecial(int num) {
        int divisorCount = 0;
        
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;  // dividor i
                if (i != num / i && i != 1) {
                    divisorCount++;  // dividor num / i
                }
            }
        }
        
        return divisorCount == 2;
    }
}
