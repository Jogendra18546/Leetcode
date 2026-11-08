class Solution {
    public int findDuplicate(int[] nums) {
        boolean res[]=new boolean[nums.length];
        int j=0;
        for(int i:nums){
            if(res[i]) return i;
            res[i]=true;
        }
        return j;
    }
}