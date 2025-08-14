package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

/**best*/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setint = new HashSet<>();

        for (int i =0; i<=nums.length-1; i++){

            if (!setint.contains(nums[i])){
                setint.add( nums[i]);
            } else {
                return true;
            }



        }
        return false;




    }


    /** same idea but worse */
    public boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> mapnums = new HashMap<>();

        for (int i = 0; i<=nums.length-1; i++){

            if (!mapnums.containsKey(nums[i])){
                mapnums.put(nums[i], i);

            } else {return true;}

        }
        return false;





    }




}
