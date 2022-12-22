# We create a dictionary (NOT A LIST) for fast search times to check if we already saw a number in the array before.
# One line solution -- calling set() removes the duplicates of the array, so we can just compare len(nums) to len(set(nums))

class Solution(object):
    def containsDuplicate(self, nums):
        d = {}
        for i in nums:
            if i not in d:
                d[i] = 0
            else:
                return True
        return False