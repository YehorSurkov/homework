package lesson7;

public class Recursion {

    int Rec(int A, int B) {
        if (A == B) {
            System.out.print(A);
            return A;
        }
        System.out.print(A + " ");
        return Rec(A + (B - A) / Math.abs(A - B), B);
    }
}
