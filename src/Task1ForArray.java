public class Task1ForArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 3, 4, 5, 7, 8, 9};

        int result = 0;
        int k = 3;
        int sum;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum = result + array[i];
                result = sum;

            }


        }
        System.out.println(result);


    }
}