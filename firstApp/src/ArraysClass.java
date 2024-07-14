import java.util.Arrays;

public class ArraysClass {
    
    public static void main(String[] args) {

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        String[] names = {"khalid", "issa", "ahmed"};

        int[] nums;
        nums = new int[] {9,9};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nums));

        for (String name : names) {
            System.out.println(name);
        }

    }
}
