package tp3.ej.pkg8;
import java.util.Scanner;
public class TP3Ej8 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        char l  ;
        System.out.println("Ingrese una letra (terminar programa ingresando 0)");
        do{
            l = m.next().charAt(0);
            if (l == '0'){
                System.out.println("Terminando programa.");
                break;
            }
            char n = Character.toLowerCase(l);
            if((n == 'a')||(n == 'e')||(n == 'i')||(n == 'o')||(n == 'u')){
                System.out.println("Vocal.");
            }else{
                System.out.println("No vocal.");
            }
        }while(l != 0);
    }
}