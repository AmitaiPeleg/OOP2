package HW4.Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

import HW3.Q1.Arithmetic;

public class Matrix implements Arithmetic, InputOuput {
    int[][] data;
    int length;
    int width;

    public Matrix(int size, int size2) {
        if (size == 0 || size2 == 0) {
            throw new TheSizeCanNotBeZero();
        }
        if (size < 0 || size2 < 0) {
            throw new TheSizeCanNotBeNegativ();
        }
        length = size;
        width = size2;
        data = new int[length][width];
    }

    public Matrix add(Object other) {
        if (other == null || !(other instanceof Matrix)) {
            throw new MatrixException("the second object isn't Matrix");
        }
        Matrix o = (Matrix) other;
        if (this.length != o.length || this.width != o.width) {
            throw new NotTheSameSizeException();
        }
        Matrix result = new Matrix(length, width);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.data[i][j] = this.data[i][j] + o.data[i][j];
            }
        }
        return result;
    }

    @Override
    public Matrix sub(Object other) {
        if (other == null || !(other instanceof Matrix)) {
            throw new MatrixException("the second object isn't Matrix");
        }
        Matrix o = (Matrix) other;
        if (this.length != o.length || this.width != o.width) {
            throw new NotTheSameSizeException();
        }
        Matrix result = new Matrix(length, width);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.data[i][j] = this.data[i][j] - o.data[i][j];
            }
        }
        return result;
    }

    @Override
    public Arithmetic mul(Object other) {
        throw new MultOperationNotSupported();
    }

    @Override
    public Arithmetic div(Object other) {
        throw new DivOperationNotSupported();
    }

    @Override
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows (length):");
        length = readSafely(scanner);
        System.out.println("Enter number of columns (width):");
        width = readSafely(scanner);

        data = new int[length][width];
        System.out.println("Enter the matrix values row by row:");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                data[i][j] = readSafely(scanner);
            }
        }
    }

    public int readSafely(Scanner s) {
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer:");
                s.next();
            }
        }
    }

    @Override
    public void write() {
        System.out.println("Matrix (" + length + "x" + width + "):");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Matrix)) {
            throw new MatrixException("the second object isn't Matrix");
        }
        Matrix o = (Matrix) other;
        if (this.length != o.length || this.width != o.width) {
            throw new NotTheSameSizeException();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (this.data[i][j] != o.data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
