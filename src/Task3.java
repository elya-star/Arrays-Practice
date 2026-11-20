public class Task3 {
    static void main(String[] args) {
        int[] nums = {10, 34, 54, 23, 43, 40};
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        double average = (double) sum / nums.length;
        int count = 0 ;
        for (int i =0 ; i < nums.length; i++) {
            if(nums[i] < average) {
                count++;
            }
        }
        System.out.println("Array: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("the numbers above average: " + count);
    }
}
