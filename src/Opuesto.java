import java.util.Scanner;

public class Opuesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dame un número:" );
        int entero = input.nextInt();

        if (entero < 0){
            System.out.println(entero * (-1));

        }
            else {
            System.out.println(entero);
        }

    }
}
