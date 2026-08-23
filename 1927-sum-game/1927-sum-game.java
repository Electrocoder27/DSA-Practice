class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftsum = 0;
        int rightsum = 0;
        int lqcount = 0;
        int rqcount = 0;

        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                lqcount++;
            } else {
                leftsum += ch - '0';
            }
        }
        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                rqcount++;
            } else {
                rightsum += ch - '0';
            }
        }

        // If total count of '?' is odd, Alice gets the last move and always wins
        if ((lqcount + rqcount) % 2 != 0) {
            return true;
        }

        // Alice wins if Bob cannot balance the sides
        return (2 * (leftsum - rightsum)) != (9 * (rqcount - lqcount));
    }
}