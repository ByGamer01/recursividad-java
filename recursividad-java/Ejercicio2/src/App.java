public class App {

    public int reduction_Of_digits(int x) {
        if (x < 10) return x;

        int suma = (x % 10) + reduction_Of_digits(x / 10);
        return reduction_Of_digits(suma);

    }




    public static void main(String[] args) throws Exception {


    }
}
