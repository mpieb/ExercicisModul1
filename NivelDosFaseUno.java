package niveldosfaseuno;
public class NivelDosFaseUno {
public static void main(String[] args) {
    // Declaració de les variables, double, int, float i String
    double d = 3.1416;
    int i;
    float f;
    String s;
    
    // Conversió "cast"
    i = (int)d;
    f = (float)d;
    s = ""+d;
    
    // Mostra les dades per consola de les conversions cast
    System.out.println(d + " double");
    System.out.println(i + " int");
    System.out.println(f + " float");
    System.out.println(s + " String");
    }
}
