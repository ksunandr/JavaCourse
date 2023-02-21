package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {


        System.out.println( betterSolution( new int[] { 1, 2, 3, 5 }, 1));

    }
    public static int mySolution(int[] nums, int target) {

        int mid = nums.length / 2;
        int k = mid;
        while (k > 1) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                k = k / 2;

                if (mid%2==0){ mid = mid + k;}
                else mid = mid + k +1;
            } else {
                k = k / 2;
                if (mid%2==0) mid = mid - k;
                else mid = mid - k -1;

            }
        }

        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) {
            if (mid == nums.length-1 || nums[mid+1] >= target) return mid + 1;
            else return mid+2;
        }
        else {
            if (mid == 0 || nums[mid-1] < target) return mid;
            else return mid-1;
        }

    }

/*
* Time complexity: O(logn)
* */
    public static int betterSolution(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;


        while(start<=end){

            int mid = start + ( (end-start) /2 );
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }


        }
        return start;





    }
}
