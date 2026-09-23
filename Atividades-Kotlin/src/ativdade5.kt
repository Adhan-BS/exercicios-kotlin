fun main() {
    var tentativas = 1

    do {
        println("Tentativa $tentativas: Validando credenciais...")
        tentativas++
    } while (tentativas <= 3)

    println("Conta bloqueada por segurança.")
}