class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        for(int i:arr1){
            boolean ok=true;
            for(int j:arr2){
                ok&=Math.abs(i-j)>d;
            }
            res+=ok?1:0;
        }
        return res;
    }
}