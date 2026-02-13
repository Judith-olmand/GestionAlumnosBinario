import java.util.List;

public class ListarAprobados {
    public static void listaAprobados(List<NotasMedias> notasMedias){
        for (NotasMedias notasMedias1 : notasMedias) {
            if (notasMedias1.getMedia() >= 5){
                System.out.println(notasMedias1.getNombre() + " \uD83C\uDF89");
            }
        }
    }
}
