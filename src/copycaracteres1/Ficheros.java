package copycaracteres1;

import java.io.*;

/**
 * clase ficheros donde leemos el contenido de un fichero y lo pegamos en otro
 *
 * @author cristian
 * @version 1.0
 */
public class Ficheros {

    /**
     * metodo para leer un fichero y copiar el contenido de este en otro
     *
     * @param path el fichero origen
     * @param path2 el fichero destino
     */
    public void readWriteFile(String path, String path2) {

        try {

            File file = new File(path);
            File file2 = new File(path2);

            //comprobamos si existe y si es un fichero
            if (file.exists() && file.isFile()) {
                FileReader fr = new FileReader(file);
                FileWriter fw = new FileWriter(file2);

                int finish;

                //mientras el int sea diferente de menos 1, escribes
                while ((finish = fr.read()) != -1) {

                    fw.write(finish);

                }

                fr.close();
                fw.close();
            } else {
                System.out.println("El archivo no existe o no es un archivo");
            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }

    }

}
