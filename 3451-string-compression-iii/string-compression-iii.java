class Solution {
    public String compressedString(String word) {
        StringBuilder res=new StringBuilder("");
        int i=0;
        while(i<word.length()){
            int j=0;
            char ch=word.charAt(i);
            while(i<word.length()&&j<9&&ch==word.charAt(i)) {
                i++;
                j++;
            }
            res.append(j).append(ch);
        }
        return res.toString();
    }
}