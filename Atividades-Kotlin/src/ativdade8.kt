fun main() {
    val pratos = listOf("Pizza", "Hambúrguer", "Lasanha", "Sushi", "Escondidinho")
    val itemEsgotado = "Pizza"

    for (item in pratos) {
        if (item == itemEsgotado) {
            continue
        }
        println("Item disponível: $item")
    }
}