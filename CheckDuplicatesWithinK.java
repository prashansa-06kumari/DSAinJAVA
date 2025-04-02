//Duplicate within K Distance in an Array
//Given an integer array arr[] and an integer k, determine whether there exist two indices i and j such that arr[i] == arr[j] and |i – j| ≤ k. If such a pair exists, return ‘Yes’, otherwise return ‘No’.
package Sorting;

public class CheckDuplicatesWithinK {

    public static boolean checkDuplicates(int[] arr, int k){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int c = 1; c <= k && (i + c) < n; c++) {
                int j = i + c;
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(checkDuplicates(arr, 3) ? "Yes" : "No");
    }
}
