class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
            if(mp.getValue()==1){
                return mp.getKey();
            }
        }
        return -1;
    }
}