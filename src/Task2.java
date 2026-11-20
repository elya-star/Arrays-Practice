public class Task2 {
    public static void main(String[] args) {
        int[] nums = {12, 5, 2,8, 3, 19, 7, 15, 9};

        int LargestNum = nums[0];
        int SmallestNum = nums[0];
        int LargestIndex = 0;
        int SmallestIndex = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > LargestNum) {
                LargestNum = nums[i];
                LargestIndex = i;
            }

            if (nums[i] < SmallestNum) {
                SmallestNum = nums[i];
                SmallestIndex = i;
            }
        }
        System.out.println("Array: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

        System.out.println("Largest:  " + LargestNum + " at index "+ LargestIndex);
        System.out.println("Smallest: " + SmallestNum + " at index " + SmallestIndex);
    }
}
