/**
 * Created by brian on 2017-02-18.
 */

import java.io.*;

public class Matrix {

    private double data[][];
    private int numRows;
    private int numCols;

    // Constructor, which takes in a 2-dimensional array and makes a deep copy.
    // Bug: Assert that the rows are all the same length.
    Matrix(double[][] arr) throws IOException {
        numRows = arr.length;
        numCols = arr[0].length;
        data = new double[numRows][numCols];
        for(int i=0; i<numRows; i++) {
            if(arr[i].length != numCols) {
                throw new IOException();
            }
            for(int j=0; j<numCols; j++) {
                data[i][j] = arr[i][j];
            }
        }
    }

    Matrix(int rows, int cols) {
        numRows = rows;
        numCols = cols;
        data = new double[rows][cols];
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<numCols; j++) {
                data[i][j] = 0;
            }
        }
    }

    // Print out the entire matrix. There's a bug where if the number is huge it will mess up
    // how the matrix is display.
    void print(int decimals) {
        String decStr = "%.";
        decStr += Integer.toString(decimals);
        decStr += "f \t\t";


        for(int i=0; i<numRows; i++) {
            for(int j=0; j<numCols; j++) {
                System.out.printf(decStr, data[i][j]);
            }
            System.out.println();
        }
    }

    // Without an argument, by default show 4 decimal places.
    void print() {
        print(4);
    }

    // Getter
    double getElement(int row, int col) {
        return data[row][col];
    }

    // Setter
    void setElement(int row, int col, double value) {
        data[row][col] = value;
    }

    static Matrix addMatrix(Matrix a, Matrix b) {
        Matrix sum = new Matrix(a.numRows, a.numCols);
        for (int i=0; i<sum.numRows; i++) {
            for (int j=0; j<sum.numCols; j++) {
                sum.data[i][j] = a.data[i][j] + b.data[i][j];
            }
        }
        return sum;
    }

    static Matrix subtractMatrix(Matrix a, Matrix b) {
        Matrix sum = new Matrix(a.numRows, a.numCols);
        for (int i=0; i<sum.numRows; i++) {
            for (int j=0; j<sum.numCols; j++) {
                sum.data[i][j] = a.data[i][j] - b.data[i][j];
            }
        }
        return sum;
    }

    static Matrix transpose(Matrix a) {
        Matrix trans = new Matrix(a.numCols, a.numRows);
        for (int i=0; i<a.numRows; i++) {
            for (int j=0; j<a.numCols; j++) {
                trans.data[j][i] = a.data[i][j];
            }
        }
        return trans;
    }

    // PRE: The input matrix must be 2x2.
    static Matrix inverse(Matrix a) {
        double[][] data = a.data;
        double det = data[0][0] * data[1][1] - data[0][1] * data[1][0];
        if (det == 0) return null;
        det = 1 / det;

        Matrix inv = new Matrix(a.numCols, a.numRows);
        inv.data[0][0] = det * data[1][1];
        inv.data[1][1] = det * data[0][0];
        inv.data[0][1] = -1 * det * data[0][1];
        inv.data[1][0] = -1 * det * data[1][0];

        return inv;

    }

    static Matrix scalarMult(Matrix a, double c) {
        Matrix mult = new Matrix(a.numRows, a.numCols);
        for(int i=0; i<mult.numRows; i++) {
            for(int j=0; j<mult.numCols; j++) {
                mult.data[i][j] = c * a.data[i][j];
            }
        }
        return mult;
    }

    static Matrix multiplyMatrix(Matrix a, Matrix b) {
        Matrix mult = new Matrix(a.numRows, b.numCols);
        // Fill in code here
        return mult;

    }

}