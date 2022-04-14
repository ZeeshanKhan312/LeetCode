public class LeetCode_59_Spiral_Matrix_II {
    /* Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
Input: n = 1
Output: [[1]]
     */

    //SOLUTION-->
    class Solution {
        int rowD=0,colD=1;
        public int[][] generateMatrix(int n) {
            int [][]result= new int[n][n];
            int row=0,col=0;
            int num=1;
            int x=n*n;
            while(num<=x){
                result[row][col]=num;
                int tempRow=row+rowD;
                int tempCol=col+colD;
                if(tempRow<0|| tempRow==n||tempCol<0|| tempCol==n || result[tempRow][tempCol]!=0)
                    changeDirection(); //changing direction because no more empty space is present in that direction
                row=row+rowD;
                col=col+colD;
                num++;
            }
            return result;
        }
        public void changeDirection(){
            if(rowD==0 && colD==1){ //changing from filling the column from left to right
                rowD=1; // to filling the row from up to bottom
                colD=0;
            }
            else if(rowD==1 && colD==0){ //changing from filling the row from up to bottom
                rowD=0; // to filling the column from right to left
                colD=-1;
            }
            else if(rowD==0 && colD==-1){ // changing from filling the column from right to left
                rowD=-1; //to filling the row from bottom to top
                colD=0;
            }
            else if(rowD==-1 && colD==0){ // changing from filling the row from bottom to top
                rowD=0; //to filling the column from left to right
                colD=1;
            }
        }
    }
}
