//leetcode 34,binary-question
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] result = obj.searchRange(nums, target);
        System.out.println("First and last positions: [" + result[0] + ", " + result[1] + "]");


    }

    public int[] searchRange(int[] nums,int target){


        int[] ans = {-1,-1};

        //check for first potential if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    //function will just return the index value of target
    int search(int[] nums , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid+1;

            }else{
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;

    }



}
