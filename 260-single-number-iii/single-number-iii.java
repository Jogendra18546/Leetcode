class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
        int res[]=new int[2];
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(mp.getValue()==1){
                res[i++]=mp.getKey();
            }
        }
        return res;
    }
}