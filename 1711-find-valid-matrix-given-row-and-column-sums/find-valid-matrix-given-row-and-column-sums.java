class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r=rowSum.length;
        int c=colSum.length;
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int v=Math.min(rowSum[i],colSum[j]);
                mat[i][j]=v;
                rowSum[i]-=mat[i][j];
                colSum[j]-=mat[i][j];
            }
        }
        return mat;
    }
}