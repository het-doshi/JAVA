public class problem6 {

    // problem statement -> search the element in sorted array
    // steps to solve
    // step 1: find the pivot(greatest) element from array
    // step 2: after find we are able to form two accessing arrays
    // 1 array -> from 0 index to pivot, 2 array -> from pivot+1 index to last index
    // apply binary search on both to get the target element

    // steps to find the pivot element index using binary search
    // case 1 : if(mid > mid+1) || if(mid-1 > mid) -> conditions for getting pivot.
    // conditions for reducing scope
    // case 2 : if( startElement > midElement ) ->  end = mid - 1 -> ignore elements after mid.
    // case 3 : if( startElement < midElement ) ->  start = mid + 1 -> ignore elements before mid.

    // to find the cases in general for implementing binary search need to try below steps
    // 1 -> try to get answer as mid -> find that conditions
    // 2 -> at every iteration our search space should be reduced so we need to find such conditions
    // which can reduce our search space or reduce our boundaries

    public static int binarySearch(int start, int end, int [] arr, int target)
    {
        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid] )
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


    public static int getPivotIndex( int start, int end, int[] arr)
    {

        if (arr[start] <= arr[end]) { // what if array is not rotated
            return end; // last element is pivot
        }

         while(start <= end)
         {
             int mid = start + (end - start) / 2;

             // check if mid is pivot
             if(arr[mid] > arr[mid + 1])
             {
                 return mid;
             }
             else if(arr[mid] < arr[mid - 1])
             {
                 return mid - 1;
             }
             else if(arr[start] < arr[mid]) // reducing search space
             {
                 start = mid + 1;
             }
             else
             {
                 end = mid - 1;
             }
         }
        return - 1;
    }

    public static int searchElementFromRoatedArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // step 1 find the pivot index
        int pivotIndex = getPivotIndex(start,end,arr);

        // step 2 -> try to search target in first from start to pivotIndex
        int targetIndex = binarySearch(start,pivotIndex,arr,target);

        if(targetIndex == -1)
        {
            // step 2 -> try to search target in arr from pivotIndex+1 to end
            targetIndex = binarySearch(pivotIndex+1,end,arr,target);
        }

        return targetIndex;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 7;
        int targetIndex = searchElementFromRoatedArray(arr,target);
        System.out.println("Target Index: "+targetIndex);
    }

}
