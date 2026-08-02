class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length-1;
        int alice=0,bob=0;
        int left=0,right=piles.length-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(piles[left]>=piles[right]){
                    alice+=piles[left++];
                }
                else{
                    alice+=piles[right--];
                }
            }
            else{
                if(piles[left]<=piles[right]){
                    bob+=piles[left++];
                }
                else{
                    bob+=piles[right--];
                }
            }
        }
        return alice>=bob;
    }
}