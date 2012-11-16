public class TwoDim
{
    public static void main(String[] args)
    {
        int[][] matrix = new int[5][6];//create an array with 5 rows and 6 cols
        matrix[0][0] = 5;

        int var  = matrix[0][0];
        int[] var2 = matrix[0];

        matrix[1][2] //row 1 col 2. 0 indexed
        //which one do I do?
        matrix[2][1];

        //iterates over rows
        //matrix.length tells me about the number of rows.
        for(int i=0; i<matrix.length; i++)
        {
            //iterates over columns in row i.
            //matrix[i].length tells me about the numbers of cols in row i.
            for(int j=0; j<matrix[i].length; j++)
            {
                //prints element at row i, col j
                System.out.println(matrix[i][j]);
            }
        }
        //transpose matrix.

    }
}
