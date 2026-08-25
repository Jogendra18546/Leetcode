class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        for(int i=k;;i+=k){
            if(!hs.contains(i)) return i;
        }
    }
}