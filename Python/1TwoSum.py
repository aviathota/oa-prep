# Just use a dict to track each number and index pair and use it for fast lookup.

class Solution(object):
    def twoSum(self, nums, target):
        d = {}
        for index, val in enumerate(nums):
            if (target - val) in d:
                return [index, d[target - val]]
            else:
                d[val] = index
        return