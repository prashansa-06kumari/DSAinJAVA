public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search (int[] nums, int target) {
        int pivot = findPivot(nums);

        // If pivot is not found, array is not rotated
        if(pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, we check if the target is the pivot itself
        if(nums[pivot] == target) {
            return pivot;
        }

        // If target is within the left sorted part of the array
        if(target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right sorted part
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search bounds based on the sorted part of the array
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // No pivot found, meaning the array is not rotated
    }
}

































////leetcode-33
////not for duplicate values
//
//public class RotatedSortedArray {
//    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
//        System.out.println(findPivot(arr));
//
//    }
//
//    static int search (int[] nums, int target){
//        int pivot = findPivot(nums);
//        //if you did not find a pivot, it means the array is not rotated
//        if(pivot == -1){
//            //just do normal binary search
//            return BinarySearch(nums, target, 0, nums.length-1);
//
//        }
//        //if pivot is found, you have 2 asc sorted arrays
//        if(nums[pivot] == target){
//            return pivot;
//        }
//
//        if(target >= nums[0]){
//            return BinarySearch(nums, target, 0, pivot - 1);
//        }
//
//        return BinarySearch(nums, target, pivot - 1, nums.length - 1);
//    }
//
//    static int BinarySearch(int[] arr,int target,int start, int end){
//
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(target<arr[mid]){
//                end = mid - 1;
//            }else if(target > arr[mid]){
//                start = mid+1;
//
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            //main 4 cases
//            if (mid < end && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//
//            if (mid > start && arr[mid] < arr[mid - 1]){
//                return mid - 1;
//            }
//
//            if(arr[mid] <= arr[start]){
//                end = mid - 1;
//            }
//            else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//}
