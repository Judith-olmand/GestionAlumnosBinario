import java.util.*;

public class ListarAlumnosMedia {
    public static void listarAlumnosMedia(List<NotasMedias> notasMedias) {
        notasMedias.sort(Comparator.comparing(NotasMedias::getNombre));
        for (NotasMedias notasMedias1 : notasMedias) {
            if (notasMedias1.getMedia() >= 5){
                System.out.printf("\uD83C\uDF89 %s ➡️ %.2f\n", notasMedias1.getNombre(), notasMedias1.getMedia());
            } else {
                System.out.printf("\uD83D\uDC4E\uD83C\uDFFC %s ➡️ %.2f\n", notasMedias1.getNombre(), notasMedias1.getMedia());
            }
        }
    }

    public static void listarAlumnosMediaOrdenada(List<NotasMedias> notasMedias) {
        notasMedias.sort(Comparator.comparing(NotasMedias::getMedia).reversed());
        for (NotasMedias notasMedias1 : notasMedias) {
            if (notasMedias1.getMedia() >= 5){
                System.out.printf("\uD83C\uDF89 %s ➡️ %.2f\n", notasMedias1.getNombre(), notasMedias1.getMedia());
            } else {
                System.out.printf("\uD83D\uDC4E\uD83C\uDFFC %s ➡️ %.2f\n", notasMedias1.getNombre(), notasMedias1.getMedia());
            }
        }
    }
}
