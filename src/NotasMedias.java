import java.util.Objects;
import java.util.Set;

public class NotasMedias {
    private String nombre;
    private double media;

    public NotasMedias(String nombre, double media) {
        this.nombre = nombre;
        this.media = media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "NotasMedias{" +
                "nombre='" + nombre + '\'' +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotasMedias that = (NotasMedias) o;
        return Double.compare(media, that.media) == 0 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, media);
    }
}
