class Solution {
    public boolean squareIsWhite(String coordinates) {
        int r=check(coordinates.charAt(0));
        int c=coordinates.charAt(1);
        return (r+c)%2!=0;
    }
    public int check(char a){
        if(a=='a') return 1;
        else if(a=='b') return 2;
        else if(a=='c') return 3;
        else if(a=='d') return 4;
        else if(a=='e') return 5;
        else if(a=='f') return 6;
        else if(a=='g') return 7;
        else if(a=='h') return 8;
        return -1;
    }
}