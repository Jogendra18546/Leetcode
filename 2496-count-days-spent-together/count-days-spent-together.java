class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int s1=cnv(arriveAlice,days);
        int e1=cnv(leaveAlice,days);
        int s2=cnv(arriveBob,days);
        int e2=cnv(leaveBob,days);
        int s=Math.max(s1,s2);
        int e=Math.min(e1,e2);
        if(s>e) return 0;
        else return e-s+1;
    }
    public int cnv(String a,int days[]){
        int m=(a.charAt(0)-'0')*10+a.charAt(1)-'0';
        int d=(a.charAt(3)-'0')*10+a.charAt(4)-'0';
        int res=d;
        for(int i=0;i<m-1;i++) res+=days[i];
        return res;
    }
}