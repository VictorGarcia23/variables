import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] unArray = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Dame las unidades: ");
        int unidades = input.nextInt();
        System.out.println("Dame las decenas: ");
        int decenas = input.nextInt();
        System.out.println("Dame las centenas: ");
        int centenas = input.nextInt();

        unArray[0] = unidades;
        unArray[1] = decenas;
        unArray[2] = centenas;

        for(int i = unArray.length -1; i >= 0; i--){
            unArray[i] += 1;
            System.out.print(unArray[i]);
        }





        }
    }

