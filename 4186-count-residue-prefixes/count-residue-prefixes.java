class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> hs=new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
                hs.add(s.charAt(i));
                if(hs.size()==(i+1)%3)
                res++;
                if(hs.size()>2)
                break;
        }
        return res;
    }
}