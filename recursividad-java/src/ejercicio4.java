public class ejercicio4 {

    public static int sumDigits(int n) {
        // Caso base
        if (n < 10) {
            return n;
        }
        // Caso recursivo
        // UltimoDigito + sumaDigitos(Delrestodelnumero)
        return (n % 10) + sumDigits((n / 10));
        // Si es 977, el (n % 10) me devuelve 7, y el sumDigits(n/10) me devuelve 97.
    }

    public static boolean isPrime(int n) {
        
        // Caso Base
        /*  if (n % 2 == 0) {
            return false;
        }*/ // Hay errores aqui, ya que n podria ser 1 o 2, y ahi fallaria, el 2 es primo.

        // Caso Base
        /* if(n > n / 2) {
            return true; // Porque si n tiene un divisor mayor, seria el mismo.
            // si n es 2, 
        }*/

        // Caso Base 1: si n es 0
        if (n % 1 == 1) {

        }

        // Caso Base 2 ; si n >= 3
        if (n % 2 == 0) {
            return true;
        }

        // Caso Recursivo
        return isPrimeDivisor(n, 3);

    }

    public static boolean isPrimeDivisor(int n, int divisor) {
        // Casos Base:

        // Caso Base 
        if (n % divisor == 0) {
            return false;
        }

        // Caso base 2 
        // Imaginate que fuera 13(n), entonces el n - 1 seria 12. Y el divisor empezaria desde el 2 hasta n - 1
        if (divisor == n - 1) {
            return true;
        }

        // Caso Recursivo
        return isPrimeDivisor(n, divisor + 1);
    }

    public static boolean isPerfectePrime(int n) {
        // Caso base

        return true;
    }


}
