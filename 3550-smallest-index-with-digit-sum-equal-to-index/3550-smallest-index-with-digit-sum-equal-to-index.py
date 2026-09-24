class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        n = -1
        for i in range(len(nums)):
            sum = 0
            a = nums[i]
            while a > 0:
                d = a % 10
                sum += d
                a //= 10
            if sum == i:
                return i
        return -1
