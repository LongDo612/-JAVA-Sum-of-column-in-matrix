import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] array;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        array = new int[height][width];
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.println("Enter element["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Your matrix");
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }

        System.out.println("Column you want to calculate: ");
        int inputColumn = scanner.nextInt();
        for (int i=0;i<height;i++){
            sum += array[i][inputColumn-1];
        }

        System.out.println("Your result is: " +sum);
    }
}
