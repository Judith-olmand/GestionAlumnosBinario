import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorFichero {
    public static List<Alumno> leerFichero() {
        List<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("alumnos.txt"))){
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] dato = linea.split(";");

                if(dato.length == 2) {
                    String nombre = dato[0];
                    double nota = Double.parseDouble(dato[1]);

                    alumnos.add(new Alumno(nombre, nota));
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        return alumnos;
    }
}
