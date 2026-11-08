class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int j=0;
        for(int i:nums){
            if(hs.contains(i)) return i;
            else hs.add(i);
        }
        return j;
    }
}