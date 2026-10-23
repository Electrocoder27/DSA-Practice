class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length ;
        int asc_count = 0;
        int dsc_count = 0;
        for(int i =1;i<n;i++){
            asc_count += nums[i] == (nums[i-1]+1)%n ? 1:0;
            dsc_count += (nums[i]+1)%n == nums[i-1] ?1:0;
        }
        if(asc_count == n-1 && nums[0] == 0){//already sorted..........
            return 0 ;
        }
        if(asc_count == n-1){
            int left = n-nums[0] ;
            int right = 1+ (nums[n-1]+1)+1;
            return Math.min(left,right) ;
        }
        if(dsc_count == n-1){
            int l = n-nums[n-1] +1;
            int r = (nums[0]+1)%n +1 ;
            return Math.min(l,r) ;
        }


        return -1 ;
    }
}