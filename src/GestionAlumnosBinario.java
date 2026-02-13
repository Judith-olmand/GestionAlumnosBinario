import java.util.*;

public class GestionAlumnosBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomArchivo = "alumnos.txt";
        String nomArchivoBinario = "alumnos.dat";
        int opcion = -1;
        boolean opCorrecta;

        System.out.println("\uD83D\uDCC4 Lectura del fichero original con alumnos y notas");
        Set<Alumno> alumnos = LectorFicheroNormal.leerFichero(nomArchivo);

        System.out.println("\uD83D\uDCDD Escritura del fichero binario");
        EscritorFicheroBinario.escribirFicheroBinario(alumnos,nomArchivoBinario);

        List<NotasMedias> notasMedias =  CalcularNotaMedia.calcularNotaMedia(alumnos);

        do {
            do {
                opCorrecta = false;
                try {
                    System.out.println();
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Leer el archivo binario");
                    System.out.println("2. Mostrar la nota media de cada alumno");
                    System.out.println("3. Listado de alumnos ordenados por nota media.");
                    System.out.println("4. Listado de alumnos aprobados.");
                    System.out.println("5. Nombre del alumno o los alumnos con la mejor nota media.");
                    System.out.println("0. Salir");
                    opcion = sc.nextInt();
                    sc.nextLine();
                    opCorrecta = true;
                } catch (InputMismatchException e) {
                    System.out.println("⛔ Error. Elija una opción válida.");
                    sc.nextLine();
                }
            }while (!opCorrecta);

            switch (opcion) {
                case 1:
                    System.out.println();
                    LectorFicheroBinario.leerFicheroBinario(nomArchivoBinario);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("NOTA MEDIA POR ALUMNO");
                    ListarAlumnosMedia.listarAlumnosMedia(notasMedias);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("NOTA MEDIA POR ALUMNO ORDENADOS");
                    ListarAlumnosMedia.listarAlumnosMediaOrdenada(notasMedias);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("ALUMNOS APROBADOS");
                    ListarAprobados.listaAprobados(notasMedias);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("MEJOR/ES ALUMNO/S");
                    MostrarMejorAlumnoMedia.muestraMejorAlumnoMedia(notasMedias);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
                case 0:
                    System.out.println("Hasta pronto!!!");
                    break;
            }
        }while (opcion != 0);
    }
}