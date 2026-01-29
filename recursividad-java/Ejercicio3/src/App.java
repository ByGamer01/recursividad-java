public class App {

    public static boolean isIncreasing(int n) {
        if(n < 10) return true;

        int ultimo = n % 10;
        int penultimo = (n / 10) % 10;

        if (penultimo > ultimo) return false;
        return isIncreasing(n / 10);
    }




    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
