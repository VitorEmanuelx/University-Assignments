import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Informe o segundo número:");
        int num2 = sc.nextInt();

        int i = 0;

        if (num1 < num2) {
            for (i = num1; i <= num2; i++) {
                System.out.println("Número: " + i);
            }
        } else {
            for (i = num1; i >= num2; i--) {
                System.out.println("Número: " + i);
            }
        }

        sc.close();
    }
}