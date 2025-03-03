class Solution {
    
    public void rotate(int[][] matrix) {
        //Rotate Matrix
        //Step-1 : Transpose Matrix i.e interchange the row and colums
        int row = matrix.length;
       for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Step-2 : Now reverse the column
        for(int i = 0; i<row; i++){
            int start = 0;
            int end = row -1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }

        }
        
    }
}