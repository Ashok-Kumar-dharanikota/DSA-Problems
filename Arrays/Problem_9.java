class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int column = matrix[0].length;
        int row = matrix.length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(target==matrix[i][j]){
                    return true;
                }
            }
        }

        return false;
    }
}
