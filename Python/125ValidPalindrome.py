class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = lower(s)
        news = "".join(i for i in s if i.isalnum())
        return news == news[::-1]