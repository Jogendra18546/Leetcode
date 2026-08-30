class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<3) return nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIdx=-1,maxIdx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
        }
        int n=nums.length;
        int l=Math.max(minIdx+1,maxIdx+1);
        int r=Math.max(n-minIdx,n-maxIdx);
        int mix=Math.min(minIdx+1,maxIdx+1)+
        Math.min(n-minIdx,n-maxIdx);
        return Math.min(l,Math.min(mix,r));
    }
}