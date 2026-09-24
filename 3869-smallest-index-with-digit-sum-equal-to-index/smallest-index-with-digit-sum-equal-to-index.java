class Solution {
    public int smallestIndex(int[] nums) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=0;
            while(a>0){
                int l=a%10;
                b+=l;
                a/=10;
            }
            if(b==i){
                res=Math.min(i,res);
            }
        }
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
}