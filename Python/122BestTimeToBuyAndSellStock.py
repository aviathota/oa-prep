# We only want to parse through the list once, so we keep track of the current buy price (the current minimum) and also the maximum profit we see so far.

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buy = prices[0]
        profit = 0

        for p in prices:
            if p < buy:
                buy = p
            else:
                profit = max(profit, p - buy)

        return profit