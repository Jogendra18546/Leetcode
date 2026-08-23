class Solution {
    public boolean sumGame(String num) {
        int rsum=0,lsum=0,rq=0,lq=0,n=num.length();
        for(int i=0;i<n;i++){
            char c=num.charAt(i);
            if(i<n/2){
                if(c!='?'){
                    lsum+=c-'0';
                }
                else{
                    lq++;
                }
            }
            else{
                if(c!='?'){
                    rsum+=c-'0';
                }
                else{
                    rq++;
                }
            }
        }
        if((lq+rq)%2!=0) return true;
        return (lsum-rsum)!=((rq-lq)/2)*9;
    }
}