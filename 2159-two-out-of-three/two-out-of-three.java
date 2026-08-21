class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int freq1[]=new int[101];
        int freq2[]=new int[101];
        int freq3[]=new int[101];

        for(int i:nums1) 
        if(freq1[i]<1)freq1[i]++;
        for(int i:nums2) 
        if(freq2[i]<1)freq2[i]++;
        for(int i:nums3) 
        if(freq3[i]<1)freq3[i]++;
        List<Integer> res= new ArrayList<>();
        for(int i=1;i<101;i++){
            if((freq1[i]>=1&&freq2[i]>=1)||(freq2[i]>=1&&freq3[i]>=1)||(freq1[i]>=1&&freq3[i]>=1)){
                res.add(i);
            }
        }
        return res;
    }
}