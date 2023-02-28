package leetcode;

import java.util.Arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {


        System.out.println( "result:" +betterSolution( new int[] {  2,  3, 5, 6,8,9,10, 13, 30}, 1));

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
            System.out.println("start = "+start);
            System.out.println("end = "+end);

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
        System.out.println("start = "+start);
        System.out.println("end = "+end);
        return start;





    }

    public static int shortSolution(int[] nums, int target) {

        //Returns:
       // index of the search key, if it is contained in the array;
        // otherwise, (-(insertion point) - 1).
        // The insertion point is defined as the point at which the key would be inserted into the array:
        // the index of the first element greater than the key, or a.length if all elements in the array
        // are less than the specified key. Note that this guarantees that the return value will be >= 0
        // if and only if the key is found
        int index = Arrays.binarySearch(nums, target);
        return index < 0 ? -(index + 1) : index;
    }
}
