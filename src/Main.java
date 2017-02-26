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





    }
}
