class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length ;
        long ans = 0L ;
        long currcnt  = 0;
        for(int num:nums){
            if(num>=minK && num <=maxK){
                currcnt++;
            }
            else{
                ans += currcnt*(currcnt+1)/2;
                currcnt = 0;
            }
        }
        ans += currcnt*(currcnt+1)/2;
        return ans ;
    }
}