fun main(){
    diccionario("Hola muy buenas a todos wapisimos")
    diccionario("Vamonos a la casa")
    diccionario("Maldita sea")
}

fun diccionario(frase : String){
    var palabras = 0
    var p = ""
    var longitud = 0
    var size = frase.length
    var cont = 0

    println("La frase es -> $frase")

    for (x in frase){
        cont++
        when{
            x == ' ' -> {
                println("$p con $longitud letras")
                palabras += 1
                p = ""
                longitud = 0
            }
            size == cont -> {
                p += x
                longitud ++
                println("$p con $longitud letras")
                palabras += 1
                p = ""
                longitud = 0
            }
            else -> {
                p += x
                longitud ++
            }
        }
    }

    println("El número de palbras es: $palabras")
    println("------------------------------------------------")
}