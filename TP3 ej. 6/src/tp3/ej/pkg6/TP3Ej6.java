package tp3.ej.pkg6;
import java.util.Scanner;
public class TP3Ej6 {
    public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int N = 0;
            int M = 0;
        do{
            System.out.println("Ingrese dos numeros positivos.");
            System.out.println("1er munero:");
            N = lector.nextInt();
            System.out.println("2do numero:");
            M = lector.nextInt();
            if(N >=M){
                System.out.println("N debe ser menor a M.");
            }
        }while ((M < N)||(N <= 0)||(M <= 0));
        System.out.println("Multiplos de " + N + ":");
        for (int contador = 1; contador <= M; contador ++){
            if(contador % N == 0){
                System.out.println(contador);
            }
        }
    }
}