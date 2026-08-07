class Solution {
    public int longestNiceSubarray(int[] nums) {
        int m=0,j=0,max=0;
        for(int i=0;i<nums.length;i++){
            while((m&nums[i])!=0){
                m^=nums[j];
                j++;
            }
            m|=nums[i];
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}