class Solution {
    public int[] divisibilityArray(String word, int m) {
        int res[]=new int[word.length()];
        long rem=0;
        for(int i=0;i<word.length();i++){
            int d=word.charAt(i)-'0';
            rem=(rem*10+d)%m;
            if(rem==0) res[i]=1;
            else res[i]=0;
        }
        return res;
    }
}