1class Solution:
2    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
3        n = len(nums)
4        i =0
5        res = 0
6        freq = {}
7
8        for j in range(n):
9            freq[nums[j]] = freq.get(nums[j],0)+1
10
11            while freq[nums[j]] >k:
12                freq[nums[i]] -= 1
13                i +=1
14
15            res = max(res,j-i+1)
16
17        return res        