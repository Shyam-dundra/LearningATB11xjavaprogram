package ex_15_Collection_FrameWorks.Map;

import java.util.*;


public class ex_06_Two_Sum_Problem {
    public static void main(String[] args) {
        
        int[] num = {2,7,11,15};
        int target = 19;
        int[] result = twoSum(num,target);

         if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }

    }
    private static int[] twoSum(int[] num, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            int complement = target - num[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);
            
        }
        return null;

    }


}
