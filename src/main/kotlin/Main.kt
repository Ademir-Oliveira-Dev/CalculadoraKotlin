import kotlin.math.pow

fun main(args: Array<String>) {
   /* 1 - Criem um novo projeto que se chama Calculadora
            2 - Implemente uma função para cada operação aritmética

    - Adição
    - Subtração
    - Multiplicação
    - Divisão

    3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
    4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número,
     com qualquer expoente.

    */

    println("Qual o calculo você quer realizar? (adição, subtração, " +
            "divisão, multiplicação ou potência)")
    var calc = readLine()!!
    var num1 = 0
    var num2 = 0
    var contador = 0

    while (contador == 0){

    if (calc == "adição"){
        soma(num1, num2)
    }else if (calc == "subtração"){
        subt (num1, num2)
    }else if (calc == "multiplicação") {
        mult(num1, num2)
    }else if (calc == "divisão"){
        divi (num1, num2)
    }else if (calc == "potência"){
        println("Digite o valor para potência: ")
        var num = readLine()!!.toDouble()
        pote (num)
    }else{
        println("Operação Inválida!")
        }
        contador++
    }
}

fun soma (num1: Int, num2: Int){
    println("Digite os valores para somar: ")
    print("Primeiro valor: ")
    var num1 = readLine()!!.toInt()
    print("Segundo valor: ")
    var num2 = readLine()!!.toInt()
    var resultado = num1 + num2
    println("$num1 + $num2 = $resultado")
}

fun subt (num1: Int, num2: Int){
    println("Digite os valores para subtrair: ")
    print("Primeiro valor: ")
    var num1 = readLine()!!.toInt()
    print("Segundo valor: ")
    var num2 = readLine()!!.toInt()
    var resultado = num1 - num2
    println("$num1 - $num2 = $resultado")
}

fun mult (num1: Int, num2: Int){
    println("Digite os valores para multiplicação: ")
    print("Primeiro valor: ")
    var num1 = readLine()!!.toInt()
    print("Segundo valor: ")
    var num2 = readLine()!!.toInt()
    var resultado = num1 * num2
    println("$num1 x $num2 = $resultado")
}

fun divi (num1: Int, num2: Int){
    println("Digite os valores para divisão: ")
    print("Primeiro valor: ")
    var num1 = readLine()!!.toInt()
    print("Segundo valor: ")
    var num2 = readLine()!!.toInt()
    var resultado = num1 / num2
    println("$num1 / $num2 = ${resultado.toDouble()}")
}

fun pote (num:Double){
    var resultado = num.pow(2)
    println("$num ao quadrado = $resultado")
}
