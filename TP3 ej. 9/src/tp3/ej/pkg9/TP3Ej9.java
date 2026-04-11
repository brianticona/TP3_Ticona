package tp3.ej.pkg9;
import java.util.Scanner;
public class TP3Ej9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el numero base.");
        int a = n.nextInt();
        int b = 0;
        int r = 1;
        System.out.println("Ingrese el exponente.");
        do{
            b = n.nextInt();
            if (b < 0){
                System.out.println("El exponente debe ser un numero positivo.");
            }
        }while(b < 0);
        for (int p = 1; p <= b; p++){
            r = r * a;
        }
        System.out.println("El resultado de "+a+" elevado a la "+b+" es "+r+".");
    }
}