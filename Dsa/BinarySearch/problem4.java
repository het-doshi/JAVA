public class problem4 {

    // problem : find the peak element in bitonic array
    // Bitonic Array -> it is sorted of increase then sorted of decreasing elements
    // peak element -> the maximum element in bitonic array
    // now using below two conditions we are trying to shrink the array until reached to one peak element

    public static int findPeakElement(int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        int ans = 0;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) // means in decreasing part of array
            {
                ans = mid;
                end = mid; // to find better possible peak element
            }

            if(arr[mid] < arr[mid + 1]) // means in increasing part of array
            {
                start = mid+1;
            }
        }

        return end; // or start both point to peak element
    }

    public static void main(String[] args) {
        int [] arr = {11,15,20,30,50,60,70,80,20,10,5,1};

        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
}
