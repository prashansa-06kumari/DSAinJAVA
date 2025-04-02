package Sorting;

public class MaximizeSumAfterKNegation {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
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



    public static int maximizeSum(int[] arr, int k){
        int n = arr.length;

        selectionSort(arr);

        for(int i = 0; i < n; i++){
            if(arr[i] < 0 && k > 0){
                arr[i] = -arr[i];
                k--;
            }
        }

        if(k % 2 != 0){
            int minIndex = 0;
            for(int i = 1; i < n; i++){
                if(arr[i] < arr[minIndex]){
                    minIndex = i;
                }
            }
            arr[minIndex] = -arr[minIndex];
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 0, 5, -1, 2};
        int k1 = 4;
        System.out.println("Maximized sum (arr1, k1): " + maximizeSum(arr1, k1));
        int[] arr2 = {9, 8, 8, 5};
        int k2 = 3;
        System.out.println("Maximised sum (arr2, k2): " + maximizeSum(arr2, k2));
    }
}
