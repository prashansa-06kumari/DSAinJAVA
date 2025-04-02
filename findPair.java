package Sorting;

public class findPair {


    static void selectionSort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static boolean binarySearch(int[] arr, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target)
                return true;

            if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }

    static boolean findPair(int[] arr, int n, int x){
        selectionSort(arr, n);

        for(int i = 0; i < n - 1; i++){
            int target = arr[i] + x;
            if(binarySearch(arr, i + 1, n - 1, target)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 20, 3, 2, 50,80};
        int x1 = 78;
        int n1 = arr1.length;
        System.out.println(findPair(arr1, n1, x1) ? "Yes" : "No");


    }
}
