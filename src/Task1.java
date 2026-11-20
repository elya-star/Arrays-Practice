public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1,2, -1, 0 ,0 , -30, 23, -7, 3, 10};
        int positive = 0;
        int nnegative = 0;
        int zero = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nnegative++;
            } else if(nums[i] > 0) {
                positive++;
            } else {
                zero ++;
            }
        }
        System.out.println("Array: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + nnegative);
        System.out.println("Zeros: " + zero);
    }
}