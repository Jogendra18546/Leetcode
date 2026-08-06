class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<(i+10);i++){
            int temp=i;
            int p=1;
            while(temp>0){
                int l=temp%10;
                p*=l;
                temp/=10;
            }
            if(p%t==0) return i;
        }
        return n;
    }
}