class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>() ;
        for(int r[]:reservedSeats){
            map.putIfAbsent(r[0], new ArrayList<>());
            map.get(r[0]).add(r[1]);
        }
        count += (n-map.size())*2;  
        for(ArrayList<Integer> r:map.values()){
            boolean left = false ;
            boolean middle = false ;
            boolean right = false ;

            for(int s: r){
                if(s>=2 && s<=5){
                    left = true ;
                }
                if(s>=6 && s<=9){
                    right = true ;
                }
                if(s>=4 && s<=7){
                    middle = true ;
                }
            }
            if(!left && !right){
                    count += 2 ;
            }
            else if(!left || !middle || !right){
                count += 1 ;
            }
        }
        return count ;
    }
}