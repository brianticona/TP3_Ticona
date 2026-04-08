package tp3.ej.pkg1;
public class TP3Ej1 {
    public static void main(String[] args) {
        int contador1 = 1;
        while(contador1 <= 100){
            System.out.println("Contador 1 = " + contador1);
            contador1++;
        }
        System.out.println("-----------------");
        int contador2 = 1;
        do {            
            System.out.println("contador 2 = " + contador2);
            contador2++;
        } while (contador2 <= 100);
        System.out.println("-----------------");
        for(int c = 1; c <= 100; c ++){
            System.out.println("contador 3 = " + c);
        }
    }
}
