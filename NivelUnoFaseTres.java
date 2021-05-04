package nivelunofasetres;
import java.util.Scanner;
public class NivelUnoFaseTres {
    public static void main(String[] args) {
        System.out.print("Escriu un any: ");
        // Inicialitzem  Scanner i demanem un nombre enter per el teclat
        Scanner lector = new Scanner(System.in);
        int any = lector.nextInt();
        lector.nextLine();
        
        // Declaració de les dues variables String
        String traspas = "L´any " + any + " és de traspàs!";
        String noTraspas = "L´any " + any + " no és de traspàs!";
        
        // Declaració de la variable booleana, amb esquema de semàfor
        boolean trobat = false;
        if (((any % 100 != 00)&&((any % 100) % 4 == 0))||
                     ((any % 100 == 00)&&((any / 100) % 4 == 0))){
            trobat = true;
            System.out.println(traspas);
            } else { 
                System.out.println(noTraspas);
        }
    }
}
