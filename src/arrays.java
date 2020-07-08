import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] unArray = new int[1];
        Scanner input = new Scanner(System.in);
        System.out.println("Dame un número de 3 cifras.");

        int entero = input.nextInt();


        if (entero > 100 && entero<999){
            unArray[0] = entero;
            System.out.println(unArray[0]);
        }
        if (entero <100 || entero > 999){
            System.out.println("necesito un número de 3 cifras.");
        }
    }
}
