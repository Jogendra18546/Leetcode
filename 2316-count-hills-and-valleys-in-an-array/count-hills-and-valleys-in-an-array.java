class Solution {
    public int countHillValley(int[] nums) {
        int res=0;
        for(int i=1;i<nums.length-1;++i){
            int l=0,r=0;
            if(nums[i]==nums[i-1]) continue;
            for(int j=i-1;j>=0;--j){
                if(nums[i]<nums[j]){
                    l=1;
                    break;
                }
                if(nums[i]>nums[j]){
                    l=-1;
                    break;
                }
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    r=1;
                    break;
                }
                if(nums[i]>nums[j]){
                    r=-1;
                    break;
                }
            }
            if(l==r&&l!=0) ++res;
        }
        return res;
    }
}