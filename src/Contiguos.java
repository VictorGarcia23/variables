import java.util.Scanner;

public class Contiguos {
    public static void main(String[] args) {
        System.out.println("Dame un numero entero:");

        Scanner input = new Scanner(System.in);
        int entero = input.nextInt();

        if (entero %2== 0){
            System.out.println((entero - 2) + (entero) + (entero + 2));

        }   else {
            System.out.println("debe ser número Par");
        }
    }
}
