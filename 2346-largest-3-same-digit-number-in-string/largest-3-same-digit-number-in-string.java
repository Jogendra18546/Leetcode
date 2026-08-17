class Solution {
    public String largestGoodInteger(String num) {
        int res=-1;
        for(int i=0;i<=num.length()-3;i++){

            if((num.charAt(i)==num.charAt(i+1))&&(num.charAt(i+1)==num.charAt(i+2))){
                res=Math.max(res,Integer.parseInt(num.substring(i,i+3)));
            }
        }
        if(res==-1) return "";
        if(res==0) return"000";
        return Integer.toString(res);
    }
}