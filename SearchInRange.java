public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = LinearSearch(nums,target,1,7);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start;index<=end;index++){
            //check for element at every index if it is target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;

    }
}
