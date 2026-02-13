import java.util.HashSet;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Set;

public class LectorFicheroBinario {
    public static void leerFicheroBinario(String archivoBinario) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoBinario))) {
            Set<Alumno> alumno = (HashSet<Alumno>) ois.readObject();
            for(Alumno alumno1 : alumno){
                System.out.println(alumno1.getNombre() + " ➡\uFE0F " + alumno1.getNotas());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
    }
}
