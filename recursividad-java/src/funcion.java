public class funcion {
    public static int fun(int n) {
        // CASO BASE
        if (n / 10 == 0) {
            return 1;
        }
        // CASO RECURSIVO
        return fun((n + 1) / 10);


    }
}
