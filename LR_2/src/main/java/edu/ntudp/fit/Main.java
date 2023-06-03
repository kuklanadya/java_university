package edu.ntudp.fit;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        matrix.createMatrix();
        System.out.println("Created matrix:");
        matrix.printMatrix();
        int min = matrix.findMin();
        int max = matrix.findMax();
        double arithmeticAverage = matrix.findArithmeticAverage();
        double geometricAverage = matrix.findGeometricAverage();

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.println("Arithmetic average: " + arithmeticAverage);
        System.out.println("Geometric average: " + geometricAverage);
    }
}