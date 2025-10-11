class Tarea (
    var id: Int,
    private var titulo: String,
    private var descripcion: String
){
    private var completada: Boolean = false

    fun marcarComoCompletada() {
        completada = true
    }
    fun mostrarInfo() {
        val estado = if (completada) "[V]" else "[ ]"
        println("$estado $id - $titulo ($descripcion)")
    }

    fun estaCompletada(): Boolean {
        return completada
    }
}