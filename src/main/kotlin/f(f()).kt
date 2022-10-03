fun aleatorio() : Int{
    return (0..100).random()
}

fun main(){
    var lista = listOf(561, 982, 777, 420, 964, 333, 650)

    println(operacion(lista, { aleatorio() }))
}

fun operacion(lista : List<Int>, num : () -> Int) : MutableList<Int>{
    var l : MutableList<Int> = emptyList<Int>().toMutableList()
    
    println("Se multiplica por ${num.invoke()}")

    if (l != null) {
        lista.map {
            l.add(it*num.invoke())
        }
    }
    return l
}



