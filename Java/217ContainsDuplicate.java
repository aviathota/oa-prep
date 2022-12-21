class 217ContainsDuplicate {
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