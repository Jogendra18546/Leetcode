class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int d1=f(date1,days);
        int d2=f(date2,days);
        return Math.abs(d1-d2);
    }
    public int f(String a,int []days){
        int y=Integer.parseInt(a.substring(0,4));
        int m=(a.charAt(5)-'0')*10+a.charAt(6)-'0';
        int d=(a.charAt(8)-'0')*10+a.charAt(9)-'0';
        for(int i=0;i<m-1;i++) d+=days[i];
        int leap=(y-1)/4-(y-1)/100+(y-1)/400;
        d+=leap;
        if(m>2&&(y%400==0||(y%4==0&&y%100!=0))) d++;
        return(y)*365+d;
    }
}