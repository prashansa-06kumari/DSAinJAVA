public class DupRoatatedArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
        int target = 9;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotwithDuplicates(nums); // Find the pivot point in the rotated array

        // If no pivot is found, it means the array is not rotated, perform normal binary search
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found, we check if the target is the pivot itself
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is within the left sorted part of the array
        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right sorted part
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotwithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Handle the case where duplicates are present at start, mid, and end
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Skip the duplicates
                // Check if the element at start is the pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if the element at end is the pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, so pivot should be in the right part
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}








































////for duplicate values
//
//public class DupRoatatedArray {
//    public static void main(String[] args) {
//            int[] arr = {2, 9, 2, 2, 2};
//            System.out.println(findPivotwithDuplicates(arr));
//
//        }
//
//        static int search (int[] nums, int target){
//            int pivot = findPivotwithDuplicates(nums);
//            //if you did not find a pivot, it means the array is not rotated
//            if(pivot == -1){
//                //just do normal binary search
//                return BinarySearch(nums, target, 0, nums.length-1);
//
//            }
//            //if pivot is found, you have 2 asc sorted arrays
//            if(nums[pivot] == target){
//                return pivot;
//            }
//
//            if(target >= nums[0]){
//                return BinarySearch(nums, target, 0, pivot - 1);
//            }
//
//            return BinarySearch(nums, target, pivot - 1, nums.length - 1);
//        }
//
//        static int BinarySearch(int[] arr,int target,int start, int end){
//
//
//            while(start <= end){
//                int mid = start + (end - start)/2;
//                if(target<arr[mid]){
//                    end = mid - 1;
//                }else if(target > arr[mid]){
//                    start = mid+1;
//
//                }else{
//                    return mid;
//                }
//            }
//            return -1;
//        }
//
//        static int findPivotwithDuplicates(int[] arr){
//            int start = 0;
//            int end = arr.length - 1;
//            while(start <= end){
//                int mid = start + (end - start) / 2;
//                //main 4 cases
//                if (mid < end && arr[mid] > arr[mid + 1]){
//                    return mid;
//                }
//
//                if (mid > start && arr[mid] < arr[mid - 1]){
//                    return mid - 1;
//                }
//
////if elements at middle, start, end are equal then just skip the duplicates
//                if(arr[mid] == arr[start] && arr[mid] == arr[end]){
//                    //skip the duplicates
//                    //what is these elements at start and end were the pivot?
//                    //check if start is pivot
//                    if(arr[start] > arr[start+1]){
//                        return start;
//                    }
//                    start++;
//
//                    //check if end is pivot
//                    if (arr[end] < arr[end - 1]){
//                        return end - 1;
//                    }
//                    end--;
//                }
//                //left side is sorted, so pivot should be in right
//                else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end] ){
//                    start = mid + 1;
//                }
//                else{
//                    end = mid - 1;
//                }
//            }
//            return -1;
//        }
//
//
//
//}
