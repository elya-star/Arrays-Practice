public class Task4 {
    static void main(String[] args) {
        int[] numbers = {3, 8, 12, 5, 9, 2, 7};

        System.out.println("Original: ");

        for(int i =0 ; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed: ");
        for(int i = numbers.length - 1; i >=0; i--){
            System.out.println(numbers[i] + " ");
        }

    }
}
