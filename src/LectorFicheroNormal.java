import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LectorFicheroNormal {
    public static Set<Alumno> leerFichero(String archivo) {
        Map<String, List<Double>> alumnosMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] dato = linea.split(";");

                if(dato.length == 2) {
                    String nombre = dato[0];
                    double nota = Double.parseDouble(dato[1]);

                    //Busca si el nombre existe como clave en el Map
                    //Si no exixste crea una nueva lista vacía, la añade al Map y la devuelve
                    //Si existe devuelve la lista y añade nota
                    alumnosMap.computeIfAbsent(nombre, k -> new ArrayList<>()).add(nota);
                }
            }
            System.out.println("\uD83D\uDCC3 Archivo " + "\033[4m" + archivo + "\033[0m" + " leído correctamente ✔✔✔");
        } catch (IOException e) {
            System.out.println("✘✘✘ Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        //Convertimos el Map a Set
        Set<Alumno> alumnos1 = new HashSet<>();
        //Recorre cada entrada de Map, entry = nombre + lista de notas
        for (Map.Entry<String, List<Double>> entry : alumnosMap.entrySet()) {
            //getKey devuelve el nombre y getValue devuelve la lista de notas que se añaden al Set
            alumnos1.add(new Alumno(entry.getKey(), entry.getValue()));
        }
        return alumnos1;
    }
}
