# 📚 Sistema de Gestión de Alumnos con Archivos Binarios

Aplicación Java para gestionar información de alumnos y sus calificaciones mediante archivos binarios serializados.

## 📋 Descripción

Este programa lee información de alumnos desde un archivo de texto, calcula sus notas medias, almacena los datos en un archivo binario y proporciona diversas opciones de consulta y visualización.

## 🎯 Funcionalidades

1. **Leer archivo binario** - Muestra todos los alumnos y sus notas almacenadas
2. **Mostrar nota media** - Calcula y muestra la nota media de cada alumno
3. **Listado ordenado** - Alumnos ordenados por nota media (descendente)
4. **Alumnos aprobados** - Filtra y muestra solo alumnos con media ≥ 5
5. **Mejor/es alumno/s** - Identifica al alumno o alumnos con la mejor nota media

## 🏗️ Estructura del Proyecto

```
├── GestionAlumnosBinario.java      # Clase principal con menú interactivo
├── Alumno.java                     # Modelo de datos del alumno
├── NotasMedias.java                # Modelo para almacenar nombre y media
├── LectorFicheroNormal.java        # Lee el archivo de texto inicial
├── EscritorFicheroBinario.java     # Serializa datos a archivo binario
├── LectorFicheroBinario.java       # Lee el archivo binario
├── CalcularNotaMedia.java          # Calcula las medias de los alumnos
├── ListarAlumnosMedia.java         # Muestra listados de alumnos
├── ListarAprobados.java            # Filtra alumnos aprobados
└── MostrarMejorAlumnoMedia.java    # Identifica al mejor alumno
```

## 📄 Formato del Archivo de Entrada

El archivo `alumnos.txt` debe seguir este formato:

```
NombreAlumno;Nota
Juan;7.5
María;8.0
Juan;6.5
María;9.0
```

- Cada línea contiene el nombre del alumno y una nota separados por punto y coma (`;`)
- Un mismo alumno puede aparecer múltiples veces con diferentes notas

## 🚀 Ejecución

### Requisitos

- Java JDK 8 o superior
- Archivo `alumnos.txt` en el directorio del proyecto

### Compilación

```bash
javac *.java
```

### Ejecución

```bash
java GestionAlumnosBinario
```

## 💾 Archivos Generados

- **alumnos.dat** - Archivo binario serializado con los objetos `Alumno`

## 🔧 Características Técnicas

- **Serialización**: Uso de `ObjectOutputStream` y `ObjectInputStream`
- **Colecciones**: `Set<Alumno>` para evitar duplicados, `List<NotasMedias>` para cálculos
- **Ordenación**: Comparadores personalizados con `Comparator`
- **Manejo de errores**: Validación de entrada con `try-catch`
- **Interfaz**: Menú interactivo con emojis para mejor UX

## 📊 Ejemplo de Uso

```
📄 Lectura del fichero original con alumnos y notas
📃 Archivo alumnos.txt leído correctamente ✔✔✔
📝 Escritura del fichero binario
💾 Archivo alumnos.dat creado correctamente.

Selecciona una opción:
1. Leer el archivo binario
2. Mostrar la nota media de cada alumno
3. Listado de alumnos ordenados por nota media.
4. Listado de alumnos aprobados.
5. Nombre del alumno o los alumnos con la mejor nota media.
0. Salir
```

## 🎓 Notas de Implementación

- Los alumnos con media ≥ 5 se marcan con 🎉
- Los alumnos con media < 5 se marcan con 👎🏼
- El programa maneja empates en la mejor nota media
- Las notas medias se muestran con 2 decimales de precisión

## 📝 Licencia

Proyecto educativo para aprendizaje de Java y manejo de archivos.

## 👤 Autor

Proyecto desarrollado como ejercicio de programación en Java.
