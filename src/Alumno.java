import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Alumno implements Serializable {
    private String nombre;
    private List<Double> notas;

    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(notas, alumno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, notas);
    }
}
