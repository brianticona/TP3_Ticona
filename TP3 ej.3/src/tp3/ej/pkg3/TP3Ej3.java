package tp3.ej.pkg3;
import java.util.Scanner;
public class TP3Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int contador = teclado.nextInt();
        System.out.println("Contador de " + contador + " a 1.");
        while (contador >= 1){
           System.out.println(contador);
           contador = contador - 1;
       }
    }
}