1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>() ;
4
5        for(int i = 0;i<numRows;i++){
6            List <Integer> row = new ArrayList <>() ;
7            //Each row starts with 1.......'
8            row.add(1) ;
9
10            //computing the intermediate value............
11            for(int j =1;j<i;j++){
12                int val = result.get(i-1).get(j-1) + result.get(i-1).get(j) ;
13                row.add(val) ;
14            }
15
16            //each row ends with 1 if i > 0....................
17            if(i>0){
18                row.add(1) ;
19            }
20            result.add(row) ;
21        }    
22
23        return result ;  
24    }
25}