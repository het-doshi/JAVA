public class bin2 {

    public static int BinaryDescending (int target, int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                start = mid + 1;
            }
            else if (target > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return  mid;
            }
        }

        return  -1;
    }

    public static void main(String[] args) {
        int [] arr = {90,80,70,60};
        int ans = BinaryDescending(70,arr);
        System.out.println(ans);
    }
}
