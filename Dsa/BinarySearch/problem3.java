public class problem3 {

    // Problem -> search the target in infinite sorted array
    // as we don't know the length of array we will not use array.length

    // intuition
    // step 1 find the valid range in which target can lie
    // step 2 find the target in that valid range

    // finding the correct range in which element can be lie
    public static int infiniteSearch(int target, int[] arr) {
        int start = 0;
        int end = 1;

        // handle the array bound & check weather target can lie in range or not
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            int currentRange = (end - start + 1);
            end = end + currentRange * 2; // every pass we are expanding the range
            start = newStart;

            // handle the actual array bound
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        return BinarySearch(target, arr, start, end);
    }


    // searching in the range where element can be found
    public static int BinarySearch(int target, int [] arr, int start, int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return  -1;
    }


    public static void main(String[] args ) {
        int [] arr = {10,11,20,25,50,60,70};
        int ans = infiniteSearch(20,arr);
        System.out.println(ans);
    }
}


