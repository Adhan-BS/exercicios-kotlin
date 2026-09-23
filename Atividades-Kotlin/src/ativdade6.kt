fun main() {
    var soma = 0

    for (i in 2..50 step 2) {
        soma += i
    }
// eu provavelmnete ia usar if (i % 2 == 0)

    println("Soma dos numeros pares de 2 a 50: $soma")
}