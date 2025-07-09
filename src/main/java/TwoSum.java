import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int arr[] = new int[2];

        for(int i =0; i<=nums.length-1; i++){
            for(int j =0 ;j<=nums.length-1; j++ ) {
                temp = nums[i] + nums[j];
                if (target == temp) {
                    if(i!=j) {
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] numsArray = {2, 7, 5, 3};
        int [] result = obj.twoSum(numsArray, 12);
        System.out.println(Arrays.toString(result));
    }
}
