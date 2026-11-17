class Solution {
    public int minimumOperations(int[] nums) {
        int i=0,n=nums.length;
        for(int j=0;j<n;j+=3,++i){
            if(isDis(nums,j)){
                return i;
            }
        }
        return i;
    }
    public boolean isDis(int nums[],int s){
        HashSet<Integer> hs=new HashSet<>();
        for(int a=s;a<nums.length;a++){
            if(hs.contains(nums[a])) return false;
            hs.add(nums[a]);
        }
        return true;
    }
}