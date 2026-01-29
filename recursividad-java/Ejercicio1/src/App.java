import java.util.Scanner;

public class App {
    
    public static int ejercicio1(int n) {
        if (n < 10) return 1;

        return 1 + ejercicio1(n / 10); // Cada vez que eliminas un digito, cuenta 1.

    }






    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(ejercicio1(n));
        sc.close();
    }
}
