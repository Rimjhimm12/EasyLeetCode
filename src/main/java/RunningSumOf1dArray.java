import java.util.Arrays;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int newArray[] = new int[nums.length];
        int sum = 0;
        for(int i =0; i<= nums.length -1; i++){
            sum = sum + nums[i];
            newArray[i] = sum;
        }
        return newArray;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray obj = new RunningSumOf1dArray();
         int[] input  = {1, 2, 3, 4, 5, 6, 7, 8};
         int[] result = obj.runningSum(input);
        System.out.println(Arrays.toString(result));
    }
}
