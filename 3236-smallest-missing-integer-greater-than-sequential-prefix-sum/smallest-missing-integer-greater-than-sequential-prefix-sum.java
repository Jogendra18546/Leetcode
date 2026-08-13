class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0],i=0;
        for( i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int j=i-1;j<nums.length;j++){
            hs.add(nums[j]);
        }
        
        while(hs.contains(sum)){
            sum++;
        }
        return sum;
    }
}