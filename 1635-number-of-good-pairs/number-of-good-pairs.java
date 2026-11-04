class Solution {
    public int numIdenticalPairs(int[] nums) {
        int freq[]=new int[101];
        for(int i:nums) freq[i]++;
        int ans=0;
        for(int i=0;i<101;i++){
            if(freq[i]>1){
                ans+=freq[i]*(freq[i]-1)/2;
            }
        }
        return ans;
    }
}