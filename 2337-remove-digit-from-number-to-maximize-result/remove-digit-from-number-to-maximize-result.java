class Solution {
    public String removeDigit(String number, char digit) {
        String res="";
        for(int i=number.length()-1;i>=0;i--){
            StringBuilder s=new StringBuilder();
            if(number.charAt(i)==digit){
                String curr=number.substring(0,i)+number.substring(i+1);
                if(curr.compareTo(res)>0){
                    res=curr;
                }
            }
        }
        return res;
    }
}