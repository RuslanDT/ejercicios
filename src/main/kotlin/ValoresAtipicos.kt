fun main() {
    val valores: MutableList<Double> = emptyList<Double>().toMutableList()

    valores.add(45.05)
    valores.add(89.2)
    valores.add(50.0)
    valores.add(44.69)
    valores.add(39.87)
    valores.add(10.8)
    valores.add(63.33)
    valores.add(64.21)
    valores.add(72.65)
    valores.add(1.0)
    valores.add(-10.0)
    valores.add(100.0)
    valores.add(120.0)
    valores.add(42.0)
    valores.add(49.9)
    valores.add(57.55)
    valores.add(51.3)
    valores.add(56.4)
    valores.add(77.77)

    valores.sort()
    println(atipicos(valores))
}

fun atipicos(valores: List<Double>): List<Double> {
    val a: MutableList<Double> = mutableListOf()
    val sup: List<Double>
    val inf: List<Double>
    if (valores.size % 2 == 0) {
        sup = valores.subList(0, valores.size / 2)
        inf = valores.subList(valores.size / 2, valores.size)

    } else {
        sup = valores.subList(0, valores.size / 2)
        inf = valores.subList(valores.size / 2 + 1, valores.size)
    }
    val q1 = mediana(sup)
    println("1 Cuartil: $q1")
    val q3 = mediana(inf)
    println("3 Cuartil: $q3")
    val riq = q3 - q1

    val qInf = q1 - 1.5 * riq

    val qExt = q3 + 1.5 * riq
    println("Valores atipicos:")
    for (i in valores.indices) {
        if (valores[i] < qInf || valores[i] > qExt) a.add(valores[i])
    }
    return a
}

fun mediana(data: List<Double>): Double {
    return if (data.size % 2 == 0) (data[data.size / 2] + data[data.size / 2 - 1]) / 2
    else data[data.size / 2]
}