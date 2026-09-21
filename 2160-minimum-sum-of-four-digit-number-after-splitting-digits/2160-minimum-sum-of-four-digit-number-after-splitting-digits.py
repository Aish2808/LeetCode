class Solution:
    def minimumSum(self, num: int) -> int:
        a = []
        while num > 0:
            d = num % 10
            a.append(d)
            num //= 10
        a.sort()
        n1 = a[0] * 10 + a[2]
        n2 = a[1] * 10 + a[3]
        s = n1 + n2
        return s
