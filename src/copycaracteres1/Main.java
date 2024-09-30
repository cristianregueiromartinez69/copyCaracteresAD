
package copycaracteres1;

import javax.swing.JOptionPane;

/**
 * clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		//instanciamos los objetos, introducimos el path y llamamos al metodo de la clase
		Ficheros fichero1 = new Ficheros();

		String rutaOrigen = JOptionPane.showInputDialog("Introduce la ruta de origen: ");
		String rutaOrigen2 = JOptionPane.showInputDialog("Introduce la ruta del destino: ");

		fichero1.readWriteFile(rutaOrigen, rutaOrigen2);
	}

}


