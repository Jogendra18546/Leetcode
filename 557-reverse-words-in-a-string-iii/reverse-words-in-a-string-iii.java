class Solution {
    public String reverseWords(String s) {
        s+=" ";
        StringBuilder res=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                res.append(sb.reverse());
                if(i<s.length()-1)
                res.append(" ");
                sb=new StringBuilder();
            }
        }
        return res.toString();
    }
}