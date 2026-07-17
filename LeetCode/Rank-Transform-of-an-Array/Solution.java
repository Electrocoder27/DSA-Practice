1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int n = arr.length ;
4        int []temp = new int[n] ;
5        int res[] = new int[n] ;
6        for(int i =0;i<n;i++){
7            temp[i] = arr[i] ;
8        }
9        Arrays.sort(temp) ;
10        HashMap<Integer,Integer> mp = new HashMap<>() ;
11        int r =1 ;
12        for(int i =0;i<n;i++){
13            if(!mp.containsKey(temp[i])){
14                mp.put(temp[i],r);
15                r++;
16            }            
17        }
18
19        for(int i =0;i<n;i++){
20            res[i] = mp.get(arr[i]) ;
21        }
22        return res ;
23    }
24}