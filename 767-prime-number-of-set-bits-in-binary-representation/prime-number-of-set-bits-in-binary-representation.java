class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            int a=Integer.bitCount(i);
            if(a>1&&isPrime(a)){
                res++;
            }
        }
        return res;
    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}