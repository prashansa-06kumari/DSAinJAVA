package Sorting;

public class MeetingRooms {
    public static void sortMeetings(int[][] intervals){
        int n = intervals.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(intervals[j][0] < intervals[minIndex][0]){
                    minIndex = j;
                }
            }

            int[] temp = intervals[minIndex];
            intervals[minIndex] = intervals[i];
            intervals[i] = temp;
        }
    }

    public static boolean canAttendAllMeetings(int[][] intervals){
        sortMeetings(intervals);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i - 1][1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {10, 15}, {7, 10}};
        System.out.println(canAttendAllMeetings(arr1));
    }
}
