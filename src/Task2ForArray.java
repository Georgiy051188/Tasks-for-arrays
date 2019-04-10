public class Task2ForArray {
    public static void main(String[] args) {
        int[] array = {1, 0, 3, 0, 4, 5, 0, 2, 1, 0, 2, 6, 0, 0};
        int result = 0;
        int sum;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                sum = array[i];
                //result = sum;
                int maxInt = (array[i] > sum) ? array[i] : sum;
                int [] arrayTwo;
                System.out.println();
            }

        }
    }
}

      /*  int n = 10;
        do {
            System.out.println("Tact " + n);

        } while (--n > 0);
        */

      /*  int y = 20;
        for (int x = 0; x < 10; x++) {
            System.out.println("Znachenie x: " + x);
            System.out.println("Znachenie y: " + y);
            y = y - 2;
        }
*/




