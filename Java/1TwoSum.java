/*
 * We create a HashMap containing each number and its index for fast lookup.
 */

public class 1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(target - nums[i])) {
                int[] ans = {i, h.get(target - nums[i])};
                return ans;
            } else {
                h.put(nums[i], i);
            }
        }
        return null;
    }
}
