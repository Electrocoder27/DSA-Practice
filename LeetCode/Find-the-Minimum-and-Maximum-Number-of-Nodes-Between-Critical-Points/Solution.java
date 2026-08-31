1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int [] res = new int[2];
14        ListNode node = head ;
15        ListNode prevnode= head ;
16        ArrayList<Integer> list  = new ArrayList<>() ;
17        int i = 1;
18        while(node.next != null){
19            if(node.val <prevnode.val && node.val< node.next.val){
20                list.add(i) ;
21            }
22            else if(node.val>prevnode.val && node.val>node.next.val){
23                list.add(i) ;
24            }
25            i++;
26            prevnode = node ;
27            node = node.next ;
28        }
29
30        int mindist = Integer.MAX_VALUE ;
31        int maxdist  = Integer.MIN_VALUE ;
32        for(int j = 0;j<list.size()-1;j++){
33            mindist = Math.min(mindist,Math.abs(list.get(j)-list.get(j+1))) ;
34        }
35        if(list.size()>1){
36            maxdist = list.get(list.size()-1) - list.get(0) ;
37        }
38        
39        res[0] = mindist == Integer.MAX_VALUE? -1:mindist;
40        res[1] = maxdist == Integer.MIN_VALUE? -1:maxdist;
41        return res;
42    }
43}