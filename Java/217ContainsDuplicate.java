/* 
We create a HashSet to store the integers that have already been parsed through, so we can quickly look up if we've seen them in the future. 
*/

public class 217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for (int i : nums) {
            if (!a.contains(i)) {
                a.add(i);
            } else {
                return true;
            }
        }
        return false;
    }
}

