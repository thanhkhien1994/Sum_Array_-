import java.util.Scanner;

public class SumArray {
    int width = 0;
    int height = 0;
    Scanner scanner = new Scanner(System.in);

    public SumArray(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void _array(int[][] array) {
        int number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào số thứ " + (j + 1) + "của hàng thứ " + (i + 1));
                number = scanner.nextInt();
                array[i][j] = number;
            }

        }

    }

    public int sumHeight(int myHeight, int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][myHeight-1];
        }
        return sum;
    }

    public void showTable(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "-");
            }
            System.out.println();
        }
    }
}
