package nivelunofasecuatro;
import java.util.Scanner;
public class NivelUnoFaseCuatro {
    public static void main(String[] args) {
        // Declaració de variables
        String nom, primerCognom, segonCognom;
        int dia, mes, any;
        
        // Inicialització de Scanner
        Scanner lector = new Scanner(System.in);
        
        // Es demanem les dades per el teclat i pitjar la tecla de retorn
        System.out.print
            ("Escriu el teu nom i pitja la tecla de retorn: ");
        nom = lector.next();
        lector.nextLine();
        
        System.out.print
            ("Escriu el primer cognom i pitja la tecla de retorn: ");
        primerCognom = lector.next();
        lector.nextLine();
        
        System.out.print
            ("Escriu el segon cognom i pitja la tecla de retorn: ");
        segonCognom = lector.next();
        lector.nextLine();
        
        System.out.print
            ("Possa el teu dia de neixement i pitja la tecla de retorn: ");
        dia = lector.nextInt();
        lector.nextLine();
        
        System.out.print
            ("Possa el mes de neixement i pitja la tecla de  retorn: ");
        mes = lector.nextInt();
        lector.nextLine();
        
        System.out.print
            ("Possa el teu any de neixement i pitja la tecla de retorn: ");
        any = lector.nextInt();
        lector.nextLine();
        
        // Declaració de variables on juntem dades
        String identificador = nom + " " + primerCognom +
                " " + segonCognom;
        String dataNeixement =  dia + "/" + mes + "/" + any;
        
        // Declaració de variables per els missatges del if
        String traspas = "L´any " + any + " és de traspàs!";
        String noTraspas = "L´any " + any + " no és de traspas!";
        
        // Sortida de dades per consola 
        System.out.println("El meu nom és " + identificador);
        System.out.println("Vaig neixer el " + dataNeixement);
        
        // Bloc de condició any de traspàs
        if (((any % 100 != 00)&&((any % 100) % 4 == 0))||
                     ((any % 100 == 00)&&((any / 100) % 4 == 0))){
            System.out.println(traspas);
            } else {
            System.out.println(noTraspas);
        }
    }
}
