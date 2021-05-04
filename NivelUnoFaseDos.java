package nivelunofasedos;
import java.util.Scanner;
public class NivelUnoFaseDos {
    /* Declaració de constants, la constant MAX_ANYS té com a valor per defecte
       l´any 2021 menys 1948 */
    public static final int ANY_INICI = 1948;
    public static final int MAX_ANYS = 73;
    public static void main(String[] args) {
    // Inicialització de Scanner, i es demana un enter per el teclat
    Scanner lector = new Scanner(System.in);
    int any = 0;
    System.out.print("Escriu el teu any de naixement: ");
    any = lector.nextInt();
    lector.nextLine();
    
    // Declaració de variables i array on hi haura els anys de traspàs
    int index = 0;
    int i = ANY_INICI;
    int arrayNombreAnys[] = new int[MAX_ANYS];
    
    // Fem un recorregut desde ANY_INICI fins any introduit per el teclat
    while (i <= any) {
        // Si és de taspàs el guardem a l´array, si no surt de la condició if
        if (((i % 100 != 00)&&((i % 100) % 4 == 0))||
                ((i % 100 == 00)&&((i / 100) % 4 == 0))){
            arrayNombreAnys[index] = i;
            index++;
        }
        // Fem que el bucle while avanci una posició 
        i = i + 1;
    }
    
    // Mostra les dades per consola
    System.out.println("\nEls anys de Traspàs des de " + ANY_INICI + 
            " fins a " + any + ":" );
    
    // Mostra tot l´array d´anys de traspàs
    for (int j = 0; j < arrayNombreAnys.length; j++){
        if (arrayNombreAnys[j] != 0){
        System.out.print(arrayNombreAnys[j] + " ");
        }
    }
    System.out.println();
    System.out.println("Nombre d´anys de traspàs des de " + ANY_INICI + 
            " fins a " + any + " :" + index);
    }
}
