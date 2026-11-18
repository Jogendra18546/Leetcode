class Solution {
    public int rob(int[] nums) {
        int m1=0,m2=0;
        for(int i=0;i<nums.length;i++){
            int max=Math.max(m1,m2+nums[i]);
            m2=m1;
            m1=max;
        }
        return m1;
    }
}