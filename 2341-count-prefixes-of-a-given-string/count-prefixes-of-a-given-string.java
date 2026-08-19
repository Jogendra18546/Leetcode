class Solution {
    public int countPrefixes(String[] words, String s) {
        int res=0;
        for(String a:words){
            int i=0,c=0;
            for( i=0;i<Math.min(a.length(),s.length());i++){
                if(a.charAt(i)!=s.charAt(i))
                break;
                else
                c++;
            }
            if(i==a.length())
            res++;
        }
        return res;
    }
}