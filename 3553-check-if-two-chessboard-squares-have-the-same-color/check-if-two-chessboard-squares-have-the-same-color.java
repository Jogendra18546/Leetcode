class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int row=(coordinate1.charAt(0)-'a')+(coordinate2.charAt(0)-'a');
        int col=(coordinate1.charAt(1)-'0')+(coordinate2.charAt(1)-'0');
        return (row+col)%2==0;
    }
}