import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] unArray = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< unArray.length;i++){
            System.out.println("introduce un valor");
            unArray[i] = input.nextInt();
        }


        for(int i = unArray.length -1; i >= 0; i--){
            unArray[i] += 1;
            System.out.print(unArray[i]);
        }





        }
    }

