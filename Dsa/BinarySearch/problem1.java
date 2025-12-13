public class problem1 {

    // Statement : need to find the element which is greater or equal to the target

    public  static int BinarySearch(int target,int[] arr)
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

        return  start;
    }

    public static void main(String[] args) {
        int [] arr = {11,25,10,20,50,60,70};
        int ans = BinarySearch(55,arr);
        System.out.println("at index"+" "+ans);
    }

}

