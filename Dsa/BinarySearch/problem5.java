public class problem5 {

    //  problem leetcode ->  1095. Find in Mountain Array
    // find occurrence of element in mountain array and return minimum index of target

    // intuition
    // find the peak element index
    // from start to peak element index -> array of increasing order
    // from peak+1  to end -> array of decreasing order
    // then apply order agnostic search on increasing array -> which guarantees min index of target
    // if element not found then apply order agnostic search on decreasing order

    // order agnostic search
    public static  int agnosticBinarySearch(int target, int [] arr, int start, int end) {
        boolean isAsc = true;

        if (arr[start] > arr[end]) {
            isAsc = false;
        }


        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
            {
                return  mid;
            }

            if(isAsc) // as per detected order
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else if(target > arr[mid])
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else if (target > arr[mid])
                {
                    end = mid - 1;
                }
            }
        }

        return  -1;
    }



    // step - 1 find the peak element index
    public static int findPeakElement(int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            if(arr[mid] < arr[mid + 1])
            {
                start = mid+1;
            }
        }

        return end ;
    }

    //Step 2 as we know peak try to search the target in increasing array if target is not found then we
    //          search in decreasing part

    public static int findMountainElement(int [] arr, int target)
    {
        int peakElementIndex = findPeakElement(arr);
        int start = 0;
        int end = peakElementIndex;
        int targetIndex = agnosticBinarySearch(target, arr, start, end);

        if(targetIndex == -1)
        {
            targetIndex = agnosticBinarySearch(target, arr, peakElementIndex+1, arr.length -1);
        }

        return  targetIndex;

    }

    public static void main(String[] args) {
        int [] arr = {11,15,20,30,50,60,70,80,20,10,5,1};
        int ans = findMountainElement(arr,20);
        System.out.println(ans);
    }
}
