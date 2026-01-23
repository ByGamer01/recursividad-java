public class Ejercicio2 {
    public static int reduction_of_digits(int n) { // Caso Base
        int s = sum_of_digits(n);

        if (s >= 10)
            reduction_of_digits(s);
        else
            return s;
    }
}
