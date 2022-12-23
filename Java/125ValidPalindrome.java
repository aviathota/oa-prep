/*
 * This solution uses two pointers (left and right) and moves along and compares the string's alphanumeric characters.
 */

public class 125ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0; 
        int r = s.length() - 1;
        while (l < r) {
            while (l <= r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;
            while (r >= 0 && !Character.isLetterOrDigit(s.charAt(r)))
                r--;
            if (l < r && Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
