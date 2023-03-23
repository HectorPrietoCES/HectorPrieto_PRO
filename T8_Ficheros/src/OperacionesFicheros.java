import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OperacionesFicheros {

    public void consolilla() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero a evaluar");
        String fichero = lecturaTeclado.next();
        Path path = Paths.get(fichero);
        File file2 = new File(String.valueOf(path));
        System.out.println("Is file? " +file2.isFile());
        System.out.println("Is Directory? " +file2.isDirectory());
        System.out.println("Is Hidden? " +file2.isHidden());
        System.out.println("Is Execute? " +file2.canExecute());
        System.out.println("Is Read? " +file2.canRead());
        System.out.println("Is Write? " +file2.canWrite());
        System.out.println("Is .lenght? " +file2.length());
        System.out.println("Is Parent? " +file2.getParent());


    }

    /*public void creacionFichero(){

        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");
        File fileFinal = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\aaaaa.txt");
        boolean esFichero = fileFinal.isFile();
        boolean esCarpeta = file.isDirectory();
        String rutaFichero = file.getAbsolutePath();
        String nombreFichero = file.getName();
        try {
            fileFinal.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(nombreFichero);
        System.out.println(esFichero);
        System.out.println(esCarpeta);
        System.out.println(rutaFichero);
    }*/
}
