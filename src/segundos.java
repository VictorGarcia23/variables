import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {
        System.out.println("Dame un número entero");
        Scanner input = new Scanner(System.in);

        int segundos = input.nextInt();
        int horas = segundos/3600;
        int minutos = (segundos % 3600) / 60;
        int restoSegundo =  (segundos%3600)% 60;

        System.out.println(horas +":"+ minutos +":"+ restoSegundo);


        }
    }

