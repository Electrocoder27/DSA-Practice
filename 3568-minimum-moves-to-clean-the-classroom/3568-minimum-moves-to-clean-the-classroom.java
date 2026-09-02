class Solution {
    class state{
        int r;
        int c;
        int e; 
        int litmask ;
        state(int r,int c,int e,int litmask){
            this.r = r ;
            this.c= c;
            this.e = e;
            this.litmask = litmask ;
        }
    }
    public int minMoves(String[] classroom, int energy) {
        int n = classroom.length ;
        int m = classroom[0].length();

        int startr = -1;
        int startc = -1;
        int littercount = 0;
        //bitmasking litterID
        int [][] litterid = new int[n][m] ;
        for(int i =0;i<n;i++){
            Arrays.fill(litterid[i],-1) ;
        }
        
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                char ch = classroom[i].charAt(j) ;
                if(ch == 'S'){
                    startr = i;
                    startc = j;
                }else if(ch == 'L'){
                    litterid[i][j] = littercount++ ;
                }
            }
        }

        int targetmask = (1<<littercount) -1;
        Queue<state> q = new LinkedList<>() ;
        boolean[][][][] vis = new boolean[n][m][energy+1][1<< littercount] ;

        int initialmask = 0;
        if(classroom[startr].charAt(startc) =='L'){
            initialmask  |= (1<<litterid[startr][startc]) ;
        }
        q.add(new state(startr,startc,energy,initialmask)) ;
        vis[startr][startc][energy][initialmask] = true ;
        int moves = 0;
        int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}} ;

        while(!q.isEmpty()){
            int s = q.size() ;

            while(s-->0){
                state curr = q.poll() ;

                if(curr.litmask == targetmask){
                    return moves;
                }
                if(curr.e ==0){
                    continue ;
                }

                for(int []d:dir){
                    int nr = curr.r+d[0] ;
                    int nc = curr.c+d[1] ;
                    
                    if(nr<0 || nr>=n || nc<0 || nc>=m || classroom[nr].charAt(nc) == 'X'){
                        continue;
                    }

                    int nexte = curr.e-1;
                    char celltype =classroom[nr].charAt(nc) ;

                    if(celltype == 'R'){
                        nexte= energy ;
                    }

                    int nextmask = curr.litmask ;
                    if(celltype =='L'){
                        nextmask |= (1<<litterid[nr][nc]) ;
                    }
                    if(!vis[nr][nc][nexte][nextmask]){
                        vis[nr][nc][nexte][nextmask] = true ;
                        q.add(new state(nr,nc,nexte,nextmask));
                    }
                }
            }
            moves++;
        }
        return -1 ;
    }
}