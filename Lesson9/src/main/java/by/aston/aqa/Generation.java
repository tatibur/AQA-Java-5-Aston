package by.aston.aqa;

public class Generation {
    public static int[] getNums(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.println(nums[i]);
        }
        return nums;
    }
}