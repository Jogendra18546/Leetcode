class Solution {
    public int maxDepth(String s) {
        int max=0,c=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
            }
            else if(ch==')'){
                c--;
            }
            max=Math.max(c,max);
        }
        return Math.max(c,max);
    }
}