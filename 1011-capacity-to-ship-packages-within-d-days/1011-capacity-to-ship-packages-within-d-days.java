class Solution {
    private int fun(int[] nums,int c){
        int n = nums.length ;
        int l = 0;
        int d = 1;
        for(int i =0;i<n;i++){
            if(l + nums[i] >c){
                d += 1 ;
                l = nums[i] ;
            }
            else{
                l += nums[i] ;
            }
        }
        return d ;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE ;

        for(int num:weights){
            sum += num ;
            max = Math.max(num,max) ;
        }
        int l = max;
        int r = sum ;
        int ans  = -1;
        while(l<=r){
            int m = l +(r-l)/2 ;
            int cdays = fun(weights,m) ;
            if(cdays<= days){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
}