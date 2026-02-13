import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Set;

public class EscritorFicheroBinario {
    public static void escribirFicheroBinario(Set<Alumno> alumnos, String archivoBinario) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoBinario))) {
            oos.writeObject(alumnos);
            System.out.println("\uD83D\uDCBE Archivo " + "\033[4m" + archivoBinario + "\033[0m" + " creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}
