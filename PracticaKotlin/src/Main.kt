fun main() {
    println("Bienvenido a tus tareas")
    println("Introduce tu nombre: ")
    val nombre = readLine() ?: "Usuario"

    val listaTareas = ListaTareas()
    val usuario = Usuario(nombre, listaTareas)
    usuario.saludar()
    var salir: Boolean = false


    while (!salir) {
        println("\n¿Qué quieres hacer?")
        println("1. Agregar tarea")
        println("2. Mostrar tareas")
        println("3. Marcar tarea como completada")
        println("4. Eliminar tarea")
        println("5. Ver solo tareas completadas")
        println("6. Salir")
        print("Elige una opción (1-6): ")
        val opcion = readLine()?.toIntOrNull()
        when(opcion) {
            1 -> {
                print("Titulo de la tarea: ")
                val titulo = readLine() ?: ""
                print("Descripción de la tarea: ")
                val descripcion = readLine() ?: ""
                val id = (1..10).random()
                val tarea = Tarea(id, titulo,descripcion)
                listaTareas.agregarTarea(tarea)
                println("Tarea agregada con ID $id")
            }
            2 -> {
                println("Todas tus tareas: ")
                listaTareas.mostrarTareas()
            }
            3 -> {
                print("ID de la tarea a marcar como completada: ")
                val id = readLine()?.toIntOrNull()
                val tarea = id?.let { listaTareas.buscarTareas(it) }
                if (tarea != null) {
                    tarea.marcarComoCompletada()
                    println("Tarea marcada como completada")
                } else {
                    println("No se encontró la tarea con ese ID")
                }
            }
            4 -> {
                print("ID de la tarea a eliminar: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    listaTareas.eliminarTarea(id)
                    println("Tarea eliminada")
                }
            }
            5 -> {
                println("Tareas completadas: ")
                listaTareas.tareasCompletadas()
            }
            6 -> {
                println("Hasta luego, $nombre. !Buena suerte con tus tareas!")
                salir = false
                break
            }
            else -> println("Opción no válida. Intenta de nuevo.")
        }
    }
}