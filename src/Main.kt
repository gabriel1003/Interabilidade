
fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    println("Hello world")
    val calc1 = Operacao()
    val resposta1 = calc1.soma(2, 6)
    println(resposta1)

    val resposta2 = calc1.divisao(3, 2)
    println(resposta2)
}