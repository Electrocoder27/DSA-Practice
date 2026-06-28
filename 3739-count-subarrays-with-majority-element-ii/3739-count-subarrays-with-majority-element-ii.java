class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length ;
        HashMap<Integer,Integer> map = new HashMap<>();
        int cumsum =0;
        map.put(cumsum,map.getOrDefault(cumsum,0)+1) ;
        int leftpossible = 0;
        long res = 0;
        for(int i =0;i<n;i++){
            if(nums[i] ==target){
                leftpossible +=map.getOrDefault(cumsum,0) ;
                cumsum +=1 ;
                
            }
            else{
                cumsum -=1;
                leftpossible -= map.getOrDefault(cumsum,0) ;
                //map.put(cumsum,map.getOrDefault(cumsum,0)+1) ;
            }
            map.put(cumsum,map.getOrDefault(cumsum,0)+1) ;
            res += leftpossible ;
        }

        return res ;
    }
}