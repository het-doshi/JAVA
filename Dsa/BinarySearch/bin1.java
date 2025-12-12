public class bin1 {

    // simple binary search works on sorted array
    // start initially at 0 index at start of array
    // end at last element of array
    // if target < mid -> end = mid - 1   start remains unchanged
    // if target > mid -> start = mid + 1 end remains unchanged
    // else return the mid
    // loops over return not found

    public static int BinarySearch(int target, int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            System.out.println(mid);

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

        return  end;
    }

    public static void main(String[] args) {

        int [] arr = {11,25,10,20,50,60,70};
        int ans = BinarySearch(55,arr);
        System.out.println("at index"+" "+ans);
    }
}
