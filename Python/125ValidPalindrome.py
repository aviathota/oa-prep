# We first convert the string into a lowercase version of itself using lower(). Then, we take the alphanumeric characters of s using a for loop and isalnum().
# We use join() instead of creating a new string and appending to it because it's faster.
# The last line checks if the string is the same forwards and backwards (i.e. is it a palindrome).

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = lower(s)
        news = "".join(i for i in s if i.isalnum())
        return news == news[::-1]