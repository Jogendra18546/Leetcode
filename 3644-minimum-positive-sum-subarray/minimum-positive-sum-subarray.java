class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int max=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            for(int j=0;i+j<=n;j++){
                int sum=0;
                for(int k=j;k<j+i;k++){
                    sum+=nums.get(k);
                }
                if(sum>0&&sum<max) max=sum;
            }
        }
        if(max==Integer.MAX_VALUE) return -1;
        return max;
    }
}