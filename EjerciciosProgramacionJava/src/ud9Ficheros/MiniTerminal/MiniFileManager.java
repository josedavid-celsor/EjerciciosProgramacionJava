package ud9Ficheros.MiniTerminal;

import java.io.File;
import java.util.Arrays;

/**
 * Clase que tendra los atributos y metodos que necesite para realizar las
 * distintas operaciones relacionadas con la gention de archivos
 *
 * @author José David Rosales Rios
 * @version 14-03-2022
 *
 */
public class MiniFileManager {

    private String ruta;
    private File f = new File("");
    private File auxiliar;

    /**
     * Getter para obetener la carpeta actual
     *
     * @return devuelve la carpeta en la que se esta actualmente
     */
    public String getPWD() {
        return f.getAbsolutePath();
    }

    public boolean changeDir(String dir) {
        //f = new File(dir);
        String rutaAbsoluta = f.getAbsolutePath();
        if (dir.equals("..")) {
            ruta = rutaAbsoluta.substring(0, rutaAbsoluta.lastIndexOf("/"));
            f = new File(ruta);
            return true;
        } else if (dir.startsWith("/")) {
            auxiliar = new File(dir);
            if (auxiliar.exists()) {
                f = new File(dir);
                return true;
            } else {
                System.err.println("No existe la ruta indicada");
                return false;
            }
        } else if (!dir.startsWith("/")) {
            ruta = f.getAbsolutePath() + "/" + dir;
            auxiliar = new File(ruta);
            if (auxiliar.exists()) {
                f = new File(ruta);
                return true;
            } else {
                System.err.println("No existe la ruta indicada");
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Metodo para imprimir la lista de archivos y directorios
     *
     * @param info indica si queremos el tamaño y la fecha de modificaición de
     * un directorio o archivo
     */
    public void printList(boolean info) {
        File[] arrayarchivos = f.listFiles();
        Arrays.sort(arrayarchivos);
        if (info) {
            for (int i = 0; i < arrayarchivos.length; i++) {
                if (arrayarchivos[i].isDirectory()) {

                    System.out.println("[*]" + arrayarchivos[i].getName() + arrayarchivos[i].length() + arrayarchivos[i].lastModified());
                } else {
                    System.out.println("[A]" + arrayarchivos[i].getName() + arrayarchivos[i].length() + arrayarchivos[i].lastModified());
                }

            }
        } else {
            for (int i = 0; i < arrayarchivos.length; i++) {
                if (arrayarchivos[i].isDirectory()) {
                    System.out.println("[*]" + arrayarchivos[i].getName());
                } else {
                    System.out.println("[A]" + arrayarchivos[i].getName());
                }

            }

        }
    }

    public boolean mkdir(String dir) {
        ruta = f.getAbsolutePath() + "/" + dir;
        auxiliar = new File(ruta);
        if (dir.startsWith("/")) {
            ruta = dir;
            String rutaAbsoluta = f.getAbsolutePath();
            String r = rutaAbsoluta.substring(0, rutaAbsoluta.lastIndexOf("/"));
            auxiliar = new File(r);
            if (auxiliar.exists()) {
                f = new File(ruta);
                return f.mkdir();
            } else {
                System.err.println("No existe la ruta indicada");
                return false;
            }
        } else {
            f = new File(ruta);
            return f.mkdir();
        }
    }
    /*public boolean removeFile(){
    }
    public void help(){
    }*/
}
