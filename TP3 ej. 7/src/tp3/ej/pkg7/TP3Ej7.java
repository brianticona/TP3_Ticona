package tp3.ej.pkg7;
import java.util.Scanner;
public class TP3Ej7 {
    public static void main(String[] args) {
        Scanner millas = new Scanner(System.in);
        double m = 0;
        do{
            System.out.println("Ingrese las millas para convertirlas en kilometros (ingrese 0 para terminar)");
            m = millas.nextInt();
            if(m == 0){
                break;
            }
            double km = m * 1.6093;
            System.out.println("KM = " + km);
        } while (m != 0);
        System.out.println("Terminando programa.");

    }
}