//Chocolate Distribution Problem
//Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:




package Sorting;

public class ChocolateDistribution {


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


    public static int findMinDiff(int[] arr, int n, int m){
        if(m == 0 || n == 0){
            return 0;
        }
        selectionSort(arr, n);
        if(n < m){
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++){
            int diff =arr[i + m - 1] - arr[i];

            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12,56};
        int m = 3;

        int n = arr.length;
        System.out.println("Minimum difference is: " + findMinDiff(arr, n, m));
    }
}
