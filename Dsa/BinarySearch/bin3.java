public class bin3 {

    // let's implement the binary search where order of sorted array doesn't matter
    // order - agnostic Binary search
    /* overview -> This binary search works for both ascending and descending sorted arrays.
       We first determine the order of the array using a flag variable. The flag is set based on whether the
       first element is smaller or greater than the last element. If the flag is true, the search follows
       ascending binary search logic; otherwise, it follows descending logic.
     */

    public static  int agnosticBinarySearch(int target, int [] arr) {
        boolean isAsc = true;

        if (arr[0] > arr[arr.length - 1]) {
            isAsc = false;
        }
        int start = 0;
        int end = arr.length - 1;

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

    public static void main(String[] args) {
        int [] arr1 = {11,25,10,20,50,60,70};
        int [] arr2 = {90,80,70,60,50};
        int ans = agnosticBinarySearch(90,arr2);
        System.out.println("at index"+" "+ans);
    }

}
