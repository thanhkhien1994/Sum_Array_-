import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột: ");
        int height = scanner.nextInt();scanner.nextLine();
        System.out.println("Nhập vào số hàng: ");
        int width = scanner.nextInt();scanner.nextLine();
        SumArray sumArray = new SumArray(width, height);
        int[][] array = new int[sumArray.width][sumArray.height];
        sumArray._array(array);

        int numberHeight;

        do {
            sumArray.showTable(array);
            System.out.println("Nhập vào số cột cần tính tổng: ");
            numberHeight = scanner.nextInt();scanner.nextLine();
            System.out.println("Tổng là : "+sumArray.sumHeight(numberHeight, array));

        }while (true);
    }
}
