import kotlin.math.max
import kotlin.math.min

// Descripción: Programa para calcular la edad máxima y mínima entre los alumnos y mostrar todas las edades ingresadas.
// Autor: ChatGPT
// Fecha de creación: 2024-03-21
// Fecha de última modificación: 2024-03-21

fun main() {
    println("Ingrese la cantidad de alumnos en el salón:")
    val cantidadAlumnos = readLine()?.toInt()

    if (cantidadAlumnos == null || cantidadAlumnos <= 0) {
        println("Cantidad de alumnos no válida. Por favor, ingrese un número entero positivo.")
        return
    }

    var edadMaxima = Int.MIN_VALUE
    var edadMinima = Int.MAX_VALUE
    var todasLasEdades = ""

    println("Ingrese la edad de cada alumno:")

    for (i in 1..cantidadAlumnos) {
        print("Edad del alumno $i: ")
        val edad = readLine()?.toIntOrNull()

        if (edad == null) {
            println("Edad no válida. Por favor, ingrese un número entero.")
            return
        }

        // Comparar la edad actual con edadMaxima y actualizar si es necesario
        if (edad > edadMaxima) {
            edadMaxima = edad
        }

        // Comparar la edad actual con edadMinima y actualizar si es necesario
        if (edad < edadMinima) {
            edadMinima = edad
        }

        // Concatenar las edades separadas por coma
        todasLasEdades += "$edad"
        if (i < cantidadAlumnos) {
            todasLasEdades += ", "
        }
    }

    println("=== Edades ===")
    println("Máximo = $edadMaxima")
    println("Mínimo = $edadMinima")
    println("Todos = $todasLasEdades")
}
