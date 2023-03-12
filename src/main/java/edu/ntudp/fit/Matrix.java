package edu.ntudp.fit;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;
    private static final int RANDOM_MIN_VALUE = 0;
    private static final int RANDOM_MAX_VALUE = 100;

    public void createMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (max 20): ");
        rows = scanner.nextInt();
        while ((rows <= 0) || (rows > 20)) {
            System.out.print("Invalid number. Please, enter valid number of rows (max 20): ");
            rows = scanner.nextInt();
        }
        System.out.print("Enter number of columns (max 20): ");
        columns = scanner.nextInt();
        while ((columns <= 0) || (columns > 20)) {
            System.out.print("Invalid number. Please, enter valid number of columns (max 20): ");
            columns = scanner.nextInt();
        }

        matrix = new int[rows][columns];

        System.out.print("Do you want to fill matrix manually? (y/n): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("y")) {
            this.fillMatrixManually();
        } else {
            this.fillMatrixRandomly();
        }
    }

    public void fillMatrixManually() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + (i+1) + "][" + (j+1) + "]: ");
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        scanner.next();
                        System.out.print("Invalid input. Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    }
                }
            }
        }
    }

    public void fillMatrixRandomly() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(RANDOM_MAX_VALUE - RANDOM_MIN_VALUE + 1) + RANDOM_MIN_VALUE;
            }
        }
    }

    public int findMin() {
        int min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int findMax() {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public double findArithmeticAverage() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        return (double) sum / (rows * columns);
    }

    public double findGeometricAverage() {
        double product = 1.0;
        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                product *= matrix[i][j];
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
