import java.util.*;

public class matrix {

    // matrix m x n -> rows x col

    public int [][] IOmatrix()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int m = sc.nextInt();
        System.out.println("enter no of cols");
        int n = sc.nextInt();
        int [][] numbers = new int[m][n];

        // taking input in matrix
        System.out.println("enter elements");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }

        // print the output
        System.out.println("printing elements");
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        return  numbers;
    }


  public void transpose(int[][] arr)
  {
      int rows = arr.length;
      int cols = 0; 
      
      // for handling not fixed size of cols checking max cols available
      for(int[] row : arr)
      {
          if(cols < row.length)
          {
             cols = row.length;
          }
      }

      int [][] transpose = new int[cols][rows];
  
      for(int i = 0; i < cols; i++)
      {
           for(int j = 0; j < rows; j++)
           {
             // checking if index is valid or not 
             if(i < arr[j].length)
             {
                transpose[i][j] = arr[j][i];
             }
           }
      }


      for(int[] k : transpose)
      {
         System.out.println(Arrays.toString(k));
      }
  }


    public void rotate90(int[][] num)
    {
        int rows = num.length;
        int col = num[0].length;
        int [][] transpose = new int[col][rows];

        // transpose
        for(int i = 0; i<col; i++)
        {
            for(int j = 0; j<rows; j++)
            {
                transpose[i][j] = num[j][i];
            }
        }

        //reverse the elements of array
        for(int i = 0; i<col; i++)
        {
            for(int j = 0; j<rows/2; j++)
            {
                int t = transpose[i][j];
                transpose[i][j] = transpose[i][rows-j-1];
                transpose[i][rows-j-1] = t;
            }
        }

        System.out.println("printing 90* rotated elements");
        for(int i = 0; i<col; i++)
        {
            for(int j = 0; j<rows; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        matrix m = new matrix();
        int[][] num  = m.IOmatrix();
        m.transpose(num);
        m.rotate90(num);
    }

}
