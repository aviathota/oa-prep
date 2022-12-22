# We create a dict which stores each character and it's number of occurences (+1 for in s, -1 for in t). We then check to make sure the net sum of all characters is 0.

class Solution(object):
    def isAnagram(self, s, t):
        d = {}
        for c in s:
            if c in d:
                d[c] += 1
            else:
                d[c] = 1
        for c in t:
            if c not in d:
                return False
            else:
                d[c] -= 1
        for i in d:
            if d[i] != 0:
                return False
        return True