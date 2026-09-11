1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        int n = nums.length ;
4        List<List<Integer>> res =  new ArrayList<>() ;
5        Arrays.sort(nums) ;
6        for(int i =0;i<n;i++){
7            if (i > 0 && nums[i] == nums[i - 1]) continue;
8            for(int j =i+1;j<n;j++){
9                if(j != i+1 && nums[j] == nums[j-1]){
10                    continue ;
11                }
12                int k = j+1;
13                int l = n-1;
14                while(k<l){
15                    long sum = (long) nums[i] +nums[j]+nums[k]+nums[l] ;
16                if(sum == target){
17                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
18                    k++;
19                    l--;
20                    while(k<l && nums[k] == nums[k-1]){
21                        k++;
22                    }
23                    while(k<l && nums[l] == nums[l+1]){
24                        l--;
25                    }
26                }
27                else if(sum > target){
28                    l--;
29                }
30                else {
31                    k++;
32                }
33                }
34                
35            }
36        }
37        return res ;
38    } 
39}