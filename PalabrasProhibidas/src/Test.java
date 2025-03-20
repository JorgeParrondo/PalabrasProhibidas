import java.util.Scanner;

/**
 * @author Jorge Parrondo
 * Clase Test que permite leer líneas de entrada y verifica que no contengan palabras prohibidas.
 */
public class Test {
    /**
     * Lista de palabras prohibidas en los mensajes.
     */
    static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

    /**
     * Método principal que maneja la entrada del usuario y verifica el contenido del mensaje.
     * 
     * @param argv Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String argv[]) {
        String cadena = "";
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
            try {
                cadena = leerLineaOK(sc);
                System.out.println("OK");
            } catch (BurradasNOException e) {
                System.out.println(e.getMessage());
            }
        } while (!cadena.contentEquals("."));
        
        System.out.println("Fin del programa");
        sc.close();
    }

    /**
     * Método que lee una línea de entrada del usuario y verifica que no contenga palabras prohibidas.
     *
     * @param sc Scanner para leer la entrada del usuario.
     * @return La línea de texto ingresada por el usuario si es válida.
     * @throws BurradasNOException Si la línea contiene una palabra prohibida.
     */
    public static String leerLineaOK(Scanner sc) throws BurradasNOException {
        String cadenaLeida = sc.nextLine();
        for (String palabra : tpalabros) {
            if (cadenaLeida.contains(palabra)) {
                throw new BurradasNOException();
            }
        }
        return cadenaLeida;
    }
}
