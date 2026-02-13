import java.util.List;

public class MostrarMejorAlumnoMedia {
    public static void muestraMejorAlumnoMedia(List<NotasMedias> notasMedias) {
        String[] nombre = new String[notasMedias.size()];
        double[] media = new double[notasMedias.size()];
        media[0] = 0;
        nombre[0] = "";
        int i = 0;

        for (NotasMedias notasMedias1 : notasMedias) {
            if (notasMedias1.getMedia() > media[0]){
                nombre[i] = notasMedias1.getNombre();
                media[i] = notasMedias1.getMedia();
            } else if (notasMedias1.getMedia() == media[0]){
                i++;
                nombre[i] = notasMedias1.getNombre();
                media[i] = notasMedias1.getMedia();
            }
        }
        for (int j = 0; j <= i; j++) {
            System.out.println("\uD83D\uDCAF " + nombre[j] + " ➡️ " + media[j]);
        }
    }
}
