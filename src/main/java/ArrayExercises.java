
public class ArrayExercises {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};

        System.out.println(sumOfNumbers(array));
        printNeatly(array);

        printArrayAsStars(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++ )
        {
            if (i == array.length - 1) {
                System.out.print(array[i] + "\n");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int sumOfNumbers(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static void printArrayAsStars(int[] array) {
        for (int num : array) {
            PrintingStars.printStars(num);
        }
    }
}
