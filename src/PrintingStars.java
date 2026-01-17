public class PrintingStars {
    public static void main(String[] args) {
        printChristmasTree(10);
    }

    public static void printStars(int totalStars) {
        for (int i = 0; i < totalStars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static  void printSpaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int length, int height) {
        for (int i = 0; i < height; i++) {
            printStars(length);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printStars(i);
        }
    }

    public static void printFlipTriangle(int size) {
        for (int i = 0; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printChristmasTree(int height) {
        for (int i = 0; i <= height; i++) {
            printSpaces(height - i);
            printStars(i + (i-1));
        }
        for (int j = 0; j < 2; j++) {
            printSpaces(height-2);
            printStars(3);
        }
    }
}
