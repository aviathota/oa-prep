/*
 * We create a fixed-size array of buckets to hold the occurrences of each character, and check this array to make sure both words have the same number of occurences
 */

public class 242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] b = new char[26];
        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            b[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (b[i] != 0) return false;
        }
        return true;
    }
}