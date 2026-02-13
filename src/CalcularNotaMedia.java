import java.util.*;

public class CalcularNotaMedia {
    public static List<NotasMedias> calcularNotaMedia(Set<Alumno> alumno) {
        List<NotasMedias> notasMedias = new ArrayList<>();

        double media;
        double suma;
        int contador;

        for (Alumno alumno1 : alumno) {
            contador = 0;
            suma = 0;
            for (Double nota : alumno1.getNotas()) {
                suma += nota;
                contador++;
            }
            media = suma / contador;
            notasMedias.add(new NotasMedias(alumno1.getNombre(), media));
        }
        return notasMedias;
    }
}
