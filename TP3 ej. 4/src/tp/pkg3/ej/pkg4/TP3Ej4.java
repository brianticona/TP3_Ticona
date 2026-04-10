package tp.pkg3.ej.pkg4;
import java.util.Scanner;
public class TP3Ej4 {
    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        do{
        System.out.println("Ingresa un numero:");
        contador = teclado.nextInt();
        System.out.println("Agrega otro numero:");
        contador2 = teclado2.nextInt();
        if (contador == contador2){
            System.out.println("Vuelva a introducir los numeros.");
        }
        }while(contador == contador2);
        if (contador > contador2){
            System.out.println(contador2);
        }else{
            System.out.println(contador);
        }
        do{
        if (contador > contador2){
            contador2++;
            System.out.println(contador2);
        }
        else{
            contador++;
            System.out.println(contador);
        }
        }while(contador != contador2);
    }
}