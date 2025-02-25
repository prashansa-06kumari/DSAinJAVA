//leetcode-1095

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBs(arr, target, 0, peak);
        if(firstTry!= -1){
            return firstTry;
        }
        //try to search in second half
        return OrderAgnosticBs(arr, target, peak + 1, arr.length - 1);

    }


    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                //you are in dec part of array
                //this may be the answer but will look at left
                //so end != mid-1

                end = mid;

            }else{
                //you are in asc part of array
                start = mid + 1;//because we know that mid + 1 element > mid element
            }

        }
        //in the end, start == end and pointing to the largest number because of the 2 above checks
        //start and end are always trying to find max element in thr above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the check say
        //more elaboration: at every point of time for start and end,they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence cause of above line that is the best possible ans
        return start;
    }


    static int OrderAgnosticBs(int[] arr,int target, int start, int end ){

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
