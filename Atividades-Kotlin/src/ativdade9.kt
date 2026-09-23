fun main() {
    val tarefa = listOf("Estudar Kotlin", "Fazer exercícios", "Comprar pão", "Limpar casa")

    for ((index, tarefa) in tarefa.withIndex()) {
        println("Tarefa ${index + 1}: $tarefa")
    }
}