import java.util.Scanner;

public class Test {
	static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

	public static void main(String argv[]) {
		String cadena = "";
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
			// Completar
			try {
				cadena = leerLineaOK(sc);
				System.out.println("OK");
				if(cadena == ".") {
				}
			} catch (BurradasNOException e) {
				System.out.println(e.getMessage());
			}
		}while(!cadena.contentEquals("."));

		System.out.println("Fin del programa");
	}

	public static String leerLineaOK(Scanner sc) throws BurradasNOException {
		// completar
		String cadenaLeida = sc.nextLine();
		for (int i = 0; i < tpalabros.length; i++) {
			if ( cadenaLeida.contains(tpalabros[i])) {
				throw new BurradasNOException();
			}
		}
					
		return cadenaLeida;
	}
}