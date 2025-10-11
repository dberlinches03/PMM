class ListaTareas () {

    private var tareas: MutableList<Tarea> = mutableListOf()
    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }
    fun eliminarTarea(id: Int) {
        tareas.removeIf { it.id == id } // Busca la tarea cuyo id coincida
    }
    fun mostrarTareas() {
        for (tarea in tareas) {
            tarea.mostrarInfo()
        }
    }
    fun buscarTareas(id: Int): Tarea? {
        return tareas.find { it.id == id } // Busca la tarea por el id si no la encuentra devuelve null
    }
    fun tareasCompletadas() {
        tareas.forEach { tarea ->
            if (tarea.estaCompletada()) {
                tarea.mostrarInfo()
            }
        }
    }
}