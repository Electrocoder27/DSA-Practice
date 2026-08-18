class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length ;
        if(k==n){
            int maxval =-1;
            for(int num:nums){
                maxval = Math.max(maxval,num) ;
            }
            return maxval ;
        }
        HashMap<Integer,Integer> freq = new HashMap<>() ;
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1) ;
        }
        if(k==1){
            int ans = -1;
            for(int num:nums){
                if(freq.get(num)==1){
                    ans = Math.max(num,ans) ;
                }
            } 
            return ans ;
        }
        //for k <1,n>;
        int ans = -1 ;
        if(freq.get(nums[0]) ==1){
            ans = Math.max(nums[0],ans) ;
        }
        if(freq.get(nums[n-1]) == 1){
            ans = Math.max(ans,nums[n-1]);
        }
        return ans ;
    }
}