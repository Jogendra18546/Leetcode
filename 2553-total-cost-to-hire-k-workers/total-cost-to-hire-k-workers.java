class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer>head=new PriorityQueue<>();
        PriorityQueue<Integer>tail=new PriorityQueue<>();
        for(int i=0;i<candidates;i++) head.add(costs[i]);
        for(int i=Math.max(candidates,costs.length-candidates);i<costs.length;i++){
            tail.add(costs[i]);
        }
        long ans=0;
        int nextHead=candidates;
        int nextTail=costs.length-candidates-1;
        while(k-->0){
            if(tail.isEmpty()||!head.isEmpty()&&head.peek()<=tail.peek()){
                ans+=head.poll();
                if(nextHead<=nextTail){
                    head.add(costs[nextHead]);
                    nextHead++;
                }
            }
            else{
                ans+=tail.poll();
                if(nextHead<=nextTail){
                    tail.add(costs[nextTail]);
                    nextTail--;
                }
            }
        }
        return ans;
    }
}