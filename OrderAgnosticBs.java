//find whether the order is sorted in ascending od descending order
//Time complexity is same as Binary Search


public class OrderAgnosticBs {
    public static void main(String[] args) {
//        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
        int[] arr = {90,87,67,54,41,38,22,9};
        int target = 22;
        int ans = OrderAgnosticBs(arr,target);
        System.out.println(ans);

    }

    static int OrderAgnosticBs(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid+1;

                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid+1;

                }
            }
        }
        return -1;
    }
}
