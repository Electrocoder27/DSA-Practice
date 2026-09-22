1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int n = arr.length ;
4        for(int i =0;i<n;i++){
5            if(arr[i] <=k){
6                k++;
7            }
8            else{
9                break ;
10            }
11        }
12        return k ;
13    }
14}