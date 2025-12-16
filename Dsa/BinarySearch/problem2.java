import java.lang.reflect.Array;
import java.util.Arrays;

public class problem2 {


    // problem -> find the first and last position of given number in array
    // solution -> as the array is sorted so from that
    // we can say that first possible occurrence of no is towards the start of array so after find the element reduce the array towards start to get first occurrence
    // As same we can say that last possible occurrence of no is towards the end of array so after find the element reduce the array towards last to get last occurrence

    public static int BinarySearchFirstOccurrence(int target,int[] arr, int start,int end)
    {
        int ans = -1;

        while(start <= end)
        {

            int mid = start + (end - start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                ans = mid;
                end = mid - 1; // to search the first possible occurrence
            }
        }

        return  ans;
    }

    public static int BinarySearchLastOccurrence(int target,int[] arr, int start,int end)
    {
        int ans = -1;

        while(start <= end)
        {

            int mid = start + (end - start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                ans = mid;
                start = mid+1; // to search the last possible occurrence
            }
        }

        return  ans;
    }

    //optimal way of implementation here we extend the binary search & controlled the behaviour using the flag
    public static int BinarySearch(int target, int[] arr, int start, int end, boolean isFirstOccurrence)
    {
        int ans = -1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                if(!isFirstOccurrence)
                {
                    ans = mid;
                    end = mid - 1;
                }
                else
                {
                    ans = mid;
                    start = mid + 1;
                }
            }
        }

        return  ans;
    }

    public static int [] optimalSearchBinarySearch(int target, int[] arr, int start, int end)
    {
        int[] answer = {-1,-1};
        answer[0] = BinarySearch( target, arr, start, end, false);

        if(answer[0] != -1)
        {
            answer[1] = BinarySearch( target, arr, start, end, true);
        }
        return answer;
    }

    public static void main(String[] args) {
       int[] ans = {-1,-1};
       int [] arr = {10,20,30,30,40,60,60,70};

       // ans[0] =  BinarySearchFirstOccurrence(60,arr,0,arr.length - 1);
       // ans[1] =  BinarySearchLastOccurrence(60,arr,0,arr.length - 1);

        // optimal implementation
        ans = optimalSearchBinarySearch(60,arr,0, arr.length - 1);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
