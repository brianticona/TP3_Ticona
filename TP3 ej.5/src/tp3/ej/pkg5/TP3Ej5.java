package tp3.ej.pkg5;
import java.util.Scanner;
public class TP3Ej5 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        Scanner bb = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int p = 0;
        System.out.println("Ingrese dos numeros (el primero debe ser menor al segundo.)");
        do{
            System.out.println("1er numero:");
            a = aa.nextInt();
            System.out.println("2do numero:");
            b = bb.nextInt();
            if ((a == b)||(a > b)){
                System.out.println("Ingrese devuelta los numeros.");
            }
        }while ((a == b)||(a > b));
            System.out.println("Numeros pares del " + a + " al " + b + ".");
            while(a < b){
                a++;
                p = a % 2;
                if (p == 0){
                    System.out.println(a);
                }
            }
    }
}