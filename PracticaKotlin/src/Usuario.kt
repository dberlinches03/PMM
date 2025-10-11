class Usuario(private var nombre: String,
    private var lista: ListaTareas
) {
    fun saludar() {
        println("Hola, soy $nombre. Estas son mis tareas pendientes: ")
        lista.mostrarTareas()
    }
}