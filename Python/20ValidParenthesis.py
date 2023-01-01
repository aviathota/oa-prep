# We use a stack, choosing the deque implementation because it's much more efficient for large stacks. 

from collections import deque

class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = deque()
        for a in s:
            if a == '(':
                stack.appendleft(')')
            elif a == "[":
                stack.appendleft(']')
            elif a == '{':
                stack.appendleft('}')
            else:
                if len(stack) == 0:
                    return False
                if stack[0] != a:
                    return False
                stack.popleft()
        return len(stack) == 0