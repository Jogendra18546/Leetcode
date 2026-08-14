class Solution {
    public int maximumLengthSubstring(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            char ch=s.charAt(i);
            freq[ch-'a']++;
            for(int j=i+1;j<s.length();j++){
                char ch1=s.charAt(j);
                freq[ch1-'a']++;
                if(freq[ch1-'a']>2){
                    break;
                }
                res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}