/**
 * Autómata No. 1
 * Todas las cadenas con una a exactamente
 */
public class main {

    public static String cadena;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //establecemos el valor de la cadena a evaluar
        //Cadena válida
        cadena = "bcac";
        //Cadena no válida
        //cadena = "abaaac";
        //creamos objeto y mandamos cómo parámetro  la cadena que se evaluará
        Automata1 miAut = new Automata1(cadena);
    }//fin del método main
    
}//fin de la clase main