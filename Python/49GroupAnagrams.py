# We use defaultdict for this solution, which is a special type of dict that lets you select a default value if a key isn't yet in the dict. We set this default value to be an empty list.
# We make use of Python's default sorted() method, which sorts the String by its characters. We also turn this into a tuple, since you can't pass an array as a key in a dict.

from collections import defaultdict

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d = defaultdict(list)
        for s in strs:
            d[tuple(sorted(s))].append(s)
        return list(d.values())