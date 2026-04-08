package tp3.ej.pkg2;
import java.util.Scanner;
public class TP3Ej2 {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        int n = na.nextInt();
        int contador1 = 0;
        while(contador1 <= n){
            System.out.println("Contador 1 = " + contador1);
            contador1++;
        }
        System.out.println("-----------------");
        int contador2 = 0;
        do {            
            System.out.println("contador 2 = " + contador2);
            contador2++;
        } while (contador2 <= n);
        System.out.println("-----------------");
        for(int c = 0; c <= n; c ++){
            System.out.println("contador 3 = " + c);
        }
    }
}