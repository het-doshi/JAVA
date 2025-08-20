/* 

 Theory : in java arrays may be continue may be not it depends on JVM as per JLS

 Arrays -> Collection of data types 
 all values in arrays should be of same datatype
 Syntax -> datatype[] variableName = new datatype[size];

 by default values for int in arrays are 0

 arr[0], arr[1] -> are the refrence variable for java array

 multidimensional 2D Array
 Syntax -> datatype[row][col] = new datatype[no of rows][no of cols (not mandatory)]

*/

import  java.util.*;

public class basics{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];


        // not fixed col array
        int[][] arr2 = { {1,2,3,4}, {1,2,3}, {1,2} };

        // in multidimensional array whenever we run array.length -> always return the no of rows

        // taking input
        System.out.println("taking input elements arr");
        for(int i = 0; i<arr.length;i++)
        {

            for(int j = 0; j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }

        }

        // processing output
        System.out.println("printing arr");
        // will work for simple array, 2D array, 2D array columns not fixe size
        for(int[] j : arr)
        {
            System.out.println(Arrays.toString(j));
        }

        //processing output of array whose columns not fixed 
        System.out.println("printing arr2");

        for(int i = 0; i<arr2.length; i++)
        {
            for(int j = 0; j<arr2[i].length; j++)
            {
                System.out.print(arr2[i][j]);
            }

            System.out.println();
        }


        // reverse the array
        int[] arr3 = {1,2,3,4,5,6};

        for(int i = 0; i<arr3.length/2; i++)
        {
            int t = arr3[i];
            arr3[i] = arr3[arr3.length - i - 1]; // 5 - 0 - 1 = 4 means arr[0] = arr[4]
            arr3[arr3.length - i - 1] = t; // arr[4] = t which has value of arr[0]
        }

        // print the reverse array
        System.out.println("printing the reverse array");
        for(int j : arr3)
        {
           System.out.print(j+" ");   
        }

        // finding the max and min in arr4
        int[] arr4  = {25,4,50,90,10, -1};
        int max = 0; int min = arr4[0];
        for(int i = 0; i < arr4.length; i++)
        {
            if(max < arr4[i])
            {
                max = arr4[i];
            }

            if(min > arr4[i])
            {
                min = arr4[i];
            }
        }

        System.out.println("min: "+min+" max: "+max);

    }
}