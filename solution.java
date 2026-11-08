package semester5;

public class solution  {

        public static int[] reverseArray(int[] numbers) {

            arraystack<Integer> stack = new arraystack<>();

            for (int i = 0; i < numbers.length; i++) {
                stack.push(numbers[i]);
            }

            int[] reversed = new int[numbers.length];

            for (int i = 0; i < reversed.length; i++) {
                reversed[i] = stack.pop();
            }

            return reversed;
        }

        public static void main(String[] args) {

            int[] numbers = {10, 20, 30, 40, 50};

            int[] result = reverseArray(numbers);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

