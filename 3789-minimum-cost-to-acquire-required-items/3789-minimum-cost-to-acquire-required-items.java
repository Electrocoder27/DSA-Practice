class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long x = Math.min(need1, need2); // shared part

        long costA = x * costBoth + (need1 - x) * cost1 + (need2 - x) * cost2;
        long costB = (long)Math.max(need1, need2) * costBoth;
        long costC = (long)need1 * cost1 + (long)need2 * cost2;

        // replace cost1 part using extra typeBoth
        long costD = (long)need1 * costBoth + (long)Math.max(0, need2 - need1) * cost2;

        // replace cost2 part using extra typeBoth
        long costE = (long)need2 * costBoth + (long)Math.max(0, need1 - need2) * cost1;

        return Math.min(costA, Math.min(costB, Math.min(costC, Math.min(costD, costE))));
    }
}