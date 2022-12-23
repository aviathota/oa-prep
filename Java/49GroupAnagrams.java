/*
 * Essentially uses a hashmap to store a key value (char occurrences) and a list of all strings that have the same char occurrences.
 * We can use String.valueOf() with the generated buckets table as the key value.
 */

class 49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            String k = String.valueOf(bucketGen(s));
            if (!m.containsKey(k)) {
                ArrayList<String> a = new ArrayList<>();
                a.add(s);
                m.put(k, a);
            } else {
                m.get(k).add(s);
            }
        }
        return new ArrayList<>(m.values());
    }

    // helper method that generates the number of occurrences of each letter in a word
    private char[] bucketGen(String str) {
        char[] ret = new char[26];
        for (int i = 0; i < str.length(); i++) {
            ret[str.charAt(i) - 'a']++;
        }
        return ret;
    }
}