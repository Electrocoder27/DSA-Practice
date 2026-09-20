class Solution {
    public int reverseDegree(String s) {
        int num = 0;
        for(int i =0;i<s.length();i++) {
            char ch = s.charAt(i) ;
            num += (('z' - ch)+1)*(i+1) ;
        }

        return num ;
    }
}