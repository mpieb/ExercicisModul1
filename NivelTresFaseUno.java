package niveltresfaseuno;
public class NivelTresFaseUno {
    public static void main(String[] args) {
        // Declaració de l´array i les variables auxiliars per fer la rotació
        int[] arrayRota = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int guarda = 0;
        int aux = 0;
        
        // for per mostrar per consola l´array original
        for (int i = 0; i < arrayRota.length; i++){
            System.out.print(arrayRota[i] + " ");
        }
        System.out.println();
        
        /* Amb la variable guarda hi guardem el primer valor de l´array, dons
           un cop hi posem el valor n-1 es machaca el valor original i el 
           necessitem per rotarlo a la posició 1.
           Cada dues línies de codi a partit del valor 1, guarda el valor a
           rotar i s´assigna la posició anterior.
        */
        guarda = arrayRota[0];
        aux = arrayRota[9];
        arrayRota[0] = aux;
        
        aux = arrayRota[1];
        arrayRota[1] = guarda;
        
        guarda = arrayRota[2];
        arrayRota[2] = aux;
        
        aux = arrayRota[3];
        arrayRota[3] = guarda;
        
        guarda = arrayRota[4];
        arrayRota[4] = aux;
        
        aux = arrayRota[5];
        arrayRota[5] = guarda;
        
        guarda = arrayRota[6];
        arrayRota[6] = aux;
        
        aux = arrayRota[7];
        arrayRota[7] = guarda;
        
        guarda = arrayRota[8];
        arrayRota[8] = aux;
        
        aux = arrayRota[9];
        arrayRota[9] = guarda;
        
        // For per mostrar l´array que ha rotat
        for (int j = 0; j < arrayRota.length; j++){
            System.out.print(arrayRota[j] + " ");
        }
        System.out.println();
    }
}
