1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        int nearx = Math.max(x1,Math.min(x2,xCenter)) ;
4        int neary  = Math.max(y1,Math.min(y2,yCenter)) ;
5
6        int deltax = xCenter-nearx ;
7        int deltay = yCenter-neary ;
8
9        return (deltax*deltax+deltay*deltay) <= (radius*radius) ;
10    }
11}