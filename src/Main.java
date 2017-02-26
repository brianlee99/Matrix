import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Declaration of a new matrix A
        double a[][] = {{3, 5, 4}, {2, 11, 10}};
        Matrix A = new Matrix(a);
        A.print();

        System.out.println("The original value is " + A.getElement(1, 2));
        A.setElement(1, 2, 35);
        System.out.println("The value is now " + A.getElement(1, 2));

        // Another matrix
        double b[][] = {{1, 1}, {2, 11}};
        Matrix B = new Matrix(b);
        Matrix X = Matrix.inverse(B);
        X.print();

        B = Matrix.scalarMult(B, 3.2);
        B.print();

        double m[][] = {{1,4}, {2,3}};
        double n[][] = {{8,12}, {6,-5}};
        Matrix M = new Matrix(m);
        Matrix N = new Matrix(n);
        Matrix D = Matrix.multiplyMatrix(M, N);
        System.out.println("The matrix D contains:");
        D.print();




    }
}
